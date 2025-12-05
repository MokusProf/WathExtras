package net.mokus.tmmore.block;

import dev.doctor4t.trainmurdermystery.block.PanelBlock;
import dev.doctor4t.trainmurdermystery.index.TMMBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mokus.tmmore.TMMore;
import net.mokus.tmmore.block.custom.*;
import net.mokus.tmmore.item.ModItems;

public class ModBlocks {


    public static final Block CANDELABRE = registerBlock("candelabre",
            new CandelabreBlock(ParticleTypes.SMALL_FLAME,
                    AbstractBlock.Settings.create().breakInstantly().luminance(CandelabreBlock.STATE_TO_LUMINANCE).
                            sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WALL_CANDELABRE = registerBlock("wall_candelabre",
            new WallCandelabreBlock(ParticleTypes.SMALL_FLAME,
                    AbstractBlock.Settings.create().breakInstantly().luminance(WallCandelabreBlock.STATE_TO_LUMINANCE).
                            sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY).dropsLike(ModBlocks.CANDELABRE)));

    public static final Block BLEACHED_PLANKS = registerBlock("bleached_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block BLEACHED_STAIRS = registerBlock("bleached_stairs",
            new StairsBlock(ModBlocks.BLEACHED_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block BLEACHED_SLAB = registerBlock("bleached_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block BLEACHED_WALL = registerBlock("bleached_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block BLEACHED_PANEL = registerBlock("bleached_panel",
            new PanelBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block BLEACHED_FENCE = registerBlock("bleached_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));


    public static final Block KHAKI_RIVETED_HULL_SMALL = registerBlock("khaki_riveted_hull_small",
            new Block(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block KHAKI_RIVETED_HULL_SMALL_SLAB = registerBlock("khaki_riveted_hull_small_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block KHAKI_RIVETED_HULL_SMALL_STAIRS = registerBlock("khaki_riveted_hull_small_stairs",
            new StairsBlock(ModBlocks.KHAKI_RIVETED_HULL_SMALL.getDefaultState(),AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block KHAKI_RIVETED_HULL_SMALL_WALL = registerBlock("khaki_riveted_hull_small_wall",
            new WallBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block KHAKI_RIVETED_HULL_SMALL_PANEL = registerBlock("khaki_riveted_hull_small_panel",
            new PanelBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block ANTHRACITE_RIVETED_HULL_SMALL = registerBlock("anthracite_riveted_hull_small",
            new Block(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block ANTHRACITE_RIVETED_HULL_SMALL_SLAB = registerBlock("anthracite_riveted_hull_small_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block ANTHRACITE_RIVETED_HULL_SMALL_STAIRS = registerBlock("anthracite_riveted_hull_small_stairs",
            new StairsBlock(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL.getDefaultState(),AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block ANTHRACITE_RIVETED_HULL_SMALL_WALL = registerBlock("anthracite_riveted_hull_small_wall",
            new WallBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block ANTHRACITE_RIVETED_HULL_SMALL_PANEL = registerBlock("anthracite_riveted_hull_small_panel",
            new PanelBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block BLACK_RIVETED_HULL_SMALL = registerBlock("black_riveted_hull_small",
            new Block(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block BLACK_RIVETED_HULL_SMALL_SLAB = registerBlock("black_riveted_hull_small_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block BLACK_RIVETED_HULL_SMALL_STAIRS = registerBlock("black_riveted_hull_small_stairs",
            new StairsBlock(ModBlocks.BLACK_RIVETED_HULL_SMALL.getDefaultState(),AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block BLACK_RIVETED_HULL_SMALL_WALL = registerBlock("black_riveted_hull_small_wall",
            new WallBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block BLACK_RIVETED_HULL_SMALL_PANEL = registerBlock("black_riveted_hull_small_panel",
            new PanelBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block MAROON_RIVETED_HULL_SMALL = registerBlock("maroon_riveted_hull_small",
            new Block(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block MAROON_RIVETED_HULL_SMALL_SLAB = registerBlock("maroon_riveted_hull_small_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block MAROON_RIVETED_HULL_SMALL_STAIRS = registerBlock("maroon_riveted_hull_small_stairs",
            new StairsBlock(ModBlocks.MAROON_RIVETED_HULL_SMALL.getDefaultState(),AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block MAROON_RIVETED_HULL_SMALL_WALL = registerBlock("maroon_riveted_hull_small_wall",
            new WallBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block MAROON_RIVETED_HULL_SMALL_PANEL = registerBlock("maroon_riveted_hull_small_panel",
            new PanelBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block MUNTZ_RIVETED_HULL_SMALL = registerBlock("muntz_riveted_hull_small",
            new Block(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block MUNTZ_RIVETED_HULL_SMALL_SLAB = registerBlock("muntz_riveted_hull_small_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block MUNTZ_RIVETED_HULL_SMALL_STAIRS = registerBlock("muntz_riveted_hull_small_stairs",
            new StairsBlock(ModBlocks.MUNTZ_RIVETED_HULL_SMALL.getDefaultState(),AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block MUNTZ_RIVETED_HULL_SMALL_WALL = registerBlock("muntz_riveted_hull_small_wall",
            new WallBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block MUNTZ_RIVETED_HULL_SMALL_PANEL = registerBlock("muntz_riveted_hull_small_panel",
            new PanelBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block NAVY_RIVETED_HULL_SMALL = registerBlock("navy_riveted_hull_small",
            new Block(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block NAVY_RIVETED_HULL_SMALL_SLAB = registerBlock("navy_riveted_hull_small_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block NAVY_RIVETED_HULL_SMALL_STAIRS = registerBlock("navy_riveted_hull_small_stairs",
            new StairsBlock(ModBlocks.NAVY_RIVETED_HULL_SMALL.getDefaultState(),AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block NAVY_RIVETED_HULL_SMALL_WALL = registerBlock("navy_riveted_hull_small_wall",
            new WallBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block NAVY_RIVETED_HULL_SMALL_PANEL = registerBlock("navy_riveted_hull_small_panel",
            new PanelBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block WHITE_RIVETED_HULL_SMALL = registerBlock("white_riveted_hull_small",
            new Block(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block WHITE_RIVETED_HULL_SMALL_SLAB = registerBlock("white_riveted_hull_small_slab",
            new SlabBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block WHITE_RIVETED_HULL_SMALL_STAIRS = registerBlock("white_riveted_hull_small_stairs",
            new StairsBlock(ModBlocks.WHITE_RIVETED_HULL_SMALL.getDefaultState(),AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block WHITE_RIVETED_HULL_SMALL_WALL = registerBlock("white_riveted_hull_small_wall",
            new WallBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final  Block WHITE_RIVETED_HULL_SMALL_PANEL = registerBlock("white_riveted_hull_small_panel",
            new PanelBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));

    // Normal Moquette Blocks
    public static final Block BLACK_MOQUETTE = registerBlock("black_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block CYAN_MOQUETTE = registerBlock("cyan_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block GRAY_MOQUETTE = registerBlock("gray_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block GREEN_MOQUETTE = registerBlock("green_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_BLUE_MOQUETTE = registerBlock("light_blue_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_GRAY_MOQUETTE = registerBlock("light_gray_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block LIME_MOQUETTE = registerBlock("lime_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block MAGENTA_MOQUETTE = registerBlock("magenta_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block ORANGE_MOQUETTE = registerBlock("orange_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block PINK_MOQUETTE = registerBlock("pink_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block PURPLE_MOQUETTE = registerBlock("purple_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block WHITE_MOQUETTE = registerBlock("white_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block YELLOW_MOQUETTE = registerBlock("yellow_moquette",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).strength(-1.0f,3600000.0f)));

    // Start Carpets
    public static final Block BLACK_MOQUETTE_CARPET = registerBlock("black_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block CYAN_MOQUETTE_CARPET = registerBlock("cyan_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block GRAY_MOQUETTE_CARPET = registerBlock("gray_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block GREEN_MOQUETTE_CARPET = registerBlock("green_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_BLUE_MOQUETTE_CARPET = registerBlock("light_blue_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_GRAY_MOQUETTE_CARPET = registerBlock("light_gray_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block LIME_MOQUETTE_CARPET = registerBlock("lime_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.LIME_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block MAGENTA_MOQUETTE_CARPET = registerBlock("magenta_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block ORANGE_MOQUETTE_CARPET = registerBlock("orange_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block PINK_MOQUETTE_CARPET = registerBlock("pink_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PINK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block PURPLE_MOQUETTE_CARPET = registerBlock("purple_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block WHITE_MOQUETTE_CARPET = registerBlock("white_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block YELLOW_MOQUETTE_CARPET = registerBlock("yellow_moquette_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CARPET).strength(-1.0f,3600000.0f)));

    // Dark marbles
    public static final Block DARK_MARBLE_TILE = registerBlock("dark_marble_tile",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS).strength(-1.0f,3600000.0f)));


    // Striped Carpets
    public static final Block BLACK_STRIPED_CARPET_BLOCK = registerBlock("black_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block CYAN_STRIPED_CARPET_BLOCK = registerBlock("cyan_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block GRAY_STRIPED_CARPET_BLOCK = registerBlock("gray_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block GREEN_STRIPED_CARPET_BLOCK = registerBlock("green_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    //public static final Block LIGHT_BLUE_STRIPED_CARPET_BLOCK = registerBlock("light_blue_striped_carpet_block",
    //        new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_GRAY_STRIPED_CARPET_BLOCK = registerBlock("light_gray_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block LIME_STRIPED_CARPET_BLOCK = registerBlock("lime_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block ORANGE_STRIPED_CARPET_BLOCK = registerBlock("orange_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block PURPLE_STRIPED_CARPET_BLOCK = registerBlock("purple_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block WHITE_STRIPED_CARPET_BLOCK = registerBlock("white_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block YELLOW_STRIPED_CARPET_BLOCK = registerBlock("yellow_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block BLUE_STRIPED_CARPET_BLOCK = registerBlock("blue_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block RED_STRIPED_CARPET_BLOCK = registerBlock("red_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));
    public static final Block BROWN_STRIPED_CARPET_BLOCK = registerBlock("brown_striped_carpet_block",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).strength(-1.0f,3600000.0f)));

    // Striped Carpets
    public static final Block BLACK_STRIPED_CARPET = registerBlock("black_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block CYAN_STRIPED_CARPET = registerBlock("cyan_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block GRAY_STRIPED_CARPET = registerBlock("gray_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block GREEN_STRIPED_CARPET = registerBlock("green_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    // public static final Block LIGHT_BLUE_STRIPED_CARPET = registerBlock("light_blue_striped_carpet",
    //        new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block LIGHT_GRAY_STRIPED_CARPET = registerBlock("light_gray_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block LIME_STRIPED_CARPET = registerBlock("lime_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block ORANGE_STRIPED_CARPET = registerBlock("orange_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block PURPLE_STRIPED_CARPET = registerBlock("purple_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block WHITE_STRIPED_CARPET = registerBlock("white_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block YELLOW_STRIPED_CARPET = registerBlock("yellow_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block BLUE_STRIPED_CARPET = registerBlock("blue_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block RED_STRIPED_CARPET = registerBlock("red_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));
    public static final Block BROWN_STRIPED_CARPET = registerBlock("brown_striped_carpet",
            new CarpetBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CARPET).strength(-1.0f,3600000.0f)));


    // Plushies
    public static final Block NORA_PLUSH = registerBlock("nora_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL).nonOpaque()));
    public static final Block DAVIDANDROCKET_PLUSH = registerBlock("davidandrocket_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).nonOpaque()));
    public static final Block DUCKAMOLY_PLUSH = registerBlock("duckamoly_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block PICKLE_PLUSH = registerBlock("pickle_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).nonOpaque()));
    public static final Block VERID__PLUSH = registerBlock("verid__plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block WILLO_PLUSH = registerBlock("willo_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block MOKUS_PLUSH = registerBlock("mokus_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).nonOpaque()));
    public static final Block DOOGEY_PLUSH = registerBlock("doogey_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block SQUID_PLUSH = registerBlock("squid_plush",
            new PlushBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));

    public static final Block CANDY_CANE_BLOCK = registerBlock("candy_cane_block",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));

    // Benches
    public static final Block PALE_BENCH = registerBlock("pale_bench",
            new BenchBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block QUEEN_BENCH = registerBlock("queen_bench",
            new BenchBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block THORN_BENCH = registerBlock("thorn_bench",
            new BenchBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block STEEL_BENCH = registerBlock("steel_bench",
            new BenchBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Double Hull
    public static final Block ANTHRACITE_RIVETED_HULL = registerBlock("anthracite_riveted_hull",
            new DoubleHullBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block BLACK_RIVETED_HULL = registerBlock("black_riveted_hull",
            new DoubleHullBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block KHAKI_RIVETED_HULL = registerBlock("khaki_riveted_hull",
            new DoubleHullBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block MAROON_RIVETED_HULL = registerBlock("maroon_riveted_hull",
            new DoubleHullBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block MUNTZ_RIVETED_HULL = registerBlock("muntz_riveted_hull",
            new DoubleHullBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block NAVY_RIVETED_HULL = registerBlock("navy_riveted_hull",
            new DoubleHullBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));
    public static final Block WHITE_RIVETED_HULL = registerBlock("white_riveted_hull",
            new DoubleHullBlock(AbstractBlock.Settings.copy(TMMBlocks.DARK_STEEL)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TMMore.MOD_ID,name),block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TMMore.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }




    // Creative Item Group Striped Carpets
    public static final RegistryKey<ItemGroup> STRIPED_CARPET_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(TMMore.MOD_ID, "striped_carpet_group"));
    public static final ItemGroup STRIPED_CARPET = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.WHITE_STRIPED_CARPET_BLOCK))
            .displayName(Text.translatable("buildGroup.Striped_Carpet"))
            .build();

    // Creative Item Group Moquettes
    public static final RegistryKey<ItemGroup> MOQUETTES_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(TMMore.MOD_ID, "moquette_group"));
    public static final ItemGroup MOQUETTES = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.YELLOW_MOQUETTE))
            .displayName(Text.translatable("buildGroup.Moquettes"))
            .build();

    public static final RegistryKey<ItemGroup> TMMORE_BUILDING_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(TMMore.MOD_ID, "tmmore_building_group"));
    public static final ItemGroup TMMORE_BUILDING = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.KHAKI_RIVETED_HULL_SMALL))
            .displayName(Text.translatable("buildGroup.TMMore_Building"))
            .build();


    public static void init(){

        TMMore.LOGGER.info("Weaving carpets and making blocks for " + TMMore.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, TMMORE_BUILDING_KEY, TMMORE_BUILDING);
        ItemGroupEvents.modifyEntriesEvent(ModBlocks.TMMORE_BUILDING_KEY).register(TMMORE_BLOCKS -> {
            TMMORE_BLOCKS.add(ModBlocks.KHAKI_RIVETED_HULL);
            TMMORE_BLOCKS.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(ModBlocks.KHAKI_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(ModBlocks.ANTHRACITE_RIVETED_HULL);
            TMMORE_BLOCKS.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(ModBlocks.ANTHRACITE_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(ModBlocks.BLACK_RIVETED_HULL);
            TMMORE_BLOCKS.add(ModBlocks.BLACK_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(ModBlocks.BLACK_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(ModBlocks.BLACK_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(ModBlocks.BLACK_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(ModBlocks.BLACK_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(ModBlocks.MAROON_RIVETED_HULL);
            TMMORE_BLOCKS.add(ModBlocks.MAROON_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(ModBlocks.MAROON_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(ModBlocks.MAROON_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(ModBlocks.MAROON_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(ModBlocks.MAROON_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(ModBlocks.MUNTZ_RIVETED_HULL);
            TMMORE_BLOCKS.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(ModBlocks.MUNTZ_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(ModBlocks.NAVY_RIVETED_HULL);
            TMMORE_BLOCKS.add(ModBlocks.NAVY_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(ModBlocks.NAVY_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(ModBlocks.NAVY_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(ModBlocks.NAVY_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(ModBlocks.NAVY_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(ModBlocks.WHITE_RIVETED_HULL);
            TMMORE_BLOCKS.add(ModBlocks.WHITE_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(ModBlocks.WHITE_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(ModBlocks.WHITE_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(ModBlocks.WHITE_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(ModBlocks.WHITE_RIVETED_HULL_SMALL_WALL);

            TMMORE_BLOCKS.add(ModBlocks.BLEACHED_PLANKS);
            TMMORE_BLOCKS.add(ModBlocks.BLEACHED_PANEL);
            TMMORE_BLOCKS.add(ModBlocks.BLEACHED_STAIRS);
            TMMORE_BLOCKS.add(ModBlocks.BLEACHED_SLAB);
            TMMORE_BLOCKS.add(ModBlocks.BLEACHED_WALL);
            TMMORE_BLOCKS.add(ModBlocks.BLEACHED_FENCE);
            TMMORE_BLOCKS.add(ModBlocks.CANDY_CANE_BLOCK);

            //ETC NON BLOCK CONFORMING BLOCKS
            TMMORE_BLOCKS.add(ModItems.CANDELABRE_ITEM);
            TMMORE_BLOCKS.add(ModBlocks.PALE_BENCH);
            TMMORE_BLOCKS.add(ModBlocks.QUEEN_BENCH);
            TMMORE_BLOCKS.add(ModBlocks.STEEL_BENCH);
            TMMORE_BLOCKS.add(ModBlocks.THORN_BENCH);

            //Plushies
            TMMORE_BLOCKS.add(ModBlocks.NORA_PLUSH);
            TMMORE_BLOCKS.add(ModBlocks.DAVIDANDROCKET_PLUSH);
            TMMORE_BLOCKS.add(ModBlocks.PICKLE_PLUSH);
            TMMORE_BLOCKS.add(ModBlocks.DUCKAMOLY_PLUSH);
            TMMORE_BLOCKS.add(ModBlocks.VERID__PLUSH);
            TMMORE_BLOCKS.add(ModBlocks.WILLO_PLUSH);
            TMMORE_BLOCKS.add(ModBlocks.MOKUS_PLUSH);
            TMMORE_BLOCKS.add(ModBlocks.DOOGEY_PLUSH);
            TMMORE_BLOCKS.add(ModBlocks.SQUID_PLUSH);
                });

        Registry.register(Registries.ITEM_GROUP, MOQUETTES_KEY, MOQUETTES);
        ItemGroupEvents.modifyEntriesEvent(ModBlocks.MOQUETTES_KEY).register(BUILDING_BLOCKS -> {
            // Normal Moquette Blocks
            BUILDING_BLOCKS.add(ModBlocks.BLACK_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.CYAN_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.GRAY_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.GREEN_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.LIGHT_BLUE_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.LIGHT_GRAY_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.LIME_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.MAGENTA_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.ORANGE_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.PINK_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.PURPLE_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.WHITE_MOQUETTE);
            BUILDING_BLOCKS.add(ModBlocks.YELLOW_MOQUETTE);

            // Carpets
            BUILDING_BLOCKS.add(ModBlocks.BLACK_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.CYAN_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.GRAY_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.GREEN_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.LIGHT_BLUE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.LIGHT_GRAY_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.LIME_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.MAGENTA_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.ORANGE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.PINK_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.PURPLE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.WHITE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ModBlocks.YELLOW_MOQUETTE_CARPET);
        });

        Registry.register(Registries.ITEM_GROUP, STRIPED_CARPET_KEY, STRIPED_CARPET);
        ItemGroupEvents.modifyEntriesEvent(ModBlocks.STRIPED_CARPET_KEY).register(STRIPED_CARPET -> {
            // Striped Carpets
            // Blocks
            STRIPED_CARPET.add(ModBlocks.BLACK_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.BLUE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.CYAN_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.GRAY_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.GREEN_STRIPED_CARPET_BLOCK);
            // STRIPED_CARPET.add(ModBlocks.LIGHT_BLUE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.LIGHT_GRAY_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.LIME_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.ORANGE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.PURPLE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.WHITE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.YELLOW_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.RED_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ModBlocks.BROWN_STRIPED_CARPET_BLOCK);

            // Carpets
            STRIPED_CARPET.add(ModBlocks.BLACK_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.CYAN_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.GRAY_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.GREEN_STRIPED_CARPET);
            // STRIPED_CARPET.add(ModBlocks.LIGHT_BLUE_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.LIGHT_GRAY_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.LIME_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.ORANGE_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.PURPLE_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.WHITE_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.YELLOW_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.BLUE_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.RED_STRIPED_CARPET);
            STRIPED_CARPET.add(ModBlocks.BROWN_STRIPED_CARPET);
        });
    }
}
