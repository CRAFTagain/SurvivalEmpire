package de.craftagain.survivalempire.command;

import de.craftagain.survivalempire.utils.config.Level;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_getLevel implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(command.getName().equalsIgnoreCase("getLevel")){
                if(args.length != 1){
                    return false;
                }

                for(Player current : Bukkit.getOnlinePlayers()){

                    if(args[0].equals(current.getName())){
                        player.sendMessage("§a " + current.getName() + " §7ist Level §6" + Level.getLevel(current));
                    }
                }
                return true;
            }
        }
        return false;
    }
}
