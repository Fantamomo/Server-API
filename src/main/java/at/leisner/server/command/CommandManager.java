package at.leisner.server.command;

import at.leisner.server.plugin.JavaPlugin;

/**
 * The CommandManager
 */
public interface CommandManager {

    /**
     * Register the command by the server
     * @param javaPlugin The JavaPlugin
     * @param command The command
     */
    void registerCommand(JavaPlugin javaPlugin, Command command);

    /**
     * Register the command by the server
     * @param javaPlugin The JavaPlugin
     * @param command The command
     * @param label The name of the command
     */
    void registerCommand(JavaPlugin javaPlugin, String label, Command command);

    /**
     * Unregister the command by the server
     * @param javaPlugin The JavaPlugin
     * @param label The command
     */

    void unregisterCommand(JavaPlugin javaPlugin, String label);

    /**
     * Return the command by the label
     * @param label The label
     * @return the command
     */
    Command getCommand(String label);

    /**
     * Return true if the command is registered
     * @param command the command
     * @return if the command is registered
     */
    boolean isCommandRegistered(Command command);

    /**
     * Return true if the command is registered
     * @param command the command
     * @return if the command is registered
     */
    boolean isCommandRegistered(String command);
}
