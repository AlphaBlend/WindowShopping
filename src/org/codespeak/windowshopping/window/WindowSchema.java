package org.codespeak.windowshopping.window;

import java.util.List;

/**
 * A class designed to provide a list of items in a window and the
 * associating buttons that go along with them. This is also
 * responsible for determining the type of button clicked on
 *
 * @author Vector
 */
public class WindowSchema {

    private List<WindowItem> items;

    public WindowSchema(List<WindowItem> items) {
        this.items = items;
    }

    /**
     * Determines the type of the button clicked
     *
     * @param idx the index of the item clicked
     * @return type of the button clicked
     */
    public ButtonType getButtonClicked(int idx) {
        for (int i = 0; i < items.size(); i++) {
            if (i == idx) {
                return items.get(i).getButtonType();
            }
        }

        return ButtonType.NONE;
    }

}
