package at.leisner.server.handler;

import at.leisner.server.client.Client;

import java.util.List;

/**
 * A class to register {@link ClientHandler}, {@link Filter} and {@link Settings}
 */
public interface Handler {
    /**
     * Set the {@link ClientHandler}
     * @param clientHandler The clientHandler
     */
    void setClientHandler(ClientHandler clientHandler);

    /**
     * Set the {@link Filter}
     * @param filter The filter
     */
    void setFilter(Filter filter);

    /**
     * Set the {@link Settings}
     * @param settings The settings
     */
    void setSettings(Settings settings);

    /**
     * Get the {@link ClientHandler}
     * @return The ClientHandler
     */
    ClientHandler getClientHandler();

    /**
     * Get the {@link Filter}
     * @return The filter
     */
    Filter getFilter();

    /**
     * Get the {@link Settings}
     * @return The settings
     */
    Settings getSettings();

    /**
     * Disable the Handler
     */
    void disableHandler();

    /**
     * Enable the Handler
     */
    void enableHandler();

    /**
     * Return a list of the current Client that are connected with this Handler
     * @return a list of the current Client that are connected with this Handler
     */
    List<Client> getCurrentClients();

    /**
     * Return if this Handler is Enable
     * @return if this Handler is Enable
     */
    boolean isEnable();
}
