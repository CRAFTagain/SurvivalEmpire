package de.craftagain.survivalempire.events;

import de.craftagain.survivalempire.inventory.PluginInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class EntityListener implements Listener {

    @EventHandler
    public void onEntityClick(PlayerInteractAtEntityEvent event){
        Player player = event.getPlayer();

        try{
        if(event.getRightClicked().getCustomName().equals("§bGünter")) {
            player.openInventory(PluginInventory.jobInv);
        }
        }catch(Exception e){
            }


    }

}
