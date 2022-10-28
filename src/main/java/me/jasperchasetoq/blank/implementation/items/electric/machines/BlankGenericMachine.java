package me.jasperchasetoq.blank.implementation.items.electric.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

public class BlankGenericMachine extends AContainer implements RecipeDisplayItem {

    @ParametersAreNonnullByDefault
    public BlankGenericMachine(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);}
    @Override
    protected void registerDefaultRecipes() {

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.BARRIER, 1)}, new ItemStack[] {new SlimefunItemStack(SlimefunItems.ENHANCED_CRAFTING_TABLE, 1)});
    }
    @Override
    public String getMachineIdentifier() {
        return "BLANK_GENERIC_MACHINE";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.BARRIER);
    }
}
