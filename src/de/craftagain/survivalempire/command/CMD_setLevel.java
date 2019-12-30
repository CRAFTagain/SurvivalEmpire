package de.craftagain.survivalempire.command;

import de.craftagain.survivalempire.manager.ScoreboardManager;
import de.craftagain.survivalempire.utils.config.Level;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;

public class CMD_setLevel implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(command.getName().equalsIgnoreCase("setLevel")){
                if(args.length != 2){
                    return false;
                }

                for(Player current : Bukkit.getOnlinePlayers()){
                    if(args[0].equals(current.getName())){

                        try{
                            Level.setLevel(current, Integer.parseInt(args[1]));
                            ScoreboardManager.addScoreboard(current);

                        }catch(NumberFormatException | IOException e){

                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
