package net.mokus.tmmore.block.custom;

import dev.doctor4t.trainmurdermystery.block.BarrierPanelBlock;
import dev.doctor4t.trainmurdermystery.game.GameConstants;
import dev.doctor4t.trainmurdermystery.game.GameFunctions;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class KillBlockPanel extends BarrierPanelBlock {
    public KillBlockPanel(Settings settings) {
        super(settings);
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        GameFunctions.killPlayer((PlayerEntity) entity,false,null, GameConstants.DeathReasons.FELL_OUT_OF_TRAIN);
        super.onEntityCollision(state, world, pos, entity);
    }
}
