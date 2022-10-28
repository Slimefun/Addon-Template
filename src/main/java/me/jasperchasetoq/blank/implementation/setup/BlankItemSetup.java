package me.jasperchasetoq.blank.implementation.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.blank.Blank;
import me.jasperchasetoq.blank.implementation.BlankItems;
import me.jasperchasetoq.blank.implementation.items.electric.generators.BlankGenerator;
import me.jasperchasetoq.blank.implementation.items.electric.machines.BlankGenericMachine;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class BlankItemSetup {
    private BlankItemSetup() {
    }

    public static void setup(@Nonnull Blank plugin) {

        //General

        new SlimefunItem(BlankItemGroupSetup.BlankSubGeneral, BlankItems.JC_GENERAL, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null})
                .register(plugin);

        //Machines

        new BlankGenericMachine(BlankItemGroupSetup.BlankGeneralMachines, BlankItems.JC_MACHINE, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null})
                .setCapacity(1)
                .setEnergyConsumption(1)
                .setProcessingSpeed(1)
                .register(plugin);

        //Generators

        new BlankGenerator(BlankItemGroupSetup.BlankGeneralGenerators, BlankItems.JC_GENERATOR, RecipeType.NULL,1, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null})
                .register(plugin);

    }
}
