package de.craftagain.survivalempire.events;

import de.craftagain.survivalempire.data.Data;
import de.craftagain.survivalempire.manager.ScoreboardManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        ScoreboardManager.addScoreboard(player);

        event.setJoinMessage(Data.getPrefix() + " §a" + player.getName() + " §7ist dem Spiel beigetreten!");
    }
}
