package at.leisner.server.event.plugin;

import at.leisner.server.event.Event;
import at.leisner.server.plugin.JavaPlugin;

public abstract class PluginEvent extends Event {
    private final JavaPlugin plugin;

    public PluginEvent(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }
}
