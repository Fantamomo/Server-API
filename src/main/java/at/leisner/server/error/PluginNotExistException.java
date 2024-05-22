package at.leisner.server.error;

import at.leisner.server.plugin.JavaPlugin;

public class PluginNotExistException extends RuntimeException {
    private final JavaPlugin plugin;
    public PluginNotExistException(JavaPlugin plugin) {
        super();
        this.plugin = plugin;
    }
    public PluginNotExistException(String message, JavaPlugin plugin) {
        super(message);
        this.plugin = plugin;
    }
    public PluginNotExistException(String message, Throwable cause, JavaPlugin plugin) {
        super(message, cause);
        this.plugin = plugin;
    }
    public PluginNotExistException(Throwable cause, JavaPlugin plugin) {
        super(cause);
        this.plugin = plugin;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }
}