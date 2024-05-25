package at.leisner.server.event;

/**
 * The main Event class
 */
public abstract class Event {
    /**
     * calls when the Event was passed to all {@link Listener}s
     */
    public abstract void callEvent();
}
