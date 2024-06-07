package at.leisner.packet;

import at.leisner.server.client.Client;

public interface PacketHandler {
    void handle(Client client, Packet packet);
}
