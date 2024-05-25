package at.leisner.packet;

/**
 * Packet witch must send from the Client else it will disconnect
 */
public class ClientTypePacket implements CustomPacket {
    /**
     * The type of the client
     */
    private final String type;
    ClientTypePacket(String type) {
        this.type = type;
    }

    /**
     * Return object in the Packet
     * @return object in the Packet
     */
    @Override
    public String getObject() {
        return type;
    }
    public static ClientTypePacket of(String type) {
        if (type == null) return null;
        return new ClientTypePacket(type);
    }

    /**
     * Return the type of Client
     * @return the type of client
     */
    public String getType() {
        return type;
    }
}
