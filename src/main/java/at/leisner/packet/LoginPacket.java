package at.leisner.packet;

public class LoginPacket implements Packet{
    private final String username;
    private final byte[] password;


    public LoginPacket(String username, byte[] password) {
        this.username = username;
        this.password = password;
    }
    public LoginPacket(String username, String password) {
        this.username = username;
        this.password = password.getBytes();
    }

    public String username() {
        return username;
    }

    public byte[] password() {
        return password;
    }
}
