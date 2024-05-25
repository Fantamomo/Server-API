package at.leisner.server.user;

/**
 * The PermissionManager can only be used by Plugins that are trusted.
 */
public interface PermissionManager {
    /**
     * Add a user with username and password
     * @param username Username
     * @param password Password
     */
    void addUser(String username, String password);

    /**
     * Add a {@link Permission} to the username with the value
     * @param username The Username
     * @param permissionName The Permission String
     * @param value The value
     */
    void assignPermissionToUser(String username, String permissionName, boolean value);

    /**
     * Remove from username the {@link Permission}
     * @param username The Username
     * @param permissionName The {@link Permission}
     */
    void removePermissionFromUser(String username, String permissionName);

    /**
     * Return true if the username has the {@link Permission}
     * @param username The Username
     * @param permissionName The Permission to control
     * @return If the user has the {@link Permission}
     */
    boolean userHasPermission(String username, String permissionName);
}
