package org.codespeak.windowshopping.window;

import org.bukkit.Material;

/**
 * An enum listing several types of buttons for windows
 *
 * @author Vector
 */
public enum ButtonType {

    PREVIOUS_PAGE(Material.CHEST),
    NEXT_PAGE(Material.CHEST),
    PREVIOUS_MENU(Material.ENDER_CHEST),
    ITEM_AMOUNT_MODIFIER(Material.DISPENSER),
    ITEM_AMOUNT_MODIFIER_16(Material.DISPENSER),
    ITEM_AMOUNT_MODIFIER_32(Material.DISPENSER),
    ITEM_AMOUNT_MODIFIER_64(Material.DISPENSER),
    MESSAGE_ITEM(Material.PAPER),
    PLAYER_SHOP_ITEM(null),
    WINDOW_ITEM(null),
    INFO_ITEM(null),
    CHANGE_PRICE_ITEM(null),
    NONE(null);

    private final Material mat;

    private ButtonType(Material mat) {
        this.mat = mat;
    }

    /**
     * Gets the material associated with this button
     *
     * @return
     */
    public Material getMaterial() {
        return mat;
    }

}
