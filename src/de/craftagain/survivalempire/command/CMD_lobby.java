package de.craftagain.survivalempire.command;

import de.craftagain.survivalempire.main.SurvivalEmpire;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class CMD_lobby implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            if(command.getName().equals("lobby")){
                if(args.length != 0){
                    return false;
                }

                ByteArrayOutputStream b = new ByteArrayOutputStream();
                DataOutputStream out = new DataOutputStream(b);

                try {

                    out.writeUTF("Connect");
                    out.writeUTF("lobby");

                }catch(IOException e){

                    e.printStackTrace();

                }

                player.sendPluginMessage(SurvivalEmpire.getPlugin(SurvivalEmpire.class), "BungeeCord", b.toByteArray());
                return true;
            }
        }
        return false;
    }
}
