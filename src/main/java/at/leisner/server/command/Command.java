package at.leisner.server.command;

import java.util.List;

public abstract class Command {
    private final String name;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(String[] args);

    public List<String> tabComplete(String[] args) {
        return null;
    }
}
