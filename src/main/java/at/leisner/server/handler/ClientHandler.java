package at.leisner.server.handler;

import at.leisner.server.client.Client;
import at.leisner.packet.Packet;

import java.io.IOException;

public interface ClientHandler {
    /**
     * Will execute if a {@link Client} send a packet and the {@link Filter} doesn't stopp it
     * @param client The Client witch send the Message
     * @param packet The Packet witch the Client send
     * @throws IOException If your reading code throw a {@link IOException} the server will ignore it
     */
    void handle(Client client, Packet packet) throws IOException;
}