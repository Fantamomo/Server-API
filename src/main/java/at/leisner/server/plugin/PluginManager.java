package at.leisner.server.plugin;

import at.leisner.server.error.PluginNotEnableException;
import at.leisner.server.error.PluginNotExistException;
import at.leisner.server.error.PluginNotFoundException;
import at.leisner.server.error.PluginWasEnableException;
import at.leisner.server.handler.ClientHandler;
import at.leisner.server.handler.Handler;

import java.io.*;
import java.util.*;

public interface PluginManager {
    void loadPlugin(File file) throws PluginNotFoundException;
    ClientHandler[] getTypeHandlers(String type);
    Map<String, Handler> getPluginHandlerForPlugin(JavaPlugin plugin) throws PluginNotEnableException, PluginNotExistException;
    void enablePlugin(JavaPlugin plugin) throws PluginWasEnableException, PluginNotExistException;
    JavaPlugin getPlugin(String id);
    void disablePlugin(JavaPlugin plugin) throws PluginNotEnableException, PluginNotExistException;
    Plugin getPluginInfo(JavaPlugin plugin);
    boolean isPluginEnable(JavaPlugin plugin);
    boolean pluginExist(String id) throws PluginNotExistException;
    @Deprecated
    void registerClientHandler(JavaPlugin plugin, String type, ClientHandler clientHandler);
    @Deprecated
    void unregisterClientHandler(JavaPlugin plugin, String type);
    @Deprecated
    void unregisterClientHandler(JavaPlugin plugin, ClientHandler clientHandler);
    @Deprecated
    void unregisterAllClientHandlers(JavaPlugin plugin);
    Handler getHandler(JavaPlugin plugin, String type);
    int countEnablePlugins();
    int countPlugins();
}
