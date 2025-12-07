package net.mokus.tmmore.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class RoofLampBlock extends StackLightBlock {

    public static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 6.0, 2.0, 14.0, 16.0, 14.0);
    public RoofLampBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
