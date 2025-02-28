package me.benosaurus.voidMiner.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class VoidMinerCommand implements CommandExecutor {

    public static boolean voidMinerEnabled = false;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {

            sender.sendMessage("Only players can use this command!");
            return true;


        }

        if (voidMinerEnabled) {

            sender.sendMessage("Successfully disabled VoidMiner!");
            voidMinerEnabled = false;
            System.out.println(voidMinerEnabled);

        } else {

            sender.sendMessage("Successfully enabled VoidMiner!");
            voidMinerEnabled = true;
            System.out.println(voidMinerEnabled);

        }


        return true;

    }


}