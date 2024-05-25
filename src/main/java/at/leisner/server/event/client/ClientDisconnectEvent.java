package at.leisner.server.event.client;

import at.leisner.server.client.Client;
import at.leisner.server.client.DumpClient;

public class ClientDisconnectEvent extends ClientEvent {
    private DisconnectReason disconnectReason = DisconnectReason.UNKNOWN;
    private Throwable throwable = null;
    public ClientDisconnectEvent(DumpClient client) {
        super(client);
    }

    public ClientDisconnectEvent(DumpClient client, DisconnectReason disconnectReason) {
        super(client);
        this.disconnectReason = disconnectReason;
    }

    public ClientDisconnectEvent(DumpClient client, Throwable throwable) {
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
