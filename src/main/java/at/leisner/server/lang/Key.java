package at.leisner.server.lang;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Key {
    private final String key;
    private final String value;

    public Key(String key, Object value) {
        this.key = key;
        this.value = String.valueOf(value);
    }

    public Key(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String key() {
        return key;
    }

    public String value() {
        return value;
    }
    public static Key of(String key, Object value) {
        return new Key(key, value);
    }

    public static Key of(String key, String value) {
        return new Key(key, value);
    }
    public static Key[] of(Map<String, Object> data) {
        return (Key[]) data.entrySet().stream().map(entry -> Key.of(entry.getKey(), entry.getValue())).toArray();
    }
}
