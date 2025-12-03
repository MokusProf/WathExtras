package net.mokus.tmmore.item;

import dev.doctor4t.trainmurdermystery.item.CocktailItem;
import dev.doctor4t.trainmurdermystery.item.LockpickItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.mokus.tmmore.TMMore;
import net.mokus.tmmore.block.ModBlocks;

public class ModItems {

    public static final RegistryKey<ItemGroup> TMMORE_ITEM_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(TMMore.MOD_ID, "tmmore_item_group"));
    public static final ItemGroup TMMORE_ITEM = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.STRAWBERRY_MILK_GLASS))
            .displayName(Text.translatable("buildGroup.TMMore_Items"))
            .build();


    public static final Item MILK_GLASS = registerItem("milk_glass",
            new CocktailItem(new Item.Settings().maxCount(1)));
    public static final Item CHOCCY_MILK_GLASS = registerItem("choccy_milk_glass",
            new CocktailItem(new Item.Settings().maxCount(1)));
    public static final Item STRAWBERRY_MILK_GLASS = registerItem("strawberry_milk_glass",
            new CocktailItem(new Item.Settings().maxCount(1)));

    public static final Item BLUE_LOLLIPOP = registerItem("blue_lollipop",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));
    public static final Item RED_LOLLIPOP = registerItem("red_lollipop",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));
    public static final Item GREEN_LOLLIPOP = registerItem("green_lollipop",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));
    public static final Item YELLOW_LOLLIPOP = registerItem("yellow_lollipop",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));

    public static final Item CANDELABRE_ITEM = registerItem("candelabre_item",
            new VerticallyAttachableBlockItem(ModBlocks.CANDELABRE, ModBlocks.WALL_CANDELABRE, new Item.Settings(), Direction.DOWN));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TMMore.MOD_ID,name), item);
    }

    public static void init(){
        Registry.register(Registries.ITEM_GROUP, TMMORE_ITEM_KEY, TMMORE_ITEM);
        ItemGroupEvents.modifyEntriesEvent(ModItems.TMMORE_ITEM_KEY).register(TMMORE_ITEMS -> {
            TMMORE_ITEMS.add(ModItems.MILK_GLASS);
            TMMORE_ITEMS.add(ModItems.STRAWBERRY_MILK_GLASS);
            TMMORE_ITEMS.add(ModItems.CHOCCY_MILK_GLASS);
            TMMORE_ITEMS.add(ModItems.GREEN_LOLLIPOP);
            TMMORE_ITEMS.add(ModItems.RED_LOLLIPOP);
            TMMORE_ITEMS.add(ModItems.YELLOW_LOLLIPOP);
            TMMORE_ITEMS.add(ModItems.BLUE_LOLLIPOP);
        });
    }
}
