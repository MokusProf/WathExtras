package net.mokus.tmmore;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.mokus.tmmore.block.ModBlocks;

public class TMMoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.NORA_PLUSH,
                ModBlocks.DAVIDANDROCKET_PLUSH,
                ModBlocks.DUCKAMOLY_PLUSH,
                ModBlocks.PICKLE_PLUSH,
                ModBlocks.VERID__PLUSH,
                ModBlocks.WILLO_PLUSH,
                ModBlocks.MOKUS_PLUSH,
                ModBlocks.DOOGEY_PLUSH,
                ModBlocks.SQUID_PLUSH,
                ModBlocks.PENCIL_PLUSH,
                ModBlocks.INDIGO_PLUSH,
                ModBlocks.WALL_CANDELABRE,
                ModBlocks.PALE_BENCH,
                ModBlocks.QUEEN_BENCH,
                ModBlocks.THORN_BENCH,
                ModBlocks.STEEL_BENCH,
                ModBlocks.BUTTERFLY_DOOR_BLOCK,
                ModBlocks.KILL_BLOCK_PANEL,
                ModBlocks.KILL_BLOCK);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.ROOF_LAMP);

    }
}
