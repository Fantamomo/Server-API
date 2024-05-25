package at.leisner.server.client;

import at.leisner.server.plugin.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public interface ClientMetaData {

    void setMeta(String key, Object object, JavaPlugin javaPlugin);
    boolean removeMeta(String key);
    boolean containsKey(String key);
    boolean containsValue(Object object, JavaPlugin javaPlugin);
    Object get(String key);
    Object getOrDefault(String key, Object defaultObject);
}
