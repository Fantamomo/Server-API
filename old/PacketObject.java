package at.leisner.packet;

import java.io.Serializable;

public class PacketObject implements CustomPacket {
    private final Object object;

    PacketObject(Object object) {
        this.object = object;
    }
    public static PacketObject of(Object object) {
        if (!(object instanceof Serializable)) return null;
        return new PacketObject(object);
    }

    @Override
    public Object getObject() {
        return object;
    }
}
