package de.craftagain.survivalempire.inventory.item;

import de.craftagain.survivalempire.api.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Items {

    public static ItemStack lumberjackIcon, minerIcon, farmerIcon, adventurerIcon, craftsmanIcon;

    public static void initItems(){

        lumberjackIcon = ItemBuilder.createItem("§aHolzfäller", Material.WOOD_AXE);
        minerIcon = ItemBuilder.createItem("§aBergarbeiter", Material.DIAMOND_PICKAXE);
        farmerIcon = ItemBuilder.createItem("§aLandwirt", Material.WHEAT);
        adventurerIcon = ItemBuilder.createItem("§aAbenteurer", Material.DIAMOND_SWORD);
        craftsmanIcon = ItemBuilder.createItem("§aHandwerker", Material.WORKBENCH);
    }

}
