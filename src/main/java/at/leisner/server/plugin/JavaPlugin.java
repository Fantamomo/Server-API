package at.leisner.server.plugin;

import at.leisner.packet.Packet;
import at.leisner.server.Server;
import jdk.jfr.Experimental;

import java.io.File;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * If you want to create a Plugin you need this class. Also your Plugin need the {@link Plugin} annotation
 * @see Plugin
 */
public abstract class JavaPlugin {
    /**
     * A private field that stores the {@link Server} to get it use {@code this.getServer()}
     */
    private Server fantaServerServer;
    /**
     * A private field that stores the {@link Logger} for the plugin to get it use {@code this.getLoger()}
     */
    private Logger fantaServerLogger;
    /**
     * A private field that stores the Directory ({@link File}) for the plugin to get it use {@code this.getPluginDirectory()}
     */
    private File fantaServerDirectory;
    /**
     * A private field that stores the Classloader of the Plugin. You don't need to use it
     */
    private ClassLoader fantaServerClassLoader;
    /**
     * You can use {@code this.debug()} if you want to debug your plugin. Later you can change this field to false
     * so your plugin will ignore this methode
     */
    protected boolean debug = true;
    /**
     * This is an optional field in the list you can set {@link String}s so only if the client send a {@link Packet} with {@link at.leisner.packet.MessagePacket}
     * and the Message is in the liste the {@link at.leisner.server.handler.ClientHandler} will execute
     */
    protected String[] allowedPackets = null;

    /**
     * A methode that will return the current server
     * @return the server
     */

    public final Server getServer() {
        return fantaServerServer;
    }

    /**
     * Will execute if the Server had load all plugins before he sorted the Plugins after {@link Dependency}
     * @return If the return value is false your Plugin will not enable
     */
    public boolean onLoad() {
        return true;
    }

    /**
     * Will execute if the Server had load all Plugins
     */
    public void onEnable() {
    }

    /**
     * Will execute if the server stopps.
     * If you had open Files or Streams close them in this methode
     */
    public void onDisable() {
    }

    /**
     * Return the {@link Logger} for the Plugin
     * @return The Logger
     */
    public final Logger getLogger() {
        return fantaServerLogger;
    }

    /**
     * Return the Directory witch is for the plugin. Please use only this Directory
     * @return The Plugin-Directory
     */
    public final File getPluginDirectory() {
        return fantaServerDirectory;
    }

    /**
     * Makes the Plugin-Directory
     * @return if the Directory was make successes
     */
    protected final boolean makePluginDirectory() {
        return getPluginDirectory().mkdir();
    }

    /**
     * This methode is only for the Server to load CustomClasse. You don't need it to use
     * @return The classloader from the Plugin
     */
    public ClassLoader getClassLoader() {
        return fantaServerClassLoader;
    }

    /**
     * A methode that do only things when the field "debug" is true
     * @param msg The message to print in the Console
     */
    public void debug(String msg) {
        if (!debug) return;
        getLogger().log(Level.CONFIG, msg);
    }

    /**
     * For the Server to control if the Packet from a Client should be allowed to pass
     * @return A list of allowedPackets
     */
    public String[] getAllowedPackets() {
        return allowedPackets;
    }
}