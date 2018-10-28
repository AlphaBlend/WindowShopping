package org.codespeak.windowshopping;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.codespeak.windowshopping.listeners.BukkitInventoryListener;

/**
 *
 * @author Vector
 */
public class WindowShopping extends JavaPlugin {

    private List<Listener> listeners;
    private Logger logger;
    private Economy economy;
    private boolean shopEnabled;

    @Override
    public void onEnable() {
        listeners = new ArrayList<Listener>();
        listeners.add(new BukkitInventoryListener(this));

        PluginManager manager = super.getServer().getPluginManager();
        logger = super.getLogger();

        for (Listener listener : listeners) {
            manager.registerEvents(listener, this);
        }

        RegisteredServiceProvider<Economy> econProvider = super.getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
        economy = econProvider.getProvider();

        if (economy != null) {
            shopEnabled = true;
        } else {
            shopEnabled = false;
            logger.log(Level.SEVERE, "Economy system not found! Shop has been disabled!");
        }
    }

    @Override
    public void onDisable() {

    }

    /**
     * Returns this plugin object instance
     *
     * @return this plugin object instance
     */
    public WindowShopping getPlugin() {
        return this;
    }

    /**
     * Checks if the shop is enabled
     *
     * @return If shop is enabled
     */
    public boolean isShopEnabled() {
        return shopEnabled;
    }

}
