package me.jasperchasetoq.blank.implementation.items.electric.generators;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;


@SuppressWarnings("deprecation")
public class BlankGenerator extends SlimefunItem implements EnergyNetProvider {

    private final int capacity;

    @ParametersAreNonnullByDefault
    public BlankGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, int capacity, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);


        this.capacity = capacity;

    }
    @Override
    public int getGeneratedOutput(@Nonnull Location location, @Nonnull Config config) {
        return 1;
    }
    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.GENERATOR;
    }
}
