
package com.rifleman.bukkit.combatlog.database;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.entity.Player;

/**
 *
 * @author rifleman
 */
public class RamDB {
    private Map<Player, Player> players;
    
    public RamDB() {
        players = new HashMap<Player, Player>();
    }
    
    public void insert(Player damager, Player damaged) {
        players.put(damager, damaged);
    }
    public void remove(Player damager) {
        players.remove(damager);
    }
    
    public Player get(Player player) {
        if (!this.players.containsKey(player)) return null;
        
        return this.players.get(player);
    }
}
