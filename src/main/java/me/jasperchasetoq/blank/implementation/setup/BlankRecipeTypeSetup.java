package me.jasperchasetoq.blank.implementation.setup;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.jasperchasetoq.blank.Blank;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class BlankRecipeTypeSetup {

    //Recipe Type(s)
    public static final RecipeType Blank = new RecipeType(new NamespacedKey(me.jasperchasetoq.blank.Blank.getInstance(), "blankrecipetype"), new CustomItemStack(Material.BARRIER, "&f", "&f", "&f", "&f"));

}
