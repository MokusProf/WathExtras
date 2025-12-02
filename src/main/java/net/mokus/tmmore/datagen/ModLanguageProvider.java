package net.mokus.tmmore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mokus.tmmore.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Menus Etc.
        translationBuilder.add(ModBlocks.MOQUETTES_KEY, "TMMore: Moquettes!");
        translationBuilder.add(ModBlocks.STRIPED_CARPET_KEY, "TMMore: Striped Carpets!");
        // translationBuilder.add(ModBlocks.Dark_Marble_Key, "MM!: Dark Marble");

        // Full blocks
        translationBuilder.add(ModBlocks.BLACK_MOQUETTE, "Black Moquette");
        translationBuilder.add(ModBlocks.CYAN_MOQUETTE, "Cyan Moquette");
        translationBuilder.add(ModBlocks.GRAY_MOQUETTE, "Gray Moquette");
        translationBuilder.add(ModBlocks.GREEN_MOQUETTE, "Green Moquette");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_MOQUETTE, "Light Blue Moquette");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_MOQUETTE, "Light Gray Moquette");
        translationBuilder.add(ModBlocks.LIME_MOQUETTE, "Lime Moquette");
        translationBuilder.add(ModBlocks.MAGENTA_MOQUETTE, "Magenta Moquette");
        translationBuilder.add(ModBlocks.ORANGE_MOQUETTE, "Orange Moquette");
        translationBuilder.add(ModBlocks.PINK_MOQUETTE, "Pink Moquette");
        translationBuilder.add(ModBlocks.PURPLE_MOQUETTE, "Purple Moquette");
        translationBuilder.add(ModBlocks.WHITE_MOQUETTE, "White Moquette");
        translationBuilder.add(ModBlocks.YELLOW_MOQUETTE, "Yellow Moquette");

        // Carpet Variants
        translationBuilder.add(ModBlocks.BLACK_MOQUETTE_CARPET, "Black Moquette Carpet");
        translationBuilder.add(ModBlocks.CYAN_MOQUETTE_CARPET, "Cyan Moquette Carpet");
        translationBuilder.add(ModBlocks.GRAY_MOQUETTE_CARPET, "Gray Moquette Carpet");
        translationBuilder.add(ModBlocks.GREEN_MOQUETTE_CARPET, "Green Moquette Carpet");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_MOQUETTE_CARPET, "Light Blue Moquette Carpet");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_MOQUETTE_CARPET, "Light Gray Moquette Carpet");
        translationBuilder.add(ModBlocks.LIME_MOQUETTE_CARPET, "Lime Moquette Carpet");
        translationBuilder.add(ModBlocks.MAGENTA_MOQUETTE_CARPET, "Magenta Moquette Carpet");
        translationBuilder.add(ModBlocks.ORANGE_MOQUETTE_CARPET, "Orange Moquette Carpet");
        translationBuilder.add(ModBlocks.PINK_MOQUETTE_CARPET, "Pink Moquette Carpet");
        translationBuilder.add(ModBlocks.PURPLE_MOQUETTE_CARPET, "Purple Moquette Carpet");
        translationBuilder.add(ModBlocks.WHITE_MOQUETTE_CARPET, "White Moquette Carpet");
        translationBuilder.add(ModBlocks.YELLOW_MOQUETTE_CARPET, "Yellow Moquette Carpet");

        // Striped Carpets
        // Blocks
        translationBuilder.add(ModBlocks.BLACK_STRIPED_CARPET_BLOCK , "Black Striped Carpet Block");
        translationBuilder.add(ModBlocks.BLUE_STRIPED_CARPET_BLOCK , "Blue Striped Carpet Block");
        translationBuilder.add(ModBlocks.CYAN_STRIPED_CARPET_BLOCK , "Cyan Striped Carpet Block");
        translationBuilder.add(ModBlocks.GRAY_STRIPED_CARPET_BLOCK , "Gray Striped Carpet Block");
        translationBuilder.add(ModBlocks.GREEN_STRIPED_CARPET_BLOCK , "Green Striped Carpet Block");
        // translationBuilder.add(ModBlocks.LIGHT_BLUE_STRIPED_CARPET_BLOCK , "Light Blue Striped Carpet Block");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_STRIPED_CARPET_BLOCK , "Light Gray Striped Carpet Block");
        translationBuilder.add(ModBlocks.LIME_STRIPED_CARPET_BLOCK , "Lime Striped Carpet Block");
        translationBuilder.add(ModBlocks.ORANGE_STRIPED_CARPET_BLOCK , "Orange Striped Carpet Block");
        translationBuilder.add(ModBlocks.PURPLE_STRIPED_CARPET_BLOCK , "Purple Striped Carpet Block");
        translationBuilder.add(ModBlocks.WHITE_STRIPED_CARPET_BLOCK , "White Striped Carpet Block");
        translationBuilder.add(ModBlocks.YELLOW_STRIPED_CARPET_BLOCK , "Yellow Striped Carpet Block");
        translationBuilder.add(ModBlocks.RED_STRIPED_CARPET_BLOCK , "Red Striped Carpet Block");
        translationBuilder.add(ModBlocks.BROWN_STRIPED_CARPET_BLOCK , "Brown Striped Carpet Block");

        // Carpets
        translationBuilder.add(ModBlocks.BLACK_STRIPED_CARPET,"Black Striped Carpet");
        translationBuilder.add(ModBlocks.BLUE_STRIPED_CARPET,"Blue Striped Carpet");
        translationBuilder.add(ModBlocks.CYAN_STRIPED_CARPET,"Cyan Striped Carpet");
        translationBuilder.add(ModBlocks.GRAY_STRIPED_CARPET,"Gray Striped Carpet");
        translationBuilder.add(ModBlocks.GREEN_STRIPED_CARPET,"Green Striped Carpet");
        // translationBuilder.add(ModBlocks.LIGHT_BLUE_STRIPED_CARPET,"Light Blue Striped Carpet");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_STRIPED_CARPET,"Light Gray Striped Carpet");
        translationBuilder.add(ModBlocks.LIME_STRIPED_CARPET,"Lime Striped Carpet");
        translationBuilder.add(ModBlocks.ORANGE_STRIPED_CARPET,"Orange Striped Carpet");
        translationBuilder.add(ModBlocks.PURPLE_STRIPED_CARPET,"Purple Striped Carpet");
        translationBuilder.add(ModBlocks.WHITE_STRIPED_CARPET,"White Striped Carpet");
        translationBuilder.add(ModBlocks.YELLOW_STRIPED_CARPET,"Yellow Striped Carpet");
        translationBuilder.add(ModBlocks.RED_STRIPED_CARPET,"Red Striped Carpet");
        translationBuilder.add(ModBlocks.BROWN_STRIPED_CARPET,"Brown Striped Carpet");

        // Dark Marble
        translationBuilder.add(ModBlocks.DARK_MARBLE_TILE, "Dark Marble Tiles");
    }
}
