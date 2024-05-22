package at.leisner.server.handler;

import at.leisner.server.client.Client;

import java.io.DataInputStream;
import java.io.IOException;

public interface DataHandler {
    ClientAction handle(Client client, DataInputStream input) throws IOException;
}