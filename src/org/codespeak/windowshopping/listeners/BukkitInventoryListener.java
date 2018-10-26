package org.codespeak.windowshopping.listeners;

import org.bukkit.event.Listener;
import org.codespeak.windowshopping.WindowShopping;

/**
 * A class that handles inventory events
 *
 * @author Vector
 */
public class BukkitInventoryListener implements Listener {

    private WindowShopping plugin;

    public BukkitInventoryListener(WindowShopping plugin) {
        this.plugin = plugin;
    }

}
