package at.leisner.server.command;

public interface CommandManager {

    void registerCommand(Command command);

    void unregisterCommand(String name);

    Command getCommand(String name);
}
