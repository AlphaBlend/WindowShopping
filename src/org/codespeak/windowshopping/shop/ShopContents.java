package org.codespeak.windowshopping.shop;

import java.util.List;

/**
 * A class that lists the contents of a shop
 *
 * @author Vector
 */
public class ShopContents {

    private List<ShopPage> shopPages;

    public ShopContents(List<ShopPage> shopPages) {
        this.shopPages = shopPages;
    }

    /**
     * Gets a shop page by the specified page number
     *
     * @param page
     * @return
     */
    public ShopPage getPage(int page) {
        return shopPages.get(page - 1);
    }

}
