package at.leisner.server.event.client;

import at.leisner.server.client.Client;

public class ClientDisconnectEvent extends ClientEvent {
    private DisconnectReason disconnectReason = DisconnectReason.UNKNOWN;
    private Throwable throwable = null;
    public ClientDisconnectEvent(Client client) {
        super(client);
    }

    public ClientDisconnectEvent(Client client, DisconnectReason disconnectReason) {
        super(client);
        this.disconnectReason = disconnectReason;
    }

    public ClientDisconnectEvent(Client client, Throwable throwable) {
        this(client);
        this.disconnectReason = DisconnectReason.ERROR;
        this.throwable = throwable;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public DisconnectReason getDisconnectReason() {
        return disconnectReason;
    }

    @Override
    public void callEvent() {
    }

    public static enum DisconnectReason {
        DISCONNECT,
        ERROR,
        UNKNOWN
    }
}
