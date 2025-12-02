package net.mokus.tmmore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.mokus.tmmore.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {

        // Moquettes
        generator.registerWoolAndCarpet(ModBlocks.BLACK_MOQUETTE,ModBlocks.BLACK_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.CYAN_MOQUETTE,ModBlocks.CYAN_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.GRAY_MOQUETTE,ModBlocks.GRAY_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.GREEN_MOQUETTE,ModBlocks.GREEN_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.LIGHT_BLUE_MOQUETTE,ModBlocks.LIGHT_BLUE_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.LIGHT_GRAY_MOQUETTE,ModBlocks.LIGHT_GRAY_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.LIME_MOQUETTE,ModBlocks.LIME_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.MAGENTA_MOQUETTE,ModBlocks.MAGENTA_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.ORANGE_MOQUETTE,ModBlocks.ORANGE_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.PINK_MOQUETTE,ModBlocks.PINK_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.PURPLE_MOQUETTE,ModBlocks.PURPLE_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.WHITE_MOQUETTE,ModBlocks.WHITE_MOQUETTE_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.YELLOW_MOQUETTE,ModBlocks.YELLOW_MOQUETTE_CARPET);

        // Striped Carpets
        generator.registerWoolAndCarpet(ModBlocks.BLACK_STRIPED_CARPET_BLOCK,ModBlocks.BLACK_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.BLUE_STRIPED_CARPET_BLOCK,ModBlocks.BLUE_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.CYAN_STRIPED_CARPET_BLOCK,ModBlocks.CYAN_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.GRAY_STRIPED_CARPET_BLOCK,ModBlocks.GRAY_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.GREEN_STRIPED_CARPET_BLOCK,ModBlocks.GREEN_STRIPED_CARPET);
        // blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.LIGHT_BLUE_STRIPED_CARPET_BLOCK,ModBlocks.LIGHT_BLUE_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.LIGHT_GRAY_STRIPED_CARPET_BLOCK,ModBlocks.LIGHT_GRAY_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.LIME_STRIPED_CARPET_BLOCK,ModBlocks.LIME_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.ORANGE_STRIPED_CARPET_BLOCK,ModBlocks.ORANGE_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.PURPLE_STRIPED_CARPET_BLOCK,ModBlocks.PURPLE_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.WHITE_STRIPED_CARPET_BLOCK,ModBlocks.WHITE_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.YELLOW_STRIPED_CARPET_BLOCK,ModBlocks.YELLOW_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.BROWN_STRIPED_CARPET_BLOCK,ModBlocks.BROWN_STRIPED_CARPET);
        generator.registerWoolAndCarpet(ModBlocks.RED_STRIPED_CARPET_BLOCK,ModBlocks.RED_STRIPED_CARPET);

        // Dark Marble
        generator.registerSimpleCubeAll(ModBlocks.DARK_MARBLE_TILE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }


}
