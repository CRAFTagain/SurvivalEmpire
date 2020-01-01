package de.craftagain.survivalempire.events;

import de.craftagain.survivalempire.data.JobData;
import de.craftagain.survivalempire.inventory.item.Items;
import de.craftagain.survivalempire.manager.ScoreboardManager;
import de.craftagain.survivalempire.utils.config.Job;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryCLick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();

        try {
            if (event.getClickedInventory().getTitle().equals("§7Wähle einen Job!")) {
                event.setCancelled(true);
                if(event.getCurrentItem().equals(Items.lumberjackIcon)){
                    Job.setJob(player, "lumberjack");
                    player.sendMessage(JobData.getJobPrefix() + "§7Du übst nun den Job §aHolzfäller §7aus!");
                }
                if(event.getCurrentItem().equals(Items.farmerIcon)){
                    Job.setJob(player, "farmer");
                    player.sendMessage(JobData.getJobPrefix() + "§7Du übst nun den Job §aLandwirt §7aus!");
                }
                if(event.getCurrentItem().equals(Items.adventurerIcon)){
                    Job.setJob(player, "adventurer");
                    player.sendMessage(JobData.getJobPrefix() + "§7Du übst nun den Job §aAbenteurer §7aus!");
                }
                if(event.getCurrentItem().equals(Items.minerIcon)){
                    Job.setJob(player, "miner");
                    player.sendMessage(JobData.getJobPrefix() + "§7Du übst nun den Job §aBergarbeiter §7aus!");
                }
                if(event.getCurrentItem().equals(Items.craftsmanIcon)){
                    Job.setJob(player, "craftsman");
                    player.sendMessage(JobData.getJobPrefix() + "§7Du übst nun den Job §aHandwerker §7aus!");
                }
                player.closeInventory();
                ScoreboardManager.updateJob(player);
                player.playSound(player.getLocation(), Sound.LEVEL_UP, 20, 20);
            }
        }catch(Exception e){

        }
    }
}
