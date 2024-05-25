package at.leisner.server.handler;

import at.leisner.server.client.Client;
import at.leisner.packet.Packet;

/**
 * The Filter interface
 */
public interface Filter {
    /**
     * Will execute if a Packet from the client arrived
     * @param client The client from the Packet comes
     * @param packet The Packet witch the client send
     * @return need to be true to pass to the {@link ClientHandler}
     */
    boolean filter(Client client, Packet packet);
}
