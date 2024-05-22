package at.leisner.server.handler;

import at.leisner.server.client.Client;
import at.leisner.packet.Packet;

public interface Filter {
    boolean filter(Client client, Packet packet);
}
