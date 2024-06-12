package at.leisner.server.logging;

import at.leisner.server.lang.Key;
import at.leisner.server.lang.Language;
import at.leisner.server.util.ColorCodes;

import java.util.logging.Level;

public class Logger extends java.util.logging.Logger {
    private Language language;
    private char alternativeColorCode = '$';
    private boolean translateAlternativeColorCode = true;
    public Logger(String name, String resourceBundleName, Language language) {
        super(name, resourceBundleName);
        this.language = language;
    }
    public Logger(String name, String resourceBundleName) {
        super(name, resourceBundleName);
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void lang(String key, Level level, Key... objects) {
        if (translateAlternativeColorCode) {
            log(level, ColorCodes.translateAlternativeColor(alternativeColorCode, language.format(key, objects)));
        } else {
            log(level, language.format(key, objects));
        }
    }
    public void lang(String key, String defaultValue, Level level, Key... objects) {
        if (translateAlternativeColorCode) {
            log(level, ColorCodes.translateAlternativeColor(alternativeColorCode, language.format(key, defaultValue, objects)));
        } else {
            log(level, language.format(key, defaultValue, objects));
        }
    }
    public void setAlternativeColorCode(char altCode) {
        alternativeColorCode = altCode;
    }

    public char getAlternativeColorCode() {
        return alternativeColorCode;
    }

    public boolean isTranslateAlternativeColorCode() {
        return translateAlternativeColorCode;
    }

    public void setTranslateAlternativeColorCode(boolean translateAlternativeColorCode) {
        this.translateAlternativeColorCode = translateAlternativeColorCode;
    }
}
