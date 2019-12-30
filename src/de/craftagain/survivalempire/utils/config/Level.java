package de.craftagain.survivalempire.utils.config;

import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class Level {

    private static File file = new File("plugins/SurvivalEmpire", "level.yml");
    public static FileConfiguration config = YamlConfiguration.loadConfiguration(file);

    public static void save() throws IOException {
        config.save(file);
    }

    public static void setLevel(Player player, int lvl) throws IOException {
        config.set(player.getName() + ".lvl", lvl);
        save();
    }

    public static int getLevel(Player player){

        if(config.isSet(player.getName() + ".lvl")){
            return (int) config.get(player.getName() + ".lvl");
        } else
            return 0;
    }

}
