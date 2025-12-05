package net.mokus.tmmore.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.mokus.tmmore.block.ModBlocks;
import net.mokus.tmmore.item.ModItems;

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
        translationBuilder.add(ModBlocks.TMMORE_BUILDING_KEY,"TMMore: Building Blocks!");
        translationBuilder.add(ModItems.TMMORE_ITEM_KEY,"TMMore: Items!");
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

        // Plushies
        translationBuilder.add(ModBlocks.NORA_PLUSH,"Nora Plushie");
        translationBuilder.add(ModBlocks.DUCKAMOLY_PLUSH,"Duckamoly Plushie");
        translationBuilder.add(ModBlocks.DAVIDANDROCKET_PLUSH,"DavidandRocket Plushie");
        translationBuilder.add(ModBlocks.PICKLE_PLUSH,"Pickle Plushie");
        translationBuilder.add(ModBlocks.VERID__PLUSH,"Verid__ Plushie");
        translationBuilder.add(ModBlocks.WILLO_PLUSH,"Willofkek Plushie");
        translationBuilder.add(ModBlocks.DOOGEY_PLUSH,"Doogey Plush");
        translationBuilder.add(ModBlocks.MOKUS_PLUSH, "Mokus Plush");
        translationBuilder.add(ModBlocks.SQUID_PLUSH,"Squid Plush");

        //Hull Blocks!
        translationBuilder.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL, "Small Khaki Riveted Hull");
        translationBuilder.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_PANEL, "Small Khaki Riveted Hull Panel");
        translationBuilder.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_STAIRS, "Small Khaki Riveted Hull Stair");
        translationBuilder.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_SLAB, "Small Khaki Riveted Hull Slab");
        translationBuilder.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_WALL, "Small Khaki Riveted Hull Wall");

        translationBuilder.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL, "Small Anthracite Riveted Hull");
        translationBuilder.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_PANEL, "Small Anthracite Riveted Hull Panel");
        translationBuilder.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_STAIRS, "Small Anthracite Riveted Hull Stair");
        translationBuilder.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_SLAB, "Small Anthracite Riveted Hull Slab");
        translationBuilder.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_WALL, "Small Anthracite Riveted Hull Wall");

        translationBuilder.add(ModBlocks.BLACK_RIVETED_HULL_SMALL, "Small Black Riveted Hull");
        translationBuilder.add(ModBlocks.BLACK_RIVETED_HULL_SMALL_PANEL, "Small Black Riveted Hull Panel");
        translationBuilder.add(ModBlocks.BLACK_RIVETED_HULL_SMALL_STAIRS, "Small Black Riveted Hull Stair");
        translationBuilder.add(ModBlocks.BLACK_RIVETED_HULL_SMALL_SLAB, "Small Black Riveted Hull Slab");
        translationBuilder.add(ModBlocks.BLACK_RIVETED_HULL_SMALL_WALL, "Small Black Riveted Hull Wall");

        translationBuilder.add(ModBlocks.MAROON_RIVETED_HULL_SMALL, "Small Maroon Riveted Hull");
        translationBuilder.add(ModBlocks.MAROON_RIVETED_HULL_SMALL_PANEL, "Small Maroon Riveted Hull Panel");
        translationBuilder.add(ModBlocks.MAROON_RIVETED_HULL_SMALL_STAIRS, "Small Maroon Riveted Hull Stair");
        translationBuilder.add(ModBlocks.MAROON_RIVETED_HULL_SMALL_SLAB, "Small Maroon Riveted Hull Slab");
        translationBuilder.add(ModBlocks.MAROON_RIVETED_HULL_SMALL_WALL, "Small Maroon Riveted Hull Wall");

        translationBuilder.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL, "Small Muntz Riveted Hull");
        translationBuilder.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_PANEL, "Small Muntz Riveted Hull Panel");
        translationBuilder.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_STAIRS, "Small Muntz Riveted Hull Stair");
        translationBuilder.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_SLAB, "Small Muntz Riveted Hull Slab");
        translationBuilder.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_WALL, "Small Muntz Riveted Hull Wall");

        translationBuilder.add(ModBlocks.NAVY_RIVETED_HULL_SMALL, "Small Navy Riveted Hull");
        translationBuilder.add(ModBlocks.NAVY_RIVETED_HULL_SMALL_PANEL, "Small Navy Riveted Hull Panel");
        translationBuilder.add(ModBlocks.NAVY_RIVETED_HULL_SMALL_STAIRS, "Small Navy Riveted Hull Stair");
        translationBuilder.add(ModBlocks.NAVY_RIVETED_HULL_SMALL_SLAB, "Small Navy Riveted Hull Slab");
        translationBuilder.add(ModBlocks.NAVY_RIVETED_HULL_SMALL_WALL, "Small Navy Riveted Hull Wall");

        translationBuilder.add(ModBlocks.WHITE_RIVETED_HULL_SMALL, "Small White Riveted Hull");
        translationBuilder.add(ModBlocks.WHITE_RIVETED_HULL_SMALL_PANEL, "Small White Riveted Hull Panel");
        translationBuilder.add(ModBlocks.WHITE_RIVETED_HULL_SMALL_STAIRS, "Small White Riveted Hull Stair");
        translationBuilder.add(ModBlocks.WHITE_RIVETED_HULL_SMALL_SLAB, "Small White Riveted Hull Slab");
        translationBuilder.add(ModBlocks.WHITE_RIVETED_HULL_SMALL_WALL, "Small White Riveted Hull Wall");

        // Planks
        translationBuilder.add(ModBlocks.BLEACHED_PLANKS, "Bleached Planks");
        translationBuilder.add(ModBlocks.BLEACHED_STAIRS, "Bleached Stairs");
        translationBuilder.add(ModBlocks.BLEACHED_FENCE, "Bleached Fence");
        translationBuilder.add(ModBlocks.BLEACHED_PANEL, "Bleached Panel");
        translationBuilder.add(ModBlocks.BLEACHED_SLAB, "Bleached Slab");
        translationBuilder.add(ModBlocks.BLEACHED_WALL, "Bleached Wall");

        translationBuilder.add(ModBlocks.CANDY_CANE_BLOCK,"Candy Cane Block");

        // Items
        translationBuilder.add(ModItems.CANDELABRE_ITEM,"Candelbra");
        translationBuilder.add(ModItems.MILK_GLASS,"Glass of Milk");
        translationBuilder.add(ModItems.STRAWBERRY_MILK_GLASS,"Glass of Strawberry Milk");
        translationBuilder.add(ModItems.CHOCCY_MILK_GLASS,"Glass of Choccy Milk");
        translationBuilder.add(ModItems.CANDY_CANE,"Candy Cane");
        translationBuilder.add(ModItems.BLUE_LOLLIPOP, "Blue Lollipop");
        translationBuilder.add(ModItems.RED_LOLLIPOP, "Red Lollipop");
        translationBuilder.add(ModItems.YELLOW_LOLLIPOP, "Yellow Lollipop");
        translationBuilder.add(ModItems.GREEN_LOLLIPOP, "Green Lollipop");

    }
}
