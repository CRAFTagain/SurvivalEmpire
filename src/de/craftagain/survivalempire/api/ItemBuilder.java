package de.craftagain.survivalempire.api;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemBuilder {

    public static ItemStack createItem(String name, Material mat){
        ItemStack stack = new ItemStack(mat);
        ItemMeta stackmeta = stack.getItemMeta();
        stackmeta.setDisplayName(name);
        stack.setItemMeta(stackmeta);

        return stack;
    }
}
