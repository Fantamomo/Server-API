package at.leisner.packet;

public record MessagePacket(String message, Object object) implements Packet {}
