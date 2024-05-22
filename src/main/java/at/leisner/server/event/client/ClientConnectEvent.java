package at.leisner.server.event.client;

import at.leisner.server.client.Client;
import at.leisner.server.event.Cancelable;
import at.leisner.server.event.Event;
import at.leisner.server.plugin.JavaPlugin;

import java.io.IOException;

public class ClientConnectEvent extends Event implements Cancelable {
    private boolean cancel = false;
    private final Client client;
    private final String type;
    private final JavaPlugin javaPlugin;

    public ClientConnectEvent(Client client, String type, JavaPlugin javaPlugin) {
        this.client = client;
        this.type = type;
        this.javaPlugin = javaPlugin;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancel(boolean state) {
        cancel = true;
    }

    @Override
    public void callIfCanceled() {
        try {
            client.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void callEvent() {
    }

    public Client getClient() {
        return client;
    }

    public String getType() {
        return type;
    }

    public JavaPlugin getJavaPlugin() {
        return javaPlugin;
    }
}
