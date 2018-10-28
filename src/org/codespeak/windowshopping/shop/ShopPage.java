package org.codespeak.windowshopping.shop;

import java.util.List;

/**
 * A class that tracks shop items in a page
 *
 * @author Vector
 */
public class ShopPage {

    private List<ShopItem> shopItems;

    public ShopPage(List<ShopItem> shopItems) {
        this.shopItems = shopItems;
    }

    /**
     * Gets a shop item at the specified index
     *
     * @param idx index of shop item
     * @return shop item at specified index
     */
    public ShopItem getItem(int idx) {
        return shopItems.get(idx);
    }

    /**
     * Sets an item in the specified index with a shop item
     *
     * @param idx index to set shop item
     * @param shopItem shop item to set
     */
    public void setItem(int idx, ShopItem shopItem) {
        shopItems.set(idx, shopItem);
    }

}
