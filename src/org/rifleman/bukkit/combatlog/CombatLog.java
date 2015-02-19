/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rifleman.bukkit.combatlog;

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
    
    @Override
    public void onDisable() {
        log.info(PluginData.MESSAGE_ENABLE);
    }
    
    @Override
    public void onEnable() {
        log = Logger.getLogger("Minecraft");
        pm = getServer().getPluginManager();
        bs = getServer().getScheduler();
        
        log.info(PluginData.MESSAGE_ENABLE);
    }
}
