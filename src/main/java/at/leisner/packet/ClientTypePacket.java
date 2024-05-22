package at.leisner.packet;

public class ClientTypePacket implements CustomPacket {
    private final String type;
    ClientTypePacket(String type) {
        this.type = type;
    }

    @Override
    public String getObject() {
        return type;
    }
    public static ClientTypePacket of(String type) {
        if (type == null) return null;
        return new ClientTypePacket(type);
    }
    public String getType() {
        return type;
    }
}
