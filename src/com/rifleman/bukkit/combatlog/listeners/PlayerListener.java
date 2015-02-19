/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rifleman.bukkit.combatlog.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 *
 * @author user01
 */
public class PlayerListener implements Listener {
    
    public PlayerListener() {
        
    }
    
    @EventHandler
    public void onPlayerRespawn(org.bukkit.event.player.PlayerRespawnEvent event) {
        /*Player player = event.getPlayer();
        Location loc = event.getRespawnLocation();
        String l = "Loc : " + loc.getBlockX() +","+ loc.getBlockY() +","+ loc.getBlockZ();
        
        player.sendMessage(l);*/
    }
}
