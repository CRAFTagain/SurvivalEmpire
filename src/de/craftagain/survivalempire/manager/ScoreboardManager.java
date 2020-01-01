package de.craftagain.survivalempire.manager;

import de.craftagain.survivalempire.data.Data;
import de.craftagain.survivalempire.utils.config.Job;
import de.craftagain.survivalempire.utils.config.Level;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class ScoreboardManager {

    private static Team lvl;
    private static Team job;

    public static void addScoreboard(Player player){

        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective obj = board.registerNewObjective("aaa", "bbb");

        lvl = board.registerNewTeam("lvl");
        lvl.setPrefix("§a" + Level.getLevel(player));
        lvl.addEntry("§a");

        job = board.registerNewTeam("job");
        switch(Job.getJob(player)){

            case "lumberjack":
                job.setPrefix("§aHolzfäller");
                break;
            case "farmer":
                job.setPrefix("§aLandwirt");
                break;
            case "adventurer":
                job.setPrefix("§aAbenteurer");
                break;
            case "miner":
                job.setPrefix("§aBergarbeiter");
                break;
            case "craftsman":
                job.setPrefix("§aHandwerker");
                break;
        }
        job.addEntry("§b");

        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName(Data.getPrefix());

        obj.getScore("§7Level:").setScore(5);
        obj.getScore("§a").setScore(4);
        obj.getScore("§7Dein Job:").setScore(3);
        obj.getScore("§b").setScore(2);

        player.setScoreboard(board);

    }

    public static void updateLevel(Player player){

        lvl.setPrefix("§a" + Level.getLevel(player));
    }

    public static void updateJob(Player player){
        switch(Job.getJob(player)){

            case "lumberjack":
                job.setPrefix("§aHolzfäller");
                break;
            case "farmer":
                job.setPrefix("§aLandwirt");
                break;
            case "adventurer":
                job.setPrefix("§aAbenteurer");
                break;
            case "miner":
                job.setPrefix("§aBergarbeiter");
                break;
            case "craftsman":
                job.setPrefix("§aHandwerker");
                break;
        }
    }


}
