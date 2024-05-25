package at.leisner.server;

import at.leisner.server.command.CommandManager;
import at.leisner.server.event.EventManager;
import at.leisner.server.plugin.JavaPlugin;
import at.leisner.server.plugin.PluginManager;
import at.leisner.server.user.PermissionManager;

/**
 * Main class
 */
public interface Server {
    /**
     *
     * @return the current {@link PluginManager}
     */
    PluginManager getPluginmanager();
    /**
     *
     * @return the current {@link EventManager}
     */
    EventManager getEventManager();

    /**
     * Return the Plugin with the id
     * @param id the Plugin id
     * @return the Plugin or null if not Plugin was found
     */
    JavaPlugin getPlugin(String id);
    /**
     *
     * @return the current {@link CommandManager}
     */
    CommandManager getCommandManager();
    /**
     *
     * @return how many clients were connected since start
     */
    int getConnectedClientNumberSinceStart();

    /**
     * Return the {@link PermissionManager} if your Plugin is trust else null
     * @param javaPlugin the Plugin
     * @return the current {@link PermissionManager} or null
     */
    PermissionManager getUserManager(JavaPlugin javaPlugin);
}
