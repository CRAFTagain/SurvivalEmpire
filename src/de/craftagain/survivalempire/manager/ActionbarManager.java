package de.craftagain.survivalempire.manager;

import de.craftagain.survivalempire.main.SurvivalEmpire;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ActionbarManager {

    public static void addXpBar(Player player, String msg){

        IChatBaseComponent ichat = IChatBaseComponent.ChatSerializer.a("{\"text\":\"\"}").a(msg);
        PacketPlayOutChat packet = new PacketPlayOutChat(ichat, (byte) 2);

        CraftPlayer craftPlayer = (CraftPlayer) player;

        Bukkit.getScheduler().scheduleSyncRepeatingTask(SurvivalEmpire.getPlugin(SurvivalEmpire.class), () -> craftPlayer.getHandle().playerConnection.sendPacket(packet),0,20);
    }

}
