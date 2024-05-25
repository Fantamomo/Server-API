package at.leisner.server.plugin;

/**
 * If your Plugin have {@link Dependency} you can say the Server when your {@link Dependency} should load
 */
public enum LoadType {
    NORMAL,
    BEFORE,
    AFTER
}