package at.leisner.server.event.client;

import at.leisner.server.client.Client;
import at.leisner.server.client.DumpClient;
import at.leisner.server.event.Event;

public abstract class ClientEvent extends Event {
    protected DumpClient client;

    public ClientEvent(DumpClient client) {
        this.client = client;
    }

    public DumpClient getClient() {
        return client;
    }
}
