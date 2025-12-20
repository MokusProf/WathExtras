package net.mokus.wathextras.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class DoubleHullBlock extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<DoubleHullBlock.PartType> PART = EnumProperty.of("part", PartType.class);

    public DoubleHullBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(PART, PartType.LEFT));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING,PART);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getHorizontalPlayerFacing();
        BlockPos pos = ctx.getBlockPos();
        World world = ctx.getWorld();

        BlockPos rightPos = pos.offset(direction.rotateYClockwise());

        if (world.getBlockState(rightPos).canReplace(ctx)) {
            return this.getDefaultState().with(FACING, direction).with(PART, PartType.LEFT);
        }

        return null;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (!world.isClient) {
            Direction facing = state.get(FACING);
            BlockPos rightPos = pos.offset(facing.rotateYClockwise());

            world.setBlockState(rightPos, state.with(PART, PartType.RIGHT), Block.NOTIFY_ALL);
        }
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient) {
            PartType part = state.get(PART);
            Direction facing = state.get(FACING);

            if (part == PartType.LEFT) {
                BlockPos rightPos = pos.offset(facing.rotateYClockwise());
                world.breakBlock(rightPos, false);
            } else {
                BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
                BlockState leftState = world.getBlockState(leftPos);
                if (leftState.isOf(this)) {
                    world.breakBlock(leftPos, !player.isCreative());
                }
            }
        }

        return super.onBreak(world, pos, state, player);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        PartType part = state.get(PART);
        Direction facing = state.get(FACING);

        if (part == PartType.LEFT) {
            Direction rightDir = facing.rotateYClockwise();
            if (direction == rightDir && !world.getBlockState(pos.offset(rightDir)).isOf(this)) {
                return net.minecraft.block.Blocks.AIR.getDefaultState();
            }
        } else {
            Direction leftDir = facing.rotateYCounterclockwise();
            if (direction == leftDir && !world.getBlockState(pos.offset(leftDir)).isOf(this)) {
                return net.minecraft.block.Blocks.AIR.getDefaultState();
            }
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    public enum PartType implements StringIdentifiable {
        LEFT("left"),
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
