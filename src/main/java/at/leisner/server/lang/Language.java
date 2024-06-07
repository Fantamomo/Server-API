package at.leisner.server.lang;

import java.util.function.Consumer;

public interface Language {

    String get(String key);

    String get(String key, String defaultValue);
    String format(String key, Object... objects);
    String format(String key, String defaultValue, Object... objects);

    String getAndPrint(String key, Consumer<String> consumer);

    String getAndPrint(String key, String defaultValue, Consumer<String> consumer);
    String formatAndPrint(String key, Consumer<String> consumer, Object... objects);
    String formatAndPrint(String key, String defaultValue, Consumer<String> consumer, Object... objects);
}
