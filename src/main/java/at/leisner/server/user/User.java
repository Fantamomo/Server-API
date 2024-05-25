package at.leisner.server.user;

import at.leisner.server.plugin.JavaPlugin;

/**
 * An interface for user
 */
public interface User {
    /**
     *
     * @return the username
     */
    String getUsername();

    /**
     * Add the user a {@link Permission}
     * @param permission the {@link Permission} to add
     */
    void addPermission(Permission permission);

    /**
     * Removed a {@link Permission} by the Permission name
     * @param permissionName the {@link Permission} name
     */
    void removePermission(String permissionName);

    /**
     * Return true if the User has the {@link Permission}
     * @param permissionName the {@link Permission} name
     * @return boolean true if the User has the {@link Permission}
     */
    boolean hasPermission(String permissionName);

    /**
     * Will you return true if the password of user and the parameter password are the same
     * @param password the password to control
     * @return if the password are the same
     */
    boolean authenticate(String password);

}
