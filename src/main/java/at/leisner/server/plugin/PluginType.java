package at.leisner.server.plugin;

/**
 * Use in the {@link Plugin} to say the Server what Plugin it is.
 * Standard: {@link PluginType}.CLIENT_HANDLER
 */
public enum PluginType {
    /**
     * That your Plugin is a CLIENT_HANDLER
     */
    CLIENT_HANDLER,

    /**
     * That your Plugin add Managerment to the Server,
     * but all client handler registering will be ignor.
     */
    SERVER_MANAGER,

    /**
     * That your Plugin add classes for other Plugnins
     */
    API,

    /**
     * Something else
     */
    ELSE
}
