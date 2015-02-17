package com.rifleman.bukkit.combatlog.tasks;


import com.rifleman.bukkit.combatlog.CombatLog;
import com.rifleman.bukkit.combatlog.database.RamDB;
import org.bukkit.entity.Player;

public class CombatPlayerTask implements Runnable {
    private Player damager;
    private RamDB db;

    public CombatPlayerTask(Player damager) {
	this.damager = damager;
        
        db = CombatLog.db;
    }

    @Override
    public void run() {
        db.remove(damager);
    }
}
