package de.craftagain.survivalempire.events;

import de.craftagain.survivalempire.data.Data;
import de.craftagain.survivalempire.manager.ActionbarManager;
import de.craftagain.survivalempire.manager.ScoreboardManager;
import de.craftagain.survivalempire.utils.config.Level;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.IOException;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) throws IOException {
        Player player = event.getPlayer();

        if(!Level.config.isSet(player.getName())){
            Level.addXPToGoal(player);
        }

        ScoreboardManager.addScoreboard(player);
        ActionbarManager.addXpBar(player, "§a" + Level.getXP(player) + "§7/§a" + Level.getXPGoal(player) + " §7xp");

        event.setJoinMessage(Data.getPrefix() + " §a" + player.getName() + " §7ist dem Spiel beigetreten!");
    }
}
