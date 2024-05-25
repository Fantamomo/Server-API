package at.leisner.server.client;

import at.leisner.packet.Packet;

import java.io.*;

public interface Client {

    void sendPacket(Packet packet) throws IOException;

    void disconnect() throws IOException;
    String getType();
    ClientMetaData getClientMetaData();
}