package net.mokus.wathextras.game;

import dev.doctor4t.wathe.index.WatheItems;
import dev.doctor4t.wathe.util.ShopEntry;
import dev.doctor4t.wathe.game.GameConstants;
import net.mokus.wathextras.item.ModItems;

import static dev.doctor4t.wathe.game.GameConstants.getInTicks;

// idk a good name for this
public class ModifyGameConstants {
    public static void init() {
        addShopEntries();
        addCooldown();
    }

    public static void addShopEntries() {
        GameConstants.SHOP_ENTRIES.add(
                new ShopEntry(ModItems.GLASS_HAMMER.getDefaultStack(), 25, ShopEntry.Type.TOOL)
        );
    }
    public static void addCooldown() {
        GameConstants.ITEM_COOLDOWNS.put(ModItems.GLASS_HAMMER, getInTicks(0, 20));
    }
}
