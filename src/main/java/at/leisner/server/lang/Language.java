package at.leisner.server.lang;

import java.util.function.Consumer;

public interface Language {

    String get(String key);

    String get(String key, String defaultValue);
    String format(String key, Key... objects);
    String format(String key, String defaultValue, Key... objects);

    String getAndPrint(String key, Consumer<String> consumer);

    String getAndPrint(String key, String defaultValue, Consumer<String> consumer);
    String formatAndPrint(String key, Consumer<String> consumer, Key... objects);
    String formatAndPrint(String key, String defaultValue, Consumer<String> consumer, Key... objects);
}
