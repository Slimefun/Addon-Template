package me.CHANGEME.slimefunaddon;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;

public class SlimefunAddon extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Config cfg = new Config(this);
		// Read something from your config.yml
		
		// Create a new Category
		ItemStack categoryItem = new CustomItem(Material.DIAMOND, "&4Addon Category", "", "&7> Click to open");
		Category category = new Category(categoryItem);
		
		// Create a new SlimefunItem
		ItemStack slimefunItem = new CustomItem(Material.DIAMOND, "&4Addon Diamond", "&c+20% Coolness");
		ItemStack[] recipe = {
			new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD),
			null, new ItemStack(Material.DIAMOND), null,
			new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD)
		};
		
		SlimefunItem item = new SlimefunItem(category, slimefunItem, "ADDON_ITEM", RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
		item.register();
	}
	
	@Override
	public void onDisable() {
		// Logic for disabling the plugin...
	}

}
