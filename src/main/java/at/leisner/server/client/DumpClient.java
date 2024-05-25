package at.leisner.server.client;

import java.io.IOException;

public interface DumpClient {
    String getType();
    ClientMetaData getClientMetaData();

    void disconnect() throws IOException;
}
