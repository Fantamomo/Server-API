package at.leisner.server.error;

import at.leisner.server.plugin.JavaPlugin;

public class PluginNotEnableException extends RuntimeException {
    private JavaPlugin plugin;
    public PluginNotEnableException(JavaPlugin plugin) {
        super();
        this.plugin = plugin;
    }
    public PluginNotEnableException(String message, JavaPlugin plugin) {
        super(message);
        this.plugin = plugin;
    }
    public PluginNotEnableException(String message, Throwable cause, JavaPlugin plugin) {
        super(message, cause);
        this.plugin = plugin;
    }
    public PluginNotEnableException(Throwable cause, JavaPlugin plugin) {
        super(cause);
        this.plugin = plugin;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }
}