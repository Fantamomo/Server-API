package at.leisner.server.event.server;

import at.leisner.server.Server;
import at.leisner.server.event.Event;

public abstract class ServerEvent extends Event {
    private final Server server;

    public ServerEvent(Server server) {
        this.server = server;
    }

    public Server getServer() {
        return server;
    }
}
