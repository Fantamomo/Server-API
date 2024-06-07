package at.leisner.server.handler;

import at.leisner.packet.Packet;
import at.leisner.packet.PacketHandler;
import at.leisner.server.client.Client;

import java.util.List;

/**
 * A class to register {@link ClientHandler}, {@link Filter} and {@link Settings}
 */
public interface Handler {
    /**
     * Set the {@link PacketHandler}
     * @param packetClass The packet for the {@link PacketHandler}
     * @param packetHandler The PacketHandler
     * @param <T> The Packet class
     */
    <T extends Packet> void setPacketHandler(Class<T> packetClass, PacketHandler packetHandler);

    /**
     * Set the {@link PacketHandler}
     * @param packetClasses The packets for the {@link PacketHandler}
     * @param packetHandler The PacketHandler
     */
    void setPacketHandler(List<Class<? extends Packet>> packetClasses, PacketHandler packetHandler);

    /**
     * Set the {@link Filter}
     * @param filter The filter
     */
    void setFilter(Filter filter);

    /**
     * Set the {@link Settings}
     * @param settings The settings
     */
    void setSettings(Settings settings);

    /**
     * Get the {@link PacketHandler}
     * @return The ClientHandler
     */
    <T> PacketHandler getPacketHandler(Class<T> packetClass);

    /**
     * Get the {@link Filter}
     * @return The filter
     */
    Filter getFilter();

    /**
     * Get the {@link Settings}
     * @return The settings
     */
    Settings getSettings();

    /**
     * Disable the Handler
     */
    <T extends Packet> void disableHandler(Class<T> packetClass);

    /**
     * Enable the Handler
     */
    <T extends Packet> void enableHandler(Class<T> packetClass);

    /**
     * Return a list of the current Client that are connected with this Handler
     * @return a list of the current Client that are connected with this Handler
     */
    List<Client> getCurrentClients();

    /**
     * Return if this Handler is Enable
     * @return if this Handler is Enable
     */
    <T extends Packet> boolean isEnable(Class<T> packetClass);
}
