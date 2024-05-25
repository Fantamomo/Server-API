package at.leisner.server.plugin;

import at.leisner.packet.Packet;
import at.leisner.server.Server;

import java.io.File;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class JavaPlugin {
    private Server fantaServerServer;
    private Logger fantaServerLogger;
    private File fantaServerDirectory;
    private ClassLoader fantaServerClassLoader;
    protected boolean debug = true;
    protected String[] allowedPackets;

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
    public final File getPluginDirectory() {
        return fantaServerDirectory;
    }
    protected final boolean makePluginDirectory() {
        return getPluginDirectory().mkdir();
    }
    public Packet getPacket(ObjectInputStream objectInputStream) {
        return null;
    }

    public ClassLoader getClassLoader() {
        return fantaServerClassLoader;
    }
    public void debug(String msg) {
        if (!debug) return;
        getLogger().log(Level.CONFIG, msg);
    }

    public String[] getAllowedPackets() {
        return allowedPackets;
    }
}