package at.leisner.server.client;

import at.leisner.server.plugin.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Could be used for save {@link Objects} be Client for a {@link String}
 */
public interface ClientMetaData {
    /**
     * Set an Object by the key
     * @param key KEY
     * @param object OBJECT
     * @param javaPlugin JAVAPLUGIN
     */
    void setMeta(String key, Object object, JavaPlugin javaPlugin);

    /**
     * Remove a Meta from the Client by the key
     * @param key The key
     * @return if it was success
     */
    boolean removeMeta(String key);

    /**
     * True if contains the key
     * @param key The key
     * @return If contains the key
     */
    boolean containsKey(String key);

    /**
     * True if contains the object witch was adding by the javaPlugin
     * @param object The object
     * @param javaPlugin The JavaPlugin
     * @return If contains the object
     */
    boolean containsValue(Object object, JavaPlugin javaPlugin);

    /**
     * Return the object
     * @param key The key
     * @return object
     */
    Object get(String key);

    /**
     * Return the object or the defaultObject
     * @param key The key
     * @param defaultObject The defaultObject
     * @return get(key) or defaultObject
     */
    Object getOrDefault(String key, Object defaultObject);
}
