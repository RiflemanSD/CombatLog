/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rifleman.bukkit.combatlog;

import com.rifleman.bukkit.combatlog.database.RamDB;
import com.rifleman.bukkit.combatlog.listeners.DamageListener;
import com.rifleman.bukkit.combatlog.listeners.TeleportListener;
import java.util.logging.Logger;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

/**
 *
 * @author rifleman
 * @version 0.1.1
 */
public class CombatLog extends JavaPlugin {
    public static Logger log;
    public static PluginManager pm;
    public static BukkitScheduler bs;
    public static RamDB db;
    public static CombatLog instance;
    
    @Override
    public void onDisable() {
        log.info(PluginData.MESSAGE_ENABLE);
    }
    
    @Override
    public void onEnable() {
        instance = this;
        log = Logger.getLogger("Minecraft");
        pm = getServer().getPluginManager();
        bs = getServer().getScheduler();
        db = new RamDB();
        
        DamageListener dl = new DamageListener();
        TeleportListener tl = new TeleportListener();
        
        pm.registerEvents(dl, this);
        pm.registerEvents(tl, this);
        
        log.info(PluginData.MESSAGE_ENABLE);
    }
}
