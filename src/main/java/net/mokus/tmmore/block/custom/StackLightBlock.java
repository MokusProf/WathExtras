package net.mokus.tmmore.block.custom;

import dev.doctor4t.trainmurdermystery.index.TMMProperties;
import dev.doctor4t.trainmurdermystery.index.TMMSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.function.ToIntFunction;

public class StackLightBlock extends Block {
    public static final BooleanProperty LIT = Properties.LIT;
    public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE = state -> state.get(LIT) ? 15 : 0;
    public static final BooleanProperty ACTIVE = TMMProperties.ACTIVE;
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

    public StackLightBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false).with(ACTIVE,true));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, ACTIVE);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!player.shouldCancelInteraction()) {
            boolean lit = state.get(LIT);
            world.setBlockState(pos, state.with(LIT, !lit), Block.NOTIFY_ALL);
            world.playSound(null, pos, TMMSounds.BLOCK_LIGHT_TOGGLE, SoundCategory.BLOCKS, 0.5f, lit ? 1f : 1.2f);
            if (!state.get(ACTIVE)) {
                world.playSound(player, pos, TMMSounds.BLOCK_BUTTON_TOGGLE_NO_POWER, SoundCategory.BLOCKS, 0.1f, 1f);
            }
            return ActionResult.success(world.isClient);
        }
        return super.onUse(state, world, pos, player, hit);
    }

}
