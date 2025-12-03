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
                ModBlocks.WILLO_PLUSH);
    }
}
