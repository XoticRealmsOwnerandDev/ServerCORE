package com.RoyalCraft.CORE;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.player;
import org.bukkit.Command;
import org.bukkit.CommandSender;

public class Main extends Javaplugin; {

    @Override 
    public void onEnable() {
        system.out.println("Core Enabled");
    }

    @Override
    public void OnDisable() {
        system.out.println("Core Disabled");
    }

    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {
        
        if(cmd.getName().equals("Heal")) {
           if (sender instanceof Player) {
               Player player = (Player) sender;
                
               player.sendMessage("You Have Been Healed");
            } else {
                system.out.println("You Cannot Use This Command In Console")
            }

        }
        
        return false;
    }

}



