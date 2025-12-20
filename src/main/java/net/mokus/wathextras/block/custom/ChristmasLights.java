package net.mokus.wathextras.block.custom;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.VineBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChristmasLights extends VineBlock {
    private static final VoxelShape UP_SHAPE = Block.createCuboidShape(0.0, 13.0, 0.0, 16.0, 15.0, 16.0);

    private static final VoxelShape EAST_SHAPE = Block.createCuboidShape(0.0, 10.0, 0.0, 2.0, 15.0, 16.0);
    private static final VoxelShape WEST_SHAPE = Block.createCuboidShape(14.0, 10.0, 0.0, 16.0, 15.0, 16.0);
    private static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 10.0, 0.0, 16.0, 15.0, 2.0);
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 10.0, 14.0, 16.0, 15.0, 16.0);
    private final Map<BlockState, VoxelShape> shapesByState;

    public ChristmasLights(Settings settings) {
        super(settings);
        this.shapesByState = ImmutableMap.copyOf(
                this.stateManager
                        .getStates()
                        .stream()
                        .collect(Collectors.toMap(Function.identity(), ChristmasLights::getShapeForState))
        );
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    }

    private static VoxelShape getShapeForState(BlockState state) {
        VoxelShape voxelShape = VoxelShapes.empty();
        if (state.get(UP)) {
            voxelShape = UP_SHAPE;
        }

        if (state.get(NORTH)) {
            voxelShape = VoxelShapes.union(voxelShape, SOUTH_SHAPE);
        }

        if (state.get(SOUTH)) {
            voxelShape = VoxelShapes.union(voxelShape, NORTH_SHAPE);
        }

        if (state.get(EAST)) {
            voxelShape = VoxelShapes.union(voxelShape, WEST_SHAPE);
        }

        if (state.get(WEST)) {
            voxelShape = VoxelShapes.union(voxelShape, EAST_SHAPE);
        }

        return voxelShape.isEmpty() ? VoxelShapes.fullCube() : voxelShape;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.shapesByState.get(state);
    }
}
