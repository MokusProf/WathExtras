package net.mokus.wathextras.item.custom;

import dev.doctor4t.wathe.game.GameConstants;
import dev.doctor4t.wathe.index.WatheBlocks;
import dev.doctor4t.wathe.util.AdventureUsable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.mokus.wathextras.block.ModBlocks;

import java.util.HashSet;
import java.util.Set;

// i just copied pasted the crowbar
// very useful comment
public class GlassHammerItem extends Item implements AdventureUsable {

    public GlassHammerItem(Settings settings) {
        super(settings);
    }

    private final Set<BlockPos> connected = new HashSet<>();

    private boolean isGlass(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        return state.isOf(WatheBlocks.GOLDEN_GLASS_PANEL);
    }

    private boolean matches(BlockState state, Block block, Direction facing) {
        return state.getBlock() == block &&
                state.contains(FacingBlock.FACING) &&
                state.get(FacingBlock.FACING) == facing;
    }

    //very cool code i made but dont remember making
    public void replaceGlass(World world, BlockPos currentPos) {
        if (connected.contains(currentPos)) return;
        connected.add(currentPos);

        BlockState currentState = world.getBlockState(currentPos);
        Block currentBlock = currentState.getBlock();
        Direction currentFacing = currentState.get(FacingBlock.FACING);

        world.setBlockState(currentPos, ModBlocks.BROKEN_GOLDEN_GLASS_PANEL.getDefaultState().with(FacingBlock.FACING, currentFacing), 3);

        BlockPos leftPos = currentPos;
        BlockPos rightPos = currentPos;
        BlockPos upPos = currentPos;
        BlockPos downPos = currentPos;

        switch (currentFacing) {
            case SOUTH -> {
                leftPos  = currentPos.add(-1, 0, 0);
                rightPos = currentPos.add(1, 0, 0);
                upPos    = currentPos.add(0, 1, 0);
                downPos  = currentPos.add(0, -1, 0);
            }
            case NORTH -> {
                leftPos  = currentPos.add(1, 0, 0);
                rightPos = currentPos.add(-1, 0, 0);
                upPos    = currentPos.add(0, 1, 0);
                downPos  = currentPos.add(0, -1, 0);
            }
            case EAST -> {
                leftPos  = currentPos.add(0, 0, 1);
                rightPos = currentPos.add(0, 0, -1);
                upPos    = currentPos.add(0, 1, 0);
                downPos  = currentPos.add(0, -1, 0);
            }
            case WEST -> {
                leftPos  = currentPos.add(0, 0, -1);
                rightPos = currentPos.add(0, 0, 1);
                upPos    = currentPos.add(0, 1, 0);
                downPos  = currentPos.add(0, -1, 0);
            }
            case UP -> {
                leftPos  = currentPos.add(-1, 0, 0);
                rightPos = currentPos.add(1, 0, 0);
                upPos    = currentPos.add(0, 0, -1);
                downPos  = currentPos.add(0, 0, 1);
            }
            case DOWN -> {
                leftPos  = currentPos.add(-1, 0, 0);
                rightPos = currentPos.add(1, 0, 0);
                upPos    = currentPos.add(0, 0, 1);
                downPos  = currentPos.add(0, 0, -1);
            }
        }

        if (matches(world.getBlockState(leftPos), currentBlock, currentFacing)) replaceGlass(world, leftPos);
        if (matches(world.getBlockState(rightPos), currentBlock, currentFacing)) replaceGlass(world, rightPos);
        if (matches(world.getBlockState(upPos), currentBlock, currentFacing)) replaceGlass(world, upPos);
        if (matches(world.getBlockState(downPos), currentBlock, currentFacing)) replaceGlass(world, downPos);

        world.syncWorldEvent(2001, currentPos, Block.getRawIdFromState(currentState));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos startPos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();

        connected.clear();

        if (isGlass(world, startPos)) {
            replaceGlass(world, startPos);

            player.swingHand(Hand.MAIN_HAND, true);

            if (!player.isCreative()) {
                player.getItemCooldownManager().set(this, GameConstants.ITEM_COOLDOWNS.get(this));
            }
        }

        return ActionResult.SUCCESS;
    }
}
