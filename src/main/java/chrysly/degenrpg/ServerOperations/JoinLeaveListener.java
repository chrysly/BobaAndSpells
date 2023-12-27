package chrysly.degenrpg.ServerOperations;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void OnJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();

        e.setJoinMessage(ChatColor.YELLOW + p.getDisplayName() + " joined the server.\n" +
                ChatColor.WHITE + "Quick, now's the perfect chance to loot their items while they're loading.");
    }

    @EventHandler
    public void OnLeave(PlayerQuitEvent e) {

        Player p = e.getPlayer();

        e.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + " left the server.\n" +
                ChatColor.WHITE + "Quick, now's the perfect chance to loot their house while they're gone.");
    }
}
