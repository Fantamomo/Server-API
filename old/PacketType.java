package at.leisner.packet;

import java.io.Serializable;

public enum PacketType implements Serializable {
    MESSAGE,
    CLIENT_TYPE,
    DISCONNECT,
    DISCONNECT_WRONG_CLIENT_TYPE,
    MESSAGE_PRIVATE,
}