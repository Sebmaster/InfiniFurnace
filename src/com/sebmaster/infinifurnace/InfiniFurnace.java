package com.sebmaster.infinifurnace;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Provides the ability, to let a bucket of lava burn a furnace forever.
 * 
 * @author Sebastian Mayr
 */
public class InfiniFurnace extends JavaPlugin implements Listener {

	@Override
    public void onEnable() {
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(this, this);
    }
	
	@EventHandler
	public void onFurnaceBurn(FurnaceBurnEvent evt) {
		if (evt.getFuel().getType() == Material.LAVA_BUCKET) {
			evt.getFuel().setAmount(2);
		}
	}
}