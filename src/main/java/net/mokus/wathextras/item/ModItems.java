package net.mokus.wathextras.item;

import dev.doctor4t.wathe.item.CocktailItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.mokus.wathextras.WathExtras;
import net.mokus.wathextras.block.ModBlocks;

public class ModItems {

    public static final RegistryKey<ItemGroup> TMMORE_ITEM_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(WathExtras.MOD_ID, "tmmore_item_group"));
    public static final ItemGroup TMMORE_ITEM = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.STRAWBERRY_MILK_GLASS))
            .displayName(Text.translatable("buildGroup.TMMore_Items"))
            .build();


    public static final Item MILK_GLASS = registerItem("milk_glass",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item CHOCCY_MILK_GLASS = registerItem("choccy_milk_glass",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item STRAWBERRY_MILK_GLASS = registerItem("strawberry_milk_glass",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));

    public static final Item BLUE_LOLLIPOP = registerItem("blue_lollipop",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));
    public static final Item RED_LOLLIPOP = registerItem("red_lollipop",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));
    public static final Item GREEN_LOLLIPOP = registerItem("green_lollipop",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));
    public static final Item YELLOW_LOLLIPOP = registerItem("yellow_lollipop",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));

    public static final Item GINGERBREAD = registerItem("gingerbread",
            new Item(new Item.Settings().food(FoodComponents.BREAD)));
    public static final Item GINGERBREAD_CHOCO = registerItem("gingerbread_choco",
            new Item(new Item.Settings().food(FoodComponents.BREAD)));
    public static final Item GINGERBREAD_DUCKAMOLY = registerItem("gingerbread_duckamoly",
            new Item(new Item.Settings().food(FoodComponents.BREAD)));
    public static final Item GINGERBREAD_NORA = registerItem("gingerbread_nora",
            new Item(new Item.Settings().food(FoodComponents.BREAD)));
    public static final Item GINGERBREAD_RUDOLPH = registerItem("gingerbread_rudolph",
            new Item(new Item.Settings().food(FoodComponents.BREAD)));
    public static final Item GINGERBREAD_SCARF = registerItem("gingerbread_scarf",
            new Item(new Item.Settings().food(FoodComponents.BREAD)));

    public static final Item CANDY_CANE = registerItem("candy_cane",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));
    public static final Item CAKESLICE = registerItem("cakeslice",
            new Item(new Item.Settings().food(FoodComponents.APPLE)));

    public static final Item CANDELABRE_ITEM = registerItem("candelabre_item",
            new VerticallyAttachableBlockItem(ModBlocks.CANDELABRE, ModBlocks.WALL_CANDELABRE, new Item.Settings(), Direction.DOWN));

    public static final Item BLENDED_BERRY_BLAST = registerItem("blended_berry_blast",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item COTTON_SWIZZLE = registerItem("cotton_swizzle",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item NO_BERRY_LEMON_SOUR = registerItem("no_berry_lemon_sour",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item SALTED_SEAFRUIT = registerItem("salted_seafruit",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item SAPPHIC_SUNSET = registerItem("sapphic_sunset",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item THE_ALL_IN = registerItem("the_all_in",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item THE_CHROMATIC = registerItem("the_chromatic",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));

    public static final Item MIXED_MOCKTAIL = registerItem("mixed_mocktail",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item TEQUILA_SHOT = registerItem("tequila_shot",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item WHISKEY_SOUR = registerItem("whiskey_sour",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item WATER_GLASS = registerItem("water_glass",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item MOONSHINE = registerItem("moonshine",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));
    public static final Item BEER_PINT = registerItem("beer_pint",
            new CocktailItem(new Item.Settings().maxCount(1).food(FoodComponents.HONEY_BOTTLE)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(WathExtras.MOD_ID,name), item);
    }

    public static void init(){
        Registry.register(Registries.ITEM_GROUP, TMMORE_ITEM_KEY, TMMORE_ITEM);
        ItemGroupEvents.modifyEntriesEvent(ModItems.TMMORE_ITEM_KEY).register(TMMORE_ITEMS -> {
            // Cocktails
            TMMORE_ITEMS.add(WATER_GLASS);
            TMMORE_ITEMS.add(BEER_PINT);
            TMMORE_ITEMS.add(MIXED_MOCKTAIL);
            TMMORE_ITEMS.add(WHISKEY_SOUR);
            TMMORE_ITEMS.add(MOONSHINE);
            TMMORE_ITEMS.add(TEQUILA_SHOT);
            TMMORE_ITEMS.add(BLENDED_BERRY_BLAST);
            TMMORE_ITEMS.add(COTTON_SWIZZLE);
            TMMORE_ITEMS.add(NO_BERRY_LEMON_SOUR);
            TMMORE_ITEMS.add(SALTED_SEAFRUIT);
            TMMORE_ITEMS.add(SAPPHIC_SUNSET);
            TMMORE_ITEMS.add(THE_ALL_IN);
            TMMORE_ITEMS.add(THE_CHROMATIC);

            // Drink
            TMMORE_ITEMS.add(MILK_GLASS);
            TMMORE_ITEMS.add(STRAWBERRY_MILK_GLASS);
            TMMORE_ITEMS.add(CHOCCY_MILK_GLASS);
            // Food
            TMMORE_ITEMS.add(CAKESLICE);
            TMMORE_ITEMS.add(GREEN_LOLLIPOP);
            TMMORE_ITEMS.add(RED_LOLLIPOP);
            TMMORE_ITEMS.add(YELLOW_LOLLIPOP);
            TMMORE_ITEMS.add(BLUE_LOLLIPOP);
            TMMORE_ITEMS.add(CANDY_CANE);
            TMMORE_ITEMS.add(GINGERBREAD);
            TMMORE_ITEMS.add(GINGERBREAD_CHOCO);
            TMMORE_ITEMS.add(GINGERBREAD_DUCKAMOLY);
            TMMORE_ITEMS.add(GINGERBREAD_NORA);
            TMMORE_ITEMS.add(GINGERBREAD_RUDOLPH);
            TMMORE_ITEMS.add(GINGERBREAD_SCARF);

        });
    }
}
