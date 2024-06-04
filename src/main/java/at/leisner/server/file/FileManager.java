package at.leisner.server.file;

import at.leisner.server.lang.Language;

import java.io.File;

public interface FileManager {
    File getPluginDirectory();
    File createPluginDirectory();
    File createFile(String file);
    File getFile(String file);
    File createFile(String file, boolean ignoreIfExist);

    Language createLang();
    File createConfigFile();
    File getConfig();
    Language getLang();
    boolean exist(String file);
}
