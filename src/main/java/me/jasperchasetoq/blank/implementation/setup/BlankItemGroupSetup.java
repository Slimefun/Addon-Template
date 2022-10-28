package me.jasperchasetoq.blank.implementation.setup;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.jasperchasetoq.blank.Blank;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class BlankItemGroupSetup {

    //Main(Nested) Item Group
    public static final NestedItemGroup BlankNestedGeneral = new NestedItemGroup(new NamespacedKey(Blank.getInstance(), "GENERAL"), new CustomItemStack(Material.BARRIER, "&fBlank"));

    //Sub Item Groups
    public static final SubItemGroup BlankSubGeneral = new SubItemGroup(new NamespacedKey(Blank.getInstance(), "SUB_GENERAL"), BlankNestedGeneral, new CustomItemStack(Material.BARRIER, "&fBlank General"));
    public static final SubItemGroup BlankGeneralMachines = new SubItemGroup(new NamespacedKey(Blank.getInstance(), "SUB_MACHINES"), BlankNestedGeneral, new CustomItemStack(Material.BARRIER, "&fBlank Machines"));
    public static final SubItemGroup BlankGeneralGenerators = new SubItemGroup(new NamespacedKey(Blank.getInstance(), "SUB_GENERATORS"), BlankNestedGeneral, new CustomItemStack(Material.BARRIER, "&fBlank Generator"));

}
