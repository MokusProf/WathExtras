package net.mokus.wathextras.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ButterflyDoorBlock extends HorizontalFacingBlock {
    public static final BooleanProperty OPEN = Properties.OPEN;
    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    public static final MapCodec<ButterflyDoorBlock> CODEC = createCodec(ButterflyDoorBlock::new);
    private static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 2.0);

    public ButterflyDoorBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(OPEN,false));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);

        VoxelShape NORTH_SHAPE_CLOSED = VoxelShapes.combineAndSimplify(
                VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 1.0, 0.2),
                VoxelShapes.cuboid(0.25,0.9,0,0.75,1.15,0.25),
                BooleanBiFunction.OR);
        VoxelShape SOUTH_SHAPE_CLOSED = VoxelShapes.combineAndSimplify(
                VoxelShapes.cuboid(0.0, 0.0, 0.8, 1.0, 1.0, 1.0),
                VoxelShapes.cuboid(0.25,0.9,0.75,0.75,1.15,1),
                BooleanBiFunction.OR);
        VoxelShape WEST_SHAPE_CLOSED = VoxelShapes.combineAndSimplify(
                VoxelShapes.cuboid(0.0, 0.0, 0.0, 0.2, 1.0, 1.0),
                VoxelShapes.cuboid(0,0.9,0.25,0.25,1.15,0.75),
                BooleanBiFunction.OR);
        VoxelShape EAST_SHAPE_CLOSED = VoxelShapes.combineAndSimplify(
                VoxelShapes.cuboid(0.8, 0.0, 0.0, 1.0, 1.0, 1.0),
                VoxelShapes.cuboid(0.75,0.9,0.25,1,1.15,0.75),
                BooleanBiFunction.OR);

        VoxelShape NORTH_SHAPE_OPEN = VoxelShapes.combineAndSimplify(VoxelShapes.combineAndSimplify(
                NORTH_SHAPE_CLOSED,
                VoxelShapes.cuboid(0.1,0,0,0.9,0.9,1),
                BooleanBiFunction.ONLY_FIRST
        ),
                VoxelShapes.cuboid(0,0.9,0,1,1,0.4),
                BooleanBiFunction.OR
        );
        VoxelShape SOUTH_SHAPE_OPEN = VoxelShapes.combineAndSimplify(VoxelShapes.combineAndSimplify(
                        SOUTH_SHAPE_CLOSED,
                        VoxelShapes.cuboid(0.1,0,0,0.9,0.9,1),
                        BooleanBiFunction.ONLY_FIRST
                ),
                VoxelShapes.cuboid(0,0.9,0.6,1,1,0.8),
                BooleanBiFunction.OR
        );
        VoxelShape EAST_SHAPE_OPEN = VoxelShapes.combineAndSimplify(VoxelShapes.combineAndSimplify(
                        EAST_SHAPE_CLOSED,
                        VoxelShapes.cuboid(0,0,0.1,1,0.9,0.9),
                        BooleanBiFunction.ONLY_FIRST
                ),
                VoxelShapes.cuboid(0.6,0.9,0,0.8,1,1),
                BooleanBiFunction.OR
        );
        VoxelShape WEST_SHAPE_OPEN = VoxelShapes.combineAndSimplify(VoxelShapes.combineAndSimplify(
                        WEST_SHAPE_CLOSED,
                        VoxelShapes.cuboid(0,0,0.1,1,0.9,0.9),
                        BooleanBiFunction.ONLY_FIRST
                ),
                VoxelShapes.cuboid(0.2,0.9,0,0.4,1,1),
                BooleanBiFunction.OR
        );

        if (state.get(OPEN)){
            return switch (dir){
                case NORTH -> NORTH_SHAPE_OPEN;
                case SOUTH -> SOUTH_SHAPE_OPEN;
                case EAST -> EAST_SHAPE_OPEN;
                case WEST -> WEST_SHAPE_OPEN;
                default -> VoxelShapes.fullCube();
            };
        }
        return switch (dir){
            case NORTH -> NORTH_SHAPE_CLOSED;
            case SOUTH -> SOUTH_SHAPE_CLOSED;
            case EAST -> EAST_SHAPE_CLOSED;
            case WEST -> WEST_SHAPE_CLOSED;
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
       builder.add(OPEN, FACING);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit){
        if (!player.shouldCancelInteraction()) {
            boolean open = state.get(OPEN);
            world.setBlockState(pos, state.with(OPEN, !open), Block.NOTIFY_ALL);
            world.playSound(null, pos, SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN, SoundCategory.BLOCKS, 0.5f, open ? 1f : 1.2f);
            return ActionResult.success(world.isClient);
        }
        return super.onUse(state, world, pos, player, hit);
    }
}
