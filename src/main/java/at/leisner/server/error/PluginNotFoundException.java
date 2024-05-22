package at.leisner.server.error;

public class PluginNotFoundException extends RuntimeException {
    private final String id;
    public PluginNotFoundException(String id) {
        super();
        this.id = id;
    }
    public PluginNotFoundException(String message, String id) {
        super(message);
        this.id = id;
    }
    public PluginNotFoundException(String message, Throwable cause, String id) {
        super(message, cause);
        this.id = id;
    }
    public PluginNotFoundException(Throwable cause, String id) {
        super(cause);
        this.id = id;
    }
    public String getId() {
        return id;
    }
}