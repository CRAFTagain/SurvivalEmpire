package de.craftagain.survivalempire.inventory;

import de.craftagain.survivalempire.inventory.item.Items;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PluginInventory {

    public static Inventory jobInv;

    public static void initInventorys(){

        jobInv = Bukkit.createInventory(null, 9*3, "§7Wähle einen Job!");
        jobInv.setItem(11, Items.lumberjackIcon);
        jobInv.setItem(12, Items.farmerIcon);
        jobInv.setItem(13, Items.adventurerIcon);
        jobInv.setItem(14, Items.minerIcon);
        jobInv.setItem(15, Items.craftsmanIcon);

    }

}
