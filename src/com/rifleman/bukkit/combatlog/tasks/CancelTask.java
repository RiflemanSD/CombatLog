
package com.rifleman.bukkit.combatlog.tasks;

import com.rifleman.bukkit.combatlog.CombatLog;
import org.bukkit.entity.Player;

/**
 *
 * @author rifleman
 */
public class CancelTask implements Runnable {
    private int id;
    
    public CancelTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        CombatLog.bs.cancelTask(id);
    }
}
