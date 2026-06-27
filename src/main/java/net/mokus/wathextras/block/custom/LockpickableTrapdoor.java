package net.mokus.wathextras.block.custom;

import dev.doctor4t.wathe.block_entity.SyncingBlockEntity;
import dev.doctor4t.wathe.index.WatheItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import org.jetbrains.annotations.Nullable;

public class LockpickableTrapdoor extends TrapdoorBlock {
    public static final BooleanProperty LOCKED = BooleanProperty.of("locked");
    public LockpickableTrapdoor(BlockSetType type, Settings settings) {
        super(type, settings);
        this.setDefaultState(
                this.stateManager
                        .getDefaultState()
                        .with(FACING, Direction.NORTH)
                        .with(OPEN, false)
                        .with(HALF, BlockHalf.BOTTOM)
                        .with(POWERED, false)
                        .with(WATERLOGGED, false)
                        .with(LOCKED, false)
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(LOCKED);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        boolean hasLockpick = player.getMainHandStack().isOf(WatheItems.LOCKPICK);
        if (!hasLockpick && !player.isCreative()) {
            return ActionResult.PASS;
        }
        if (player.isCreative()) {
            this.flip(state, world, pos, player);
            boolean nowOpen = (Boolean) world.getBlockState(pos).get(OPEN);
            world.setBlockState(pos, world.getBlockState(pos).with(LOCKED, nowOpen));
            return ActionResult.SUCCESS;
        }
        this.flip(state, world, pos, player);
        if (!world.getBlockTickScheduler().isQueued(pos, this)) {
            world.scheduleBlockTick(pos, this, 100);
        }
        return ActionResult.success(world.isClient);
    }

    private void flip(BlockState state, World world, BlockPos pos, @Nullable PlayerEntity player) {
        BlockState blockState = state.cycle(OPEN);
        world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
        if ((Boolean)blockState.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        this.playToggleSound(player, world, pos, (Boolean)blockState.get(OPEN));
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        boolean lockedOpen = (Boolean) state.get(LOCKED);
        boolean currentlyOpen = (Boolean) state.get(OPEN);
        if (currentlyOpen != lockedOpen) {
            this.flip(state, world, pos, null);
        }
    }
}
