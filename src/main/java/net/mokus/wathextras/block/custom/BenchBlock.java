package net.mokus.wathextras.block.custom;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import dev.doctor4t.wathe.block.HorizontalFacingMountableBlock;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class BenchBlock extends HorizontalFacingMountableBlock {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<PartType> PART = EnumProperty.of("part", PartType.class);

    private static final Map<Direction, VoxelShape> BOUNDING_SHAPES = Maps.newEnumMap(
            ImmutableMap.of(
                    Direction.NORTH,
                    Block.createCuboidShape(1.0, 0.0, 0.0, 16.0, 13.0, 12.0),
                    Direction.SOUTH,
                    Block.createCuboidShape(1.0, 0.0, 4.0, 16.0, 13.0, 16.0),
                    Direction.WEST,
                    Block.createCuboidShape(0.0, 0.0, 1.0, 12.0, 13.0, 16),
                    Direction.EAST,
                    Block.createCuboidShape(4.0, 0.0, 1.0, 16.0, 13.0, 16)
            )
    );

    public BenchBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(PART, PartType.CENTER));
    }


    @Override
    public Vec3d getNorthFacingSitPos(World world, BlockState state, BlockPos pos) {
        return new Vec3d(0.5f, -0.5f, 0.6f);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING,PART);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getHorizontalPlayerFacing();
        BlockPos pos = ctx.getBlockPos();
        BlockPos leftPos = pos.offset(direction.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(direction.rotateYClockwise());
        World world = ctx.getWorld();

        if(world.getBlockState(leftPos).canReplace(ctx) && world.getBlockState(rightPos).canReplace(ctx)){
            return this.getDefaultState().with(FACING, direction).with(PART, PartType.CENTER);
        }

        return null;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if(!world.isClient){
            Direction direction = state.get(FACING);
            BlockPos leftPos = pos.offset(direction.rotateYCounterclockwise());
            BlockPos rightPos = pos.offset(direction.rotateYClockwise());

            world.setBlockState(leftPos,state.with(PART,PartType.LEFT), Block.NOTIFY_ALL);
            world.setBlockState(rightPos,state.with(PART,PartType.RIGHT), Block.NOTIFY_ALL);
        }
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient){
            PartType part = state.get(PART);
            Direction facing = state.get(FACING);
            BlockPos centerPos = getCenterPos(pos,part,facing);

            if (part != PartType.CENTER){
                BlockState centerState = world.getBlockState(centerPos);
                if (centerState.isOf(this)){
                    world.breakBlock(centerPos,!player.isCreative());
                }
            } else {
                BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
                BlockPos rightPos = pos.offset(facing.rotateYClockwise());

                world.breakBlock(leftPos, false);
                world.breakBlock(rightPos, false);
            }
        }
        return super.onBreak(world, pos, state, player);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        PartType part = state.get(PART);
        Direction facing = state.get(FACING);

        if(part == PartType.CENTER){
            Direction leftDir = facing.rotateYCounterclockwise();
            Direction rightDir = facing.rotateYClockwise();

            if (direction == leftDir && !world.getBlockState(pos.offset(leftDir)).isOf(this)) {
                return Blocks.AIR.getDefaultState();
            }
            if (direction == rightDir && !world.getBlockState(pos.offset(rightDir)).isOf(this)) {
                return Blocks.AIR.getDefaultState();
            }
        } else {
            BlockPos centerPos = getCenterPos(pos, part, facing);
            if (!world.getBlockState(centerPos).isOf(this)) {
                return Blocks.AIR.getDefaultState();
            }
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getBoundingShape(state);
    }

    public static VoxelShape getBoundingShape(BlockState state) {
        return BOUNDING_SHAPES.get(state.get(FACING));
    }

    private static Direction getLeftDirection(Direction facing) {
        return facing.rotateYCounterclockwise();
    }

    private static Direction getRightDirection(Direction facing) {
        return facing.rotateYClockwise();
    }


    private static BlockPos getCenterPos(BlockPos pos, PartType part, Direction facing) {
        return switch (part) {
            case LEFT -> pos.offset(getRightDirection(facing));
            case RIGHT -> pos.offset(getLeftDirection(facing));
            case CENTER -> pos;
        };
    }

    public enum PartType implements StringIdentifiable {
        LEFT("left"),
        CENTER("center"),
        RIGHT("right");

        private final String name;

        PartType(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
            return this.name;
        }
    }
}
