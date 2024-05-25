package at.leisner.server.command;

import at.leisner.server.plugin.JavaPlugin;

public interface CommandManager {

    void registerCommand(JavaPlugin javaPlugin, Command command);
    void registerCommand(JavaPlugin javaPlugin, String label, Command command);

    void unregisterCommand(JavaPlugin javaPlugin, String label);

    Command getCommand(String label);
    boolean isCommandRegistered(Command command);
    boolean isCommandRegistered(String command);
}
