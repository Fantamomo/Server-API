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
     * @throws IOException If an object can the Packet couldn't Serializable
     */
    void sendPacket(Packet packet) throws IOException;

    /**
     * Disconnect the Client from the Server
     * Also write a disconnect Packet to the client
     * @throws IOException If there is an error writing the disconnect Packet to the client
     */
    void disconnect() throws IOException;

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