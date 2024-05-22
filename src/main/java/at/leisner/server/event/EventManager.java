package at.leisner.server.event;
import at.leisner.server.plugin.Plugin;

public interface EventManager {
    void registerEvents(Listener listener, Plugin plugin);

    void unregisterEvents(Listener listener);

    void unregisterAllEvents(Plugin plugin);

    void callEvent(Event event);
}