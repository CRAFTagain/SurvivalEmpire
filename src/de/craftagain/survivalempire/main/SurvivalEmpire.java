package de.craftagain.survivalempire.main;

import de.craftagain.survivalempire.command.CMD_getLevel;
import de.craftagain.survivalempire.command.CMD_lobby;
import de.craftagain.survivalempire.command.CMD_setLevel;
import de.craftagain.survivalempire.data.Data;
import de.craftagain.survivalempire.events.PlayerJoinListener;
import de.craftagain.survivalempire.events.PlayerQuitListener;
import de.craftagain.survivalempire.utils.config.Level;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class SurvivalEmpire extends JavaPlugin {

    @Override
    public void onEnable() {
        Data.log(" §7SE started, coded by " + Data.getAuthors());

        try {
            Level.save();
        } catch (IOException e) {
            e.printStackTrace();
        }

        getCommand("lobby").setExecutor(new CMD_lobby());
        getCommand("setLevel").setExecutor(new CMD_setLevel());
        getCommand("getLevel").setExecutor(new CMD_getLevel());

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerQuitListener(), this);

        Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
    }

    @Override
    public void onDisable() {
    Data.log(" §7SE stopped");
    }
}
