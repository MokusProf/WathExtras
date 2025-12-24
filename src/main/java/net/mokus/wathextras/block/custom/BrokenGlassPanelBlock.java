package net.mokus.wathextras.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class BrokenGlassPanelBlock extends FacingBlock {

    // remove collision cause yes
    public static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0, 0, 12, 16, 16, 16);
    public static final VoxelShape EAST_SHAPE = Block.createCuboidShape(0, 0, 0, 4, 16, 16);
    public static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 4);
    public static final VoxelShape WEST_SHAPE = Block.createCuboidShape(12, 0, 0, 16, 16, 16);
    public static final VoxelShape UP_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 4, 16);
    public static final VoxelShape DOWN_SHAPE = Block.createCuboidShape(0, 12, 0, 16, 16, 16);

    // very smol shape cause sodium nukes my grandmothers house when its 0,0,0,0,0,0,0,0
    public static final VoxelShape NO_SHAPE = Block.createCuboidShape(0, 0, 0, 0, 0, 0.001);

    //blocks states idk
    // true if the block is broken glass respective to facing
    public static final BooleanProperty TOP = BooleanProperty.of("top");
    public static final BooleanProperty BOTTOM = BooleanProperty.of("bottom");
    public static final BooleanProperty RIGHT = BooleanProperty.of("right");
    public static final BooleanProperty LEFT = BooleanProperty.of("left");
    public static final BooleanProperty TOPRIGHT = BooleanProperty.of("topright");
    public static final BooleanProperty TOPLEFT = BooleanProperty.of("topleft");
    public static final BooleanProperty BOTTOMRIGHT = BooleanProperty.of("bottomright");
    public static final BooleanProperty BOTTOMLEFT = BooleanProperty.of("bottomleft");

    public BrokenGlassPanelBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState()
                .with(FACING, Direction.SOUTH)
                .with(TOP, false)
                .with(BOTTOM, false)
                .with(RIGHT, false)
                .with(LEFT, false)
                .with(TOPRIGHT, false)
                .with(TOPLEFT, false)
                .with(BOTTOMRIGHT, false)
                .with(BOTTOMLEFT, false));
    }

    // grr im forced to have this in the code even tho idk what it does
    @Override
    protected MapCodec<? extends FacingBlock> getCodec() {
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case UP -> UP_SHAPE;
            case DOWN -> DOWN_SHAPE;
        };
    }

    // bad code cause ai made the code cause i didnt want to make it but then i had to fix evertthing cause ai is dumb as rocks and doesnt understand how 3d works and ai should die in a hole
    // also code is bad cause im vdumb
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        Direction facing = state.get(FACING);

        Direction rightFacing = facing;
        Direction leftFacing = facing;
        Direction upFacing = Direction.UP;
        Direction downFacing = Direction.DOWN;

        if (facing.getAxis().isHorizontal()) {
            rightFacing = facing.rotateYCounterclockwise();
            leftFacing = facing.rotateYClockwise();
        } else if (facing == Direction.UP || facing == Direction.DOWN) {
            rightFacing = Direction.WEST;
            leftFacing = Direction.EAST;
            upFacing = Direction.SOUTH;
            downFacing = Direction.NORTH;
        }


        java.util.function.Predicate<BlockPos> isSameFacingNeighbor = (BlockPos p) -> {
            BlockState bs = world.getBlockState(p);
            return bs.isOf(this) && bs.get(FACING) == facing;
        };

        BlockPos topPos = pos.offset(upFacing);
        BlockPos bottomPos = pos.offset(downFacing);
        BlockPos leftPos = pos.offset(leftFacing);
        BlockPos rightPos = pos.offset(rightFacing);

        BlockPos topLeftPos = topPos.add(leftPos.getX() - pos.getX(), leftPos.getY() - pos.getY(), leftPos.getZ() - pos.getZ());
        BlockPos topRightPos = topPos.add(rightPos.getX() - pos.getX(), rightPos.getY() - pos.getY(), rightPos.getZ() - pos.getZ());
        BlockPos bottomLeftPos = bottomPos.add(leftPos.getX() - pos.getX(), leftPos.getY() - pos.getY(), leftPos.getZ() - pos.getZ());
        BlockPos bottomRightPos = bottomPos.add(rightPos.getX() - pos.getX(), rightPos.getY() - pos.getY(), rightPos.getZ() - pos.getZ());

        boolean top = isSameFacingNeighbor.test(topPos);
        boolean bottom = isSameFacingNeighbor.test(bottomPos);
        boolean left = isSameFacingNeighbor.test(leftPos);
        boolean right = isSameFacingNeighbor.test(rightPos);
        boolean topLeft = isSameFacingNeighbor.test(topLeftPos);
        boolean topRight = isSameFacingNeighbor.test(topRightPos);
        boolean bottomLeft = isSameFacingNeighbor.test(bottomLeftPos);
        boolean bottomRight = isSameFacingNeighbor.test(bottomRightPos);

        return state.with(TOP, top)
                .with(BOTTOM, bottom)
                .with(LEFT, left)
                .with(RIGHT, right)
                .with(TOPLEFT, topLeft)
                .with(TOPRIGHT, topRight)
                .with(BOTTOMLEFT, bottomLeft)
                .with(BOTTOMRIGHT, bottomRight);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return NO_SHAPE;
    }

    @Override
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        WorldAccess world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        Direction facing = ctx.getSide();
        BlockState neighborState = world.getBlockState(pos.offset(facing.getOpposite()));
        if (!ctx.shouldCancelInteraction() && neighborState.isOf(this)) {
            Direction neighborFacing = neighborState.get(FACING);
            if (!neighborFacing.getAxis().equals(facing.getAxis())) facing = neighborFacing;
        }
        return this.getDefaultState().with(FACING, facing);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, TOP, BOTTOM, LEFT, RIGHT, TOPLEFT, TOPRIGHT, BOTTOMLEFT, BOTTOMRIGHT);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        Direction facing = state.get(FACING);
        if (stateFrom.isOf(this)) {
            Direction fromFacing = stateFrom.get(FACING);
            if (fromFacing.equals(direction)) return facing.equals(direction.getOpposite());
            else if (fromFacing.equals(direction.getOpposite())) return facing.equals(direction);
            else if (fromFacing.equals(facing)) return true;
        }
        return super.isSideInvisible(state, stateFrom, direction);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }

    @Override
    protected int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        return 15;
    }
}
