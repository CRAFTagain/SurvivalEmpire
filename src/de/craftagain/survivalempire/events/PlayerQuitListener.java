package de.craftagain.survivalempire.events;

import de.craftagain.survivalempire.data.Data;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event){

        Player player = event.getPlayer();

        event.setQuitMessage(Data.getPrefix() + " §a" + player.getName() + " §7hat das Spiel verlassen!");
    }

}
