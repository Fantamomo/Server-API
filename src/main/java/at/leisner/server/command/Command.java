package at.leisner.server.command;

import at.leisner.server.plugin.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class Command {

    protected final String name;
    protected JavaPlugin javaPlugin;
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

    public String getHelp() {
        if (javaPlugin.getPluginDirectory().getLang() != null) {
            String helpPath = "command."+name+".help";
            if (!helpPath.equals(javaPlugin.getPluginDirectory().getLang().get(helpPath))) {
                return javaPlugin.getPluginDirectory().getLang().get(helpPath);
            }
        }
        return null;
    }

}
