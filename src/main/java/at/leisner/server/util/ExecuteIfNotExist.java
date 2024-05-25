package at.leisner.server.util;

/**
 * A {@link FunctionalInterface} for the methods in {@link ServerUtil}
 * @param <T> The object witch should return
 */
@FunctionalInterface
public interface ExecuteIfNotExist<T> {
    /**
     * Will execute
     * @return Must return an object
     */
    public T execute();
}
