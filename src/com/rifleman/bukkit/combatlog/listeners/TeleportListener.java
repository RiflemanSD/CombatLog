/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rifleman.bukkit.combatlog.listeners;

import com.rifleman.bukkit.combatlog.CombatLog;
import com.rifleman.bukkit.combatlog.tasks.CombatPlayerTask;
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
    public TeleportListener() {
        
    }
    @EventHandler
    public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
        Player player = event.getPlayer();
        PlayerTeleportEvent.TeleportCause cause = event.getCause();
        Location from = event.getFrom();
        Location to = event.getTo();
        
        player.sendMessage("Cause: " + cause.name() + " From: " + from + " to: " + to);
        
        Player p = CombatLog.db.get(player);
        
        if (p != null) {
            int sec = 5;
            CombatLog.bs.runTaskLater(CombatLog.instance, new CombatPlayerTask(player), 20*sec);
            player.sendMessage("[CombatLog] You are not longer in Combat. You many logout.");
            p.sendMessage("[CombatLog] You are not longer in Combat. You many logout.");
        }
    }
}
