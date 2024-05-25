package at.leisner.server.user;

public interface PermissionManager {

    void addUser(String username, String password);

    void assignPermissionToUser(String username, String permissionName, boolean value);

    void removePermissionFromUser(String username, String permissionName);

    boolean userHasPermission(String username, String permissionName);

}
