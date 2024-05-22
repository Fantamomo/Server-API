package at.leisner.packet;

import java.io.Serializable;

public interface CustomPacket extends Serializable {
    Object getObject();
}
