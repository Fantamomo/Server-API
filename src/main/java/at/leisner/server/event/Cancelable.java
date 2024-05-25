package at.leisner.server.event;

/**
 * Can be implemented by a Class that extends from {@link Event}.
 */
public interface Cancelable {
    /**
     * Should return false if that event was cancelled
     * @return if the event was canceled
     */
    boolean isCancelled();

    /**
     * Should set that cancel state to state
     * @param state That state
     */
    void setCancel(boolean state);

    /**
     * Will be called if the event was canceled.
     */
    void callIfCanceled();
}
