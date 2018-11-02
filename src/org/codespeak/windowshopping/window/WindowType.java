package org.codespeak.windowshopping.window;

/**
 * An enum of all the different windows and their parents
 *
 * @author Vector
 */
public enum WindowType {

    MAIN_MENU(0, "Main Menu", null),
    PLAYER_SHOP_OVERVIEW(1, "Player Shop Overview", MAIN_MENU),
    INDIVIDUAL_PLAYER_SHOP(2, "%p's Shop", PLAYER_SHOP_OVERVIEW),
    PLAYER_SHOP_MANAGER(3, "Player Shop Manager", MAIN_MENU),
    ITEM_MANAGEMENT(4, "Item Management", PLAYER_SHOP_MANAGER),
    CHANGE_ITEM_PRICES(5, "Change Item Prices", ITEM_MANAGEMENT);

    private final int id;
    private final String name;
    private final WindowType parent;

    private WindowType(int id, String name, WindowType parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    /**
     * Gets the ID of this window
     *
     * @return id of this window
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of this window
     *
     * @return name of this window
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the parent window of this menu
     *
     * @return parent of this window
     */
    public WindowType getParent() {
        return parent;
    }

    /**
     * Gets a window type by its ID
     *
     * @param id ID of the window
     * @return
     */
    public static WindowType fromId(int id) {
        for (WindowType t : values()) {
            if (t.getId() == id) {
                return t;
            }
        }

        return null;
    }

}
