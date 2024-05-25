package at.leisner.server.event.client;

import at.leisner.packet.Packet;
import at.leisner.packet.PacketType;
import at.leisner.server.client.Client;
import at.leisner.server.client.DumpClient;

public class ClientSendPacketEvent extends ClientEvent {
    private Packet packet;
    public ClientSendPacketEvent(DumpClient client, Packet packet) {
        super(client);
        this.packet = packet;
    }

    @Override
    public void callEvent() {
    }

    public Packet getPacket() {
        if (packet.packetType() == PacketType.MESSAGE_PRIVATE) return null;
        return packet;
    }
    public PacketType getPacketType() {
        return packet.packetType();
    }
}
