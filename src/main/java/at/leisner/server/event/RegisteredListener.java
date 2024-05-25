package at.leisner.server.event;

import at.leisner.server.plugin.Plugin;

import java.lang.reflect.Method;

/**
 * Is a help class for the Server you will not need it to use
 */
public abstract class RegisteredListener {

    public abstract Listener getListener();

    public abstract Method getMethod();

    public abstract Plugin getPlugin();

    public abstract Class<? extends Event> getEventType();
}
