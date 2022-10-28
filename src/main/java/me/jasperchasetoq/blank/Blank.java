package me.jasperchasetoq.blank;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import me.jasperchasetoq.blank.implementation.setup.BlankItemSetup;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.io.File;

public class Blank extends JavaPlugin implements SlimefunAddon {
    @Override
    public void onEnable() {

        BlankItemSetup.setup(this);

        Config cfg = new Config(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }
        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
            new GitHubBuildsUpdater(this, getFile(), "JasperChaseTOQ/DyeBench/master").start();

            int pluginId = 1234;
            Metrics metrics = new Metrics(this, pluginId);
        }
    }
    @Override
    public void onDisable() {
    }
    @Override
    public String getBugTrackerURL() {
        return "https://github.com/JasperChaseTOQ/Blank/issues";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    private static Blank instance;

    public Blank() {
        instance = this;
    }

    public static Blank getInstance() {
        return instance;
    }

}


