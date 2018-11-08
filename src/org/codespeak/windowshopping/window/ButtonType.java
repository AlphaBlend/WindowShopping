package org.codespeak.windowshopping.window;

import java.util.Collections;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * An enum listing several types of buttons for windows
 *
 * @author Vector
 */
public enum ButtonType {

    PREVIOUS_PAGE,
    NEXT_PAGE,
    PREVIOUS_MENU,
    ITEM_AMOUNT_MODIFIER,
    ITEM_AMOUNT_MODIFIER_16,
    ITEM_AMOUNT_MODIFIER_32,
    ITEM_AMOUNT_MODIFIER_64,
    MESSAGE_ITEM,
    PLAYER_SHOP_ITEM,
    OPEN_WINDOW_ITEM,
    INFO_ITEM,
    CHANGE_PRICE_ITEM,
    NONE;

    /**
     * Builds a window item given its button type and material
     *
     * @param type type of button
     * @param material material of the window item
     * @return a window item of the specified type and material
     */
    public static WindowItem buildWindowItem(ButtonType type, Material material) {
        return buildWindowItem(type, material, "");
    }

    /**
     * Builds a window item given its button type, material and display name
     *
     * @param type type of button
     * @param material material of the window item
     * @param displayName display name of the window item
     * @return a window item of the specified type, material and display name
     */
    public static WindowItem buildWindowItem(ButtonType type, Material material, String displayName) {
        return buildWindowItem(type, material, displayName, Collections.EMPTY_LIST);
    }

    /**
     * Builds a window item given its button type, material, display
     * name and lore
     *
     * @param type the type of button
     * @param material the material of the button
     * @param displayName the display name of the button
     * @param lore additional text on the button
     * @return a window item of the specified type, material, display
     * name and lore
     */
    public static WindowItem buildWindowItem(ButtonType type, Material material, String displayName, List<String> lore) {
        ItemStack stack = new ItemStack(material, 1);
        ItemMeta meta = stack.getItemMeta();

        if (!displayName.isEmpty()) {
            meta.setDisplayName(displayName);
        }

        if (!lore.isEmpty()) {
            meta.setLore(lore);
        }

        stack.setItemMeta(meta);

        return new WindowItem(stack, type);
    }

    /**
     * Creates a player head window item
     * @param openShop true to open up a player's shop, false otherwise
     * @param player the player owning the player head
     * @param lore additional information for the player's head
     * @return a player head window item
     */
    public static WindowItem buildPlayerHeadItem(boolean openShop, OfflinePlayer player, List<String> lore) {
        ItemStack stack = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skull = (SkullMeta) stack.getItemMeta();

        skull.setDisplayName(player.getName());
        skull.setOwningPlayer(player);

        if (!lore.isEmpty()) {
            skull.setLore(lore);
        }

        stack.setItemMeta(skull);

        return new WindowItem(stack, openShop ? ButtonType.PLAYER_SHOP_ITEM : ButtonType.INFO_ITEM);
    }

}
