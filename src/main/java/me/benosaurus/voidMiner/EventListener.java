package me.benosaurus.voidMiner;

import me.benosaurus.voidMiner.Commands.VoidMinerCommand;
import org.bukkit.block.ShulkerBox;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {

        if (VoidMinerCommand.voidMinerEnabled) {

            if (!(event.getBlock().getState() instanceof ShulkerBox)) {
                
                event.setDropItems(false);

            }

        } else {

            if (event.isCancelled()) {

                event.setDropItems(true);

            }

        }


    }
}
