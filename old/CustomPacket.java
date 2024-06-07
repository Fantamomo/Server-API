package at.leisner.packet;

import java.io.Serializable;

/**
 * Main interface for Packets
 * @see ClientTypePacket
 * @see PacketObject
 */
public interface CustomPacket extends Serializable {
    /**
     * The object witch was sendet by the Packet
     * @return the object
     */
    Object getObject();
}
