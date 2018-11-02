package org.codespeak.windowshopping.listeners;

import org.bukkit.event.Listener;
import org.codespeak.windowshopping.WindowShopping;

/**
 * A class that handles player events
 *
 * @author Vector
 */
public class BukkitPlayerListener implements Listener {

    private WindowShopping plugin;
    
    public BukkitPlayerListener(WindowShopping plugin) {
        this.plugin = plugin;
    }

}
