package net.mokus.tmmore.block.custom;

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
        return switch (dir){
            case NORTH -> VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 1.0, 0.2);
            case SOUTH -> VoxelShapes.cuboid(0.0, 0.0, 0.8, 1.0, 1.0, 1.0);
            case EAST -> VoxelShapes.cuboid(0.8, 0.0, 0.0, 1.0, 1.0, 1.0);
            case WEST -> VoxelShapes.cuboid(0.0, 0.0, 0.0, 0.2, 1.0, 1.0);
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
