package at.leisner.server.event;
import at.leisner.server.plugin.Plugin;

/**
 * The EventManager registers and unregisters Event.
 */
public interface EventManager {
    /**
     * Register a {@link Listener} for the plugin by the Server.
     * @param listener The listener with the methoden
     * @param plugin The plugin
     */
    void registerEvents(Listener listener, Plugin plugin);

    /**
     * Unregister the {@link Listener}
     * @param listener The listener
     */
    void unregisterEvents(Listener listener);

    /**
     * Unregister all {@link Listener}s from the plugin
     * @param plugin The plugin
     */
    void unregisterAllEvents(Plugin plugin);

    /**
     * Calls an event that extends from {@link Event}
     * @param event That event witch should call
     */
    void callEvent(Event event);
}