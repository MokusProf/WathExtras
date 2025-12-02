package net.mokus.tmmore.block;

import dev.doctor4t.trainmurdermystery.block.PanelBlock;
import dev.doctor4t.trainmurdermystery.index.TMMBlocks;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mokus.tmmore.TMMore;

public class ModBlocks {


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



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TMMore.MOD_ID,name),block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TMMore.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }



    public static void init(){
    }
}
