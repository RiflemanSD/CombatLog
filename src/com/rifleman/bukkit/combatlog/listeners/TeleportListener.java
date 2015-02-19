/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rifleman.bukkit.combatlog.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

/**
 *
 * @author rifleman
 */
public class TeleportListener implements Listener {
    
    @EventHandler
    public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
        Player player = event.getPlayer();
        PlayerTeleportEvent.TeleportCause cause = event.getCause();
        Location from = event.getFrom();
        Location to = event.getTo();
        
        player.sendMessage("Cause: " + cause.name() + " From: " + from + " to: " + to);
    }
}
