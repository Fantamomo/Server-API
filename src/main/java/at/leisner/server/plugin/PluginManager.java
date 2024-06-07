package at.leisner.server.plugin;

import at.leisner.server.error.PluginNotEnableException;
import at.leisner.server.error.PluginNotExistException;
import at.leisner.server.error.PluginNotFoundException;
import at.leisner.server.error.PluginWasEnableException;
import at.leisner.server.handler.ClientHandler;
import at.leisner.server.handler.Handler;

import java.io.*;
import java.util.*;

/**
 * The PluginManager class load, enable, disable, usw. Plugins
 */
public interface PluginManager {
    /**
     * Return {@link ClientHandler}[] for the type.
     * @param type The Client type
     * @return A list of {@link ClientHandler}s
     */
    ClientHandler[] getTypeHandlers(String type);

    /**
     * Return a Map of {@link String} and {@link Handler} for the plugin
     * @param plugin The plugin
     * @return A Map of {@link String} and {@link Handler}
     * @throws PluginNotEnableException If the plugin is not enable
     * @throws PluginNotExistException if the plugin not exist
     */
    Map<String, Handler> getPluginHandlerForPlugin(JavaPlugin plugin) throws PluginNotEnableException, PluginNotExistException;

    /**
     * Enable the plugin and execute the {@code JavaPlugin.onEnable()} methode
     * @param plugin The Plugin
     * @throws PluginWasEnableException If the plugin was already enable
     * @throws PluginNotExistException If the plugin does not exist
     */
    void enablePlugin(JavaPlugin plugin) throws PluginWasEnableException, PluginNotExistException;

    /**
     * Return the plugin with the id
     * @param id The id
     * @return The plugin
     */
    JavaPlugin getPlugin(String id);

    /**
     * Disable the plugin and all {@link at.leisner.server.event.Listener} or {@link ClientHandler} from it.
     * @param plugin The plugin
     * @throws PluginNotEnableException If the plugin was already disable
     * @throws PluginNotExistException If the plugin does not exist
     */
    void disablePlugin(JavaPlugin plugin) throws PluginNotEnableException, PluginNotExistException;

    /**
     * Return the {@link Plugin} annotation of the plugin
     * @param plugin The plugin
     * @return The {@link Plugin} annotation
     */
    Plugin getPluginInfo(JavaPlugin plugin);

    /**
     * Return true if the plugin is enabled
     * @param plugin The plugin
     * @return if it is enabled
     */
    boolean isPluginEnable(JavaPlugin plugin);

    /**
     * Return true if a plugin with the id exist
     * @param id The Plugin id
     * @return if a plugin with the id exist
     */
    boolean pluginExist(String id);

    /**
     * Return the {@link Handler} for the type
     * @param plugin The plugin for witch the Handler will be registered
     * @param type The Client type
     * @return A {@link Handler} or null if the plugin has not registered the type
     */
    Handler getHandler(JavaPlugin plugin, String type);

    /**
     * The count how many Plugins are enable
     * @return the count of enable plugins
     */
    int countEnablePlugins();

    /**
     * The count of all Plugin that are registered by the server
     * @return The count of Plugins
     */
    int countPlugins();
}
