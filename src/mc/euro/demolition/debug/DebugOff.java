package mc.euro.demolition.debug;

import java.util.Set;
import mc.alk.arena.objects.ArenaPlayer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * debug = new DebugOff(); will toggle debugging mode OFF.
 */
public class DebugOff implements DebugInterface {

    @Override
    public void log(String m, ChatColor... c) {
        // Doesn't log because Debugging is OFF.
    }

    @Override
    public void messagePlayer(Player p, String m) {
    }

    @Override
    public void msgArenaPlayers(Set<ArenaPlayer> players, String string) {
        
    }
    
}
