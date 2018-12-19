package com.RoyalCraft.CORE;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.player;
import org.bukkit.Command;
import org.bukkit.CommandSender;

public class Main extends Javaplugin; {

    @Override 
    public void onEnable() {
        System.out.println("Core Enabled");
    }

    @Override
    public void OnDisable() {
        System.out.println("Core Disabled");
    }

    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {
        
        if(cmd.getName().equals("Heal")) {
           if (sender instanceof Player) {
               Player player = (Player) sender;
                
               player.sendMessage(ChatColor.GREEN + "You Have Been Healed");
               player.setHealth(100.0);
            } else {
                System.out.println("=======================")
                System.out.println("This Command Can Only be Used In Game")
                System.out.println("Do /heal In Game and it heal you")
                System.out.println("=======================")
            }

        }
        
        return false;
    }

}



