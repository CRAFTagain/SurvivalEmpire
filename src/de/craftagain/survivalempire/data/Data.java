package de.craftagain.survivalempire.data;

import org.bukkit.Bukkit;

public class Data {

    private static String prefix = "§7[§6SurvivalEmpire§7]";
    private static String version = "0.01 - ALPHA";
    private static String authors = "§aCRAFTagain §7& §aalpharout";

    public static String getPrefix(){
        return prefix;
    }

    public static String getVersion(){
        return version;
    }

    public static String getAuthors(){
        return authors;
    }


    public static void log(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix + msg);
    }
}
