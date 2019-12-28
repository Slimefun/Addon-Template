package me.CHANGEME.slimefunaddon;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.bstats.bukkit.Metrics;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;

public class SlimefunAddon extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// Read something from your config.yml
		Config cfg = new Config(this);
		
		if (cfg.getBoolean("options.auto-update")) {
			// You could start your Auto-Updater for example
		}
		
		// Slimefun4 also already comes with a bundled version of bStats
		// You can use bStats to collect usage data about your plugin
		// More info: https://bstats.org/getting-started
		new Metrics(this);
		
		// Create a new Category
		ItemStack categoryItem = new CustomItem(Material.DIAMOND, "&4Addon Category", "", "&7> Click to open");
		Category category = new Category(categoryItem);
		
		// Create a new Slimefun ItemStack
		// This class has many constructors, it is very important that you give each item a unique id.
		SlimefunItemStack slimefunItem = new SlimefunItemStack("COOL_DIAMOND", Material.DIAMOND, "&4Addon Diamond", "&c+20% Coolness");
		
		// The Recipe is an ItemStack Array with a length of 9.
		// It represents a Shaped Recipe in a 3x3 crafting grid
		ItemStack[] recipe = {
			new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD),
			null, new ItemStack(Material.DIAMOND), null,
			new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD)
		};
		
		// Now you just have to register the item
		SlimefunItem item = new SlimefunItem(category, slimefunItem, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
		item.register();
	}
	
	@Override
	public void onDisable() {
		// Logic for disabling the plugin...
	}

}
