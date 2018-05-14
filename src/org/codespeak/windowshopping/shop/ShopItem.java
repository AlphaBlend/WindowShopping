package org.codespeak.windowshopping.shop;

import org.bukkit.Material;

/**
 * A class that contains a single shop item listing
 *
 * @author Vector
 */
public class ShopItem {

    private Material material;
    private int amount;

    public ShopItem(Material material, int amount) {
        this.material = material;
        this.amount = amount;
    }

    /**
     * Returns the material of this shop item
     * @return material of this shop item
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Gets the amount remaining of this shop item
     * @return
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount of this shop item
     * @param amount amount of this shop item
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
