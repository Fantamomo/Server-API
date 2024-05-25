package at.leisner.server.util;

@FunctionalInterface
public interface ExecuteIfNotExist<T> {
    public T execute();
}
