package net.mokus.wathextras.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class WreathBlock extends HorizontalFacingBlock {
    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public static final MapCodec<WreathBlock> CODEC = createCodec(WreathBlock::new);

    public WreathBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape EAST_SHAPE = Block.createCuboidShape(0.0, 2.0, 1.0, 2.0, 16.0, 15.0);
    private static final VoxelShape WEST_SHAPE = Block.createCuboidShape(14.0, 2.0, 1.0, 16.0, 16.0, 15.0);
    private static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 2.0, 0.0, 16.0, 16.0, 2.0);
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 2.0, 14.0, 16.0, 16.0, 16.0);

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);

        return switch (dir){
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
    return CODEC;
    }
}
