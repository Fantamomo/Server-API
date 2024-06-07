package at.leisner.packet;

import java.io.Serializable;

public class MessagePacket implements Serializable {
    private final String message;

    public MessagePacket(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static MessagePacket of(String message) {
        return new MessagePacket(message);
    }
}
