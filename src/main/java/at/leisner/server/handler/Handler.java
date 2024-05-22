package at.leisner.server.handler;

import at.leisner.server.client.Client;

import java.util.List;

public interface Handler {
    void setClientHandler(ClientHandler clientHandler);
    void setFilter(Filter filter);
    void setSettings(Settings settings);
    ClientHandler getClientHandler();
    Filter getFilter();
    Settings getSettings();
    void disableHandler();
    void enableHandler();
    List<Client> getCurrentClients();
    boolean isEnable();
}
