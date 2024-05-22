package at.leisner.packet;

import java.io.Serial;
import java.io.Serializable;

public record Packet(PacketType packetType, CustomPacket... objects) implements Serializable {
    @Serial
    private static final long serialVersionUID = 29092009L;

    public static Packet getMessagePacket(CustomPacket... packetObjects) {
        return new Packet(PacketType.MESSAGE, packetObjects);
    }

    public static Packet getPrivateMessagePacket(CustomPacket... packetObjects) {
        return new Packet(PacketType.MESSAGE_PRIVATE, packetObjects);
    }

    public static Packet getClientTypePacket(ClientTypePacket type) {
        return new Packet(PacketType.CLIENT_TYPE, type);
    }
    public static Packet getDisconnectPacket() {
        return new Packet(PacketType.DISCONNECT, PacketObject.of(DisconnectReason.UNKNOWN));
    }
    public static Packet getDisconnectPacket(DisconnectReason disconnectReason) {
        return new Packet(PacketType.DISCONNECT, PacketObject.of(disconnectReason));
    }
}
