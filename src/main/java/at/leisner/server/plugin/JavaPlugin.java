package at.leisner.server.plugin;

import at.leisner.server.Server;

import java.util.logging.Logger;

public abstract class JavaPlugin {
    private Server fantaServerServer;
    private Logger fantaServerLogger;

    public final Server getServer() {
        return fantaServerServer;
    }
    public boolean onLoad() {
        return true;
    }
    public void onEnable() {
    }
    public void onDisable() {
    }
    public final Logger getLogger() {
        return fantaServerLogger;
    }
}