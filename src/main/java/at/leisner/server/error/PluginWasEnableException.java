package at.leisner.server.error;

import at.leisner.server.plugin.JavaPlugin;

public class PluginWasEnableException extends RuntimeException {
    private final JavaPlugin plugin;
    public PluginWasEnableException(JavaPlugin plugin) {
        super();
        this.plugin = plugin;
    }
    public PluginWasEnableException(String message, JavaPlugin plugin) {
        super(message);
        this.plugin = plugin;
    }
    public PluginWasEnableException(String message, Throwable cause, JavaPlugin plugin) {
        super(message, cause);
        this.plugin = plugin;
    }
    public PluginWasEnableException(Throwable cause, JavaPlugin plugin) {
        super(cause);
        this.plugin = plugin;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }
}