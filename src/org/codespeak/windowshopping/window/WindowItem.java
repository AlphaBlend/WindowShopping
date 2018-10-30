package org.codespeak.windowshopping.window;

import org.bukkit.inventory.ItemStack;

/**
 * A class that is used to represent a single item in a window
 *
 * @author Vector
 */
public class WindowItem {

    private ItemStack stack;
    private ButtonType buttonType;

    public WindowItem(ItemStack stack, ButtonType buttonType) {
        this.stack = stack;
        this.buttonType = buttonType;
    }

    /**
     * Gets the item stack representing this window item
     *
     * @return item stack representing this window item
     */
    public ItemStack getItemStack() {
        return stack;
    }

    /**
     * Gets the type of button of this window item
     *
     * @return type of button of this window item
     */
    public ButtonType getButtonType() {
        return buttonType;
    }

}
