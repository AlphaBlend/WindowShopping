package org.codespeak.windowshopping.window;

/**
 * A builder that builds an anvil
 *
 * @author Vector
 */
public class AnvilBuilder extends WindowBuilder {

    private String renameText;

    public AnvilBuilder() {
        super();
    }

    /**
     * Sets the rename text of this anvil builder
     *
     * @param renameText rename text of this anvil builder
     */
    public void setRenameText(String renameText) {
        this.renameText = renameText;
    }

    /**
     * Gets the rename text of this anvil builder
     *
     * @return rename text of this anvil builder
     */
    public String getRenameText() {
        return renameText;
    }

}
