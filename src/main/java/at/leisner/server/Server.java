package at.leisner.server;

import at.leisner.server.command.CommandManager;
import at.leisner.server.event.EventManager;
import at.leisner.server.plugin.JavaPlugin;
import at.leisner.server.plugin.PluginManager;
import at.leisner.server.user.PermissionManager;

public interface Server {
    PluginManager getPluginmanager();
    EventManager getEventManager();
    JavaPlugin getPlugin(String id);
    CommandManager getCommandManager();
    int getConnectedClientNumberSinceStart();
    PermissionManager getUserManager(JavaPlugin javaPlugin);
}
