package at.leisner.server.event.client;

import at.leisner.server.client.Client;
import at.leisner.server.event.Event;

public abstract class ClientEvent extends Event {
    protected Client client;

    public ClientEvent(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
