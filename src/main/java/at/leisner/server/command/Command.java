package at.leisner.server.command;

import java.util.List;

public abstract class Command {
    protected final String name;
    private String permission = null;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(String label, String[] args);

    public List<String> tabComplete(String label, String[] args) {
        return null;
    }

    public String getPermission() {
        return permission;
    }

    protected void setPermission(String permission) {
        this.permission = permission;
    }
}
