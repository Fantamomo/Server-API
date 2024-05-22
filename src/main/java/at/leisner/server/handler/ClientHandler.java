package at.leisner.server.handler;

import at.leisner.server.client.Client;
import at.leisner.packet.Packet;

import java.io.IOException;

public interface ClientHandler {
    void handle(Client client, Packet packet) throws IOException;
}