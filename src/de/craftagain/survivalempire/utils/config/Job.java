package de.craftagain.survivalempire.utils.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class Job {

    private static File file = new File("plugins/SurvivalEmpire", "job.yml");
    public static FileConfiguration config = YamlConfiguration.loadConfiguration(file);

    public static void save() throws IOException {
        config.save(file);
    }

    public static void setJob(Player player, String job) throws IOException {
        config.set(player.getName() + ".job", job);
        save();
    }

    public static String getJob(Player player){
        if(config.isSet(player.getName() + ".job")){
            return config.getString(player.getName() + ".job");
        }else
            return "Kein Job";
    }

}
