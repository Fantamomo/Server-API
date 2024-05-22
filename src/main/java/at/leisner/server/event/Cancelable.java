package at.leisner.server.event;

public interface Cancelable {
    boolean isCancelled();
    void setCancel(boolean state);
    void callIfCanceled();
}
