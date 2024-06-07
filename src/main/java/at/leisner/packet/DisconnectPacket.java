package at.leisner.packet;

public record DisconnectPacket(DisconnectReason disconnectReason) implements Packet {

    public enum DisconnectReason {
        KICK,
        MANUEL,
        PROGRAMM_EXIT,
        UNKNOWN,
        ERROR
    }
}
