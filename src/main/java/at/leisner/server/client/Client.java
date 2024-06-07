package at.leisner.server.client;

import at.leisner.packet.Packet;

import java.io.*;

/**
 * Represent the Client
 */
public interface Client {
    /**
     * Send a Packet to the Client
     * @param packet The Packet
     */
    void sendPacket(Packet packet);

    /**
     * Disconnect the Client from the Server
     * Also write a disconnect Packet to the client
     */
    void disconnect();

    /**
     * Get the ClientType of the Client
     * @return The ClientType
     */
    String getType();

    /**
     * Return the {@link ClientMetaData} for that client
     * @return {@link ClientMetaData}
     */
    ClientMetaData getClientMetaData();
}