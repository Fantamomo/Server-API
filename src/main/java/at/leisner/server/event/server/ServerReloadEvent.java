package at.leisner.server.event.server;

import at.leisner.server.Server;

public class ServerReloadEvent extends ServerEvent {
    private ReloadReason reloadReason = ReloadReason.UNKNOWN;
    public ServerReloadEvent(Server server) {
        super(server);
    }

    public ServerReloadEvent(Server server, ReloadReason reloadReason) {
        super(server);
        this.reloadReason = reloadReason;
    }

    @Override
    public void callEvent() {

    }

    public ReloadReason getReloadReason() {
        return reloadReason;
    }

    public enum ReloadReason {
        ERROR,
        AUTOMATIC,
        MANUEL,
        UNKNOWN
    }
}
