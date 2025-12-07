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
import net.mokus.tmmore.util.ModSounds;

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

    // Dark marbles
    public static final Block DARK_MARBLE_TILE = registerBlock("dark_marble_tile",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS).strength(-1.0f,3600000.0f)));
    public static final Block CHECKERED_MARBLE_TILES = registerBlock("checkered_marble_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS).strength(-1.0f,3600000.0f)));
    public static final Block MIXED_MARBLE_TILES = registerBlock("mixed_marble_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS).strength(-1.0f,3600000.0f)));
    public static final Block DEEPWOKEN_TILE = registerBlock("deepwoken_tile",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS).strength(-1.0f,3600000.0f)));

    // Plushies
    public static final Block NORA_PLUSH = registerBlock("nora_plush",
            new PlushBlock(ModSounds.DOOGEY_PLUSH,AbstractBlock.Settings.copy(Blocks.RED_WOOL).nonOpaque()));
    public static final Block DAVIDANDROCKET_PLUSH = registerBlock("davidandrocket_plush",
            new PlushBlock(ModSounds.DOOGEY_PLUSH,AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).nonOpaque()));
    public static final Block DUCKAMOLY_PLUSH = registerBlock("duckamoly_plush",
            new PlushBlock(ModSounds.DOOGEY_PLUSH,AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block PICKLE_PLUSH = registerBlock("pickle_plush",
            new PlushBlock(ModSounds.PICKLE_PLUSH,AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).nonOpaque()));
    public static final Block VERID__PLUSH = registerBlock("verid__plush",
            new PlushBlock(ModSounds.VERID__PLUSH,AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block WILLO_PLUSH = registerBlock("willo_plush",
            new PlushBlock(ModSounds.WILLO_PLUSH,AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block MOKUS_PLUSH = registerBlock("mokus_plush",
            new PlushBlock(ModSounds.DOOGEY_PLUSH,AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).nonOpaque()));
    public static final Block DOOGEY_PLUSH = registerBlock("doogey_plush",
            new PlushBlock(ModSounds.DOOGEY_PLUSH,AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block SQUID_PLUSH = registerBlock("squid_plush",
            new PlushBlock(ModSounds.DOOGEY_PLUSH,AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block PENCIL_PLUSH = registerBlock("pencil_plush",
            new PlushBlock(ModSounds.DOOGEY_PLUSH,AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block INDIGO_PLUSH = registerBlock("indigo_plush",
            new PlushBlock(ModSounds.DOOGEY_PLUSH,AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).nonOpaque()));

    // Candy Cane
    public static final Block CANDY_CANE_BLOCK = registerBlock("candy_cane_block",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
    public static final Block ZIGZAG_CANDY_BLOCK = registerBlock("zigzagcandy",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));

    public static final Block ARCADE_FLOOR = registerBlock("arcade_floor",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).strength(-1.0f,3600000.0f)));

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

    public static final Block STACK_LIGHTS = registerBlock("stack_lights",
            new StackLightBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BULB).luminance(StackLightBlock.STATE_TO_LUMINANCE)));

    public static final Block ROOF_LAMP = registerBlock("roof_lamp",
            new RoofLampBlock(AbstractBlock.Settings.copy(Blocks.COPPER_BULB).luminance(StackLightBlock.STATE_TO_LUMINANCE)));


    public static final Block SMOOTH_PINK_CITRINE = registerBlock("smooth_pink_citrine",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block POLISHED_PINK_CITRINE = registerBlock("polished_pink_citrine",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block PINK_CITRINE_BRICKS = registerBlock("pink_citrine_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));

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
            TMMORE_BLOCKS.add(KHAKI_RIVETED_HULL);
            TMMORE_BLOCKS.add(KHAKI_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(KHAKI_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(KHAKI_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(KHAKI_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(KHAKI_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(ANTHRACITE_RIVETED_HULL);
            TMMORE_BLOCKS.add(ANTHRACITE_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(ANTHRACITE_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(ANTHRACITE_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(ANTHRACITE_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(ANTHRACITE_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(BLACK_RIVETED_HULL);
            TMMORE_BLOCKS.add(BLACK_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(BLACK_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(BLACK_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(BLACK_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(BLACK_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(MAROON_RIVETED_HULL);
            TMMORE_BLOCKS.add(MAROON_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(MAROON_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(MAROON_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(MAROON_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(MAROON_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(MUNTZ_RIVETED_HULL);
            TMMORE_BLOCKS.add(MUNTZ_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(MUNTZ_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(MUNTZ_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(MUNTZ_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(MUNTZ_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(NAVY_RIVETED_HULL);
            TMMORE_BLOCKS.add(NAVY_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(NAVY_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(NAVY_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(NAVY_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(NAVY_RIVETED_HULL_SMALL_WALL);
            TMMORE_BLOCKS.add(WHITE_RIVETED_HULL);
            TMMORE_BLOCKS.add(WHITE_RIVETED_HULL_SMALL);
            TMMORE_BLOCKS.add(WHITE_RIVETED_HULL_SMALL_PANEL);
            TMMORE_BLOCKS.add(WHITE_RIVETED_HULL_SMALL_STAIRS);
            TMMORE_BLOCKS.add(WHITE_RIVETED_HULL_SMALL_SLAB);
            TMMORE_BLOCKS.add(WHITE_RIVETED_HULL_SMALL_WALL);

            TMMORE_BLOCKS.add(BLEACHED_PLANKS);
            TMMORE_BLOCKS.add(BLEACHED_PANEL);
            TMMORE_BLOCKS.add(BLEACHED_STAIRS);
            TMMORE_BLOCKS.add(BLEACHED_SLAB);
            TMMORE_BLOCKS.add(BLEACHED_WALL);
            TMMORE_BLOCKS.add(BLEACHED_FENCE);
            TMMORE_BLOCKS.add(CANDY_CANE_BLOCK);

            TMMORE_BLOCKS.add(DARK_MARBLE_TILE);
            TMMORE_BLOCKS.add(CHECKERED_MARBLE_TILES);
            TMMORE_BLOCKS.add(MIXED_MARBLE_TILES);
            TMMORE_BLOCKS.add(DEEPWOKEN_TILE);

            TMMORE_BLOCKS.add(ARCADE_FLOOR);

            //ETC NON BLOCK CONFORMING BLOCKS
            TMMORE_BLOCKS.add(ModItems.CANDELABRE_ITEM);
            TMMORE_BLOCKS.add(STACK_LIGHTS);
            TMMORE_BLOCKS.add(ROOF_LAMP);
            TMMORE_BLOCKS.add(PALE_BENCH);
            TMMORE_BLOCKS.add(QUEEN_BENCH);
            TMMORE_BLOCKS.add(STEEL_BENCH);
            TMMORE_BLOCKS.add(THORN_BENCH);

            //Plushies
            TMMORE_BLOCKS.add(NORA_PLUSH);
            TMMORE_BLOCKS.add(DAVIDANDROCKET_PLUSH);
            TMMORE_BLOCKS.add(PICKLE_PLUSH);
            TMMORE_BLOCKS.add(DUCKAMOLY_PLUSH);
            TMMORE_BLOCKS.add(VERID__PLUSH);
            TMMORE_BLOCKS.add(WILLO_PLUSH);
            TMMORE_BLOCKS.add(MOKUS_PLUSH);
            TMMORE_BLOCKS.add(DOOGEY_PLUSH);
            TMMORE_BLOCKS.add(SQUID_PLUSH);
            TMMORE_BLOCKS.add(PENCIL_PLUSH);
            TMMORE_BLOCKS.add(INDIGO_PLUSH);

            TMMORE_BLOCKS.add(PINK_CITRINE_BRICKS);
            TMMORE_BLOCKS.add(POLISHED_PINK_CITRINE);
            TMMORE_BLOCKS.add(SMOOTH_PINK_CITRINE);
                });

        Registry.register(Registries.ITEM_GROUP, MOQUETTES_KEY, MOQUETTES);
        ItemGroupEvents.modifyEntriesEvent(ModBlocks.MOQUETTES_KEY).register(BUILDING_BLOCKS -> {
            // Normal Moquette Blocks
            BUILDING_BLOCKS.add(BLACK_MOQUETTE);
            BUILDING_BLOCKS.add(CYAN_MOQUETTE);
            BUILDING_BLOCKS.add(GRAY_MOQUETTE);
            BUILDING_BLOCKS.add(GREEN_MOQUETTE);
            BUILDING_BLOCKS.add(LIGHT_BLUE_MOQUETTE);
            BUILDING_BLOCKS.add(LIGHT_GRAY_MOQUETTE);
            BUILDING_BLOCKS.add(LIME_MOQUETTE);
            BUILDING_BLOCKS.add(MAGENTA_MOQUETTE);
            BUILDING_BLOCKS.add(ORANGE_MOQUETTE);
            BUILDING_BLOCKS.add(PINK_MOQUETTE);
            BUILDING_BLOCKS.add(PURPLE_MOQUETTE);
            BUILDING_BLOCKS.add(WHITE_MOQUETTE);
            BUILDING_BLOCKS.add(YELLOW_MOQUETTE);

            // Carpets
            BUILDING_BLOCKS.add(BLACK_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(CYAN_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(GRAY_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(GREEN_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(LIGHT_BLUE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(LIGHT_GRAY_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(LIME_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(MAGENTA_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(ORANGE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(PINK_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(PURPLE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(WHITE_MOQUETTE_CARPET);
            BUILDING_BLOCKS.add(YELLOW_MOQUETTE_CARPET);
        });

        Registry.register(Registries.ITEM_GROUP, STRIPED_CARPET_KEY, STRIPED_CARPET);
        ItemGroupEvents.modifyEntriesEvent(STRIPED_CARPET_KEY).register(STRIPED_CARPET -> {
            // Striped Carpets
            // Blocks
            STRIPED_CARPET.add(BLACK_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(BLUE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(CYAN_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(GRAY_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(GREEN_STRIPED_CARPET_BLOCK);
            // STRIPED_CARPET.add(ModBlocks.LIGHT_BLUE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(LIGHT_GRAY_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(LIME_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(ORANGE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(PURPLE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(WHITE_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(YELLOW_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(RED_STRIPED_CARPET_BLOCK);
            STRIPED_CARPET.add(BROWN_STRIPED_CARPET_BLOCK);

            // Carpets
            STRIPED_CARPET.add(BLACK_STRIPED_CARPET);
            STRIPED_CARPET.add(CYAN_STRIPED_CARPET);
            STRIPED_CARPET.add(GRAY_STRIPED_CARPET);
            STRIPED_CARPET.add(GREEN_STRIPED_CARPET);
            // STRIPED_CARPET.add(ModBlocks.LIGHT_BLUE_STRIPED_CARPET);
            STRIPED_CARPET.add(LIGHT_GRAY_STRIPED_CARPET);
            STRIPED_CARPET.add(LIME_STRIPED_CARPET);
            STRIPED_CARPET.add(ORANGE_STRIPED_CARPET);
            STRIPED_CARPET.add(PURPLE_STRIPED_CARPET);
            STRIPED_CARPET.add(WHITE_STRIPED_CARPET);
            STRIPED_CARPET.add(YELLOW_STRIPED_CARPET);
            STRIPED_CARPET.add(BLUE_STRIPED_CARPET);
            STRIPED_CARPET.add(RED_STRIPED_CARPET);
            STRIPED_CARPET.add(BROWN_STRIPED_CARPET);
        });
    }
}
