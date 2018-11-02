package org.codespeak.windowshopping.window;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * A builder that builds windows
 *
 * @author Vector
 */
public class WindowBuilder {

    private String windowTitle;
    private List<WindowItem> items;

    public WindowBuilder() {
        windowTitle = "";
        items = new ArrayList<WindowItem>();
    }

    /**
     * Sets the title of this window
     *
     * @param windowTitle title of this window
     */
    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    /**
     * Gets the title of this window
     *
     * @return title of this window
     */
    public String getWindowTitle() {
        return windowTitle;
    }

    /**
     * Adds a blank item to the window
     */
    public void addBlankItem() {
        addBlankItem(1);
    }

    /**
     * Adds a blank item to the window a specified number of times
     * @param times number of blank items
     */
    public void addBlankItem(int times) {
        for (int i = 0; i < times; i++) {
            ItemStack airStack = new ItemStack(Material.AIR, 1);
            items.add(new WindowItem(airStack, ButtonType.NONE));
        }
    }

    /**
     * Adds a new item to the list of items
     * @param stack
     * @param type
     */
    public void addItem(ItemStack stack, ButtonType type) {
        items.add(new WindowItem(stack, type));
    }

    /**
     * This makes sure that the size of the items in this list is divisible
     * by the size of the number of items in a row of a chest window. If this
     * is not the case then there will be issues trying to display these
     * contents in a chest window
     */
    public void makeDivisibleRows() {
        int remain = (items.size() % 9);

        if (remain > 0) {
            int left = (9 - remain);

            for (int i = 0; i < left; i++) {
                ItemStack airStack = new ItemStack(Material.AIR, 1);
                items.add(new WindowItem(airStack, ButtonType.NONE));
            }
        }
    }

    /**
     * Gets the size of this window
     *
     * @return size of this window
     */
    public int getSize() {
        return items.size();
    }

    /**
     * Gets the list of items from this builder
     *
     * @return list of items from this builder
     */
    public List<WindowItem> getItems() {
        return items;
    }

}
