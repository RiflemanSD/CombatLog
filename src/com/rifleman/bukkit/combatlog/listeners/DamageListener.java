/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rifleman.bukkit.combatlog.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 *
 * @author rifleman
 */
public class DamageListener implements Listener {
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDamage(org.bukkit.event.entity.EntityDamageByEntityEvent event) {
        if (event.isCancelled()) return;
        
        Entity dmgd = event.getEntity();
        if (dmgd instanceof Player) {
            Player damaged = (Player) dmgd;
            if (damaged.getNoDamageTicks() > damaged.getMaximumNoDamageTicks() / 2F) return;
            
            Entity dmgr = event.getDamager();
            if (dmgr instanceof Player) {
                Player damager = (Player) dmgr;
                
                EntityDamageEvent.DamageCause cause = event.getCause();
                double damage = event.getDamage();
                
                
                damager.sendMessage("Cause: " + cause.name() + " Dmg: " + damage);
                damaged.sendMessage("Cause: " + cause.name() + " Dmg: " + damage);
            }
        }
    }
}
