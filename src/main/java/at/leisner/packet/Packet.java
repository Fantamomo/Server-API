package at.leisner.packet;

import java.io.Serial;
import java.io.Serializable;

public record Packet(PacketType packetType, MessagePacket messagePacket, CustomPacket... objects) implements Serializable {
    @Serial
    private static final long serialVersionUID = 29092009L;

    public static Packet getMessagePacket(MessagePacket messagePacket, CustomPacket... packetObjects) {
        return new Packet(PacketType.MESSAGE, messagePacket, packetObjects);
    }

    public static Packet getPrivateMessagePacket(MessagePacket messagePacket, CustomPacket... packetObjects) {
        return new Packet(PacketType.MESSAGE_PRIVATE, messagePacket, packetObjects);
    }

    public static Packet getClientTypePacket(ClientTypePacket type) {
        return new Packet(PacketType.CLIENT_TYPE, MessagePacket.of("CLIENT_TYPE"), type);
    }
    public static Packet getDisconnectPacket() {
        return new Packet(PacketType.DISCONNECT, MessagePacket.of("DISCONNECT"),PacketObject.of(DisconnectReason.UNKNOWN));
    }
    public static Packet getDisconnectPacket(DisconnectReason disconnectReason) {
        return new Packet(PacketType.DISCONNECT, MessagePacket.of("DISCONNECT_REASON"), PacketObject.of(disconnectReason));
    }
}
