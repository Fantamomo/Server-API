package at.leisner.packet;

/**
 * Send to client if it disconnected
 */
public enum DisconnectReason {
    /**
     * A plugin kick the client
     */
    KICK,
    /**
     * The server banned the client. (Not Implemented)
     */
    BAN,
    /**
     * Kickt because of an error
     */
    ERROR,
    /**
     * THe disconnect reason is unknown
     */
    UNKNOWN,
    /**
     * Not for the server, for the client
     * If the Client programm ends this Packet will send from the client
     */
    MANUEL
}