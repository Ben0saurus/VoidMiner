package me.benosaurus.voidMiner;

import me.benosaurus.voidMiner.Commands.VoidMinerCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class VoidMiner extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[VoidMiner] Successfully loaded VoidMiner!");
        getCommand("VoidMiner").setExecutor(new VoidMinerCommand());
        getServer().getPluginManager().registerEvents(new EventListener(), this);

    }

    @Override
    public void onDisable() {
        System.out.println("[VoidMiner] Successfully unloaded VoidMiner!")
    }
}
