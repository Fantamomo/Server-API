package at.leisner.server.user;

import at.leisner.server.plugin.JavaPlugin;

public interface User {
    String getUsername();

    void addPermission(Permission permission);

    void removePermission(String permissionName);

    boolean hasPermission(String permissionName);
    boolean authenticate(String password);

}
