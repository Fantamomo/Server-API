package at.leisner.server.client;

import java.io.IOException;

/**
 * Should be used in events, because the DumpClient cannot send Packet
 */
public interface DumpClient {
    /**
     * The ClientType of the DumpClient
     * @return The ClientType
     */
    String getType();

    /**
     * The {@link ClientMetaData} of the Client
     * @return The {@link ClientMetaData} of the Client
     */
    ClientMetaData getClientMetaData();

    /**
     * Disconnect the Client from the Server
     * @throws IOException ERROR
     */
    void disconnect() throws IOException;
}
