package chrysly.degenrpg;

import chrysly.degenrpg.ServerOperations.JoinLeaveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class DegenRPG extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[Degen] Plugin initialized!");
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
