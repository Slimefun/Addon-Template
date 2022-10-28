package me.jasperchasetoq.blank.implementation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;

public class BlankItems {

    //General

    public static final SlimefunItemStack JC_GENERAL = new SlimefunItemStack("JC_GENERAL", Material.BARRIER, "&f","&f","&f","&f");

    //Machines

    public static final SlimefunItemStack JC_MACHINE = new SlimefunItemStack("JC_MACHINE", Material.BARRIER, "&f", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(1), LoreBuilder.speed(1), LoreBuilder.powerBuffer(1),"&f");

    //Generators

    public static final SlimefunItemStack JC_GENERATOR = new SlimefunItemStack("JC_GENERATOR", Material.OBSIDIAN, "&f",LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR), LoreBuilder.powerBuffer(1), LoreBuilder.powerPerSecond(1));
}
