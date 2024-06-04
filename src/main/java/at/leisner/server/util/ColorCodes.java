package at.leisner.server.util;

import java.awt.Color;

public enum ColorCodes {
    RESET('0', "\u001B[0m", null),
    BLACK('1', "\u001B[30m", Color.BLACK),
    RED('2', "\u001B[31m", Color.RED),
    GREEN('3', "\u001B[32m", Color.GREEN),
    YELLOW('4', "\u001B[33m", Color.YELLOW),
    BLUE('5', "\u001B[34m", Color.BLUE),
    PURPLE('6', "\u001B[35m", new Color(128, 0, 128)),
    CYAN('7', "\u001B[36m", Color.CYAN),
    WHITE('8', "\u001B[37m", Color.WHITE),
    BOLD('9', "\u001B[1m", null),
    UNDERLINE('A', "\u001B[4m", null),
    REVERSED('B', "\u001B[7m", null),
    BRIGHT_BLACK('C', "\u001B[90m", new Color(105, 105, 105)),
    BRIGHT_RED('D', "\u001B[91m", new Color(255, 0, 0)),
    BRIGHT_GREEN('E', "\u001B[92m", new Color(0, 255, 0)),
    BRIGHT_YELLOW('F', "\u001B[93m", new Color(255, 255, 0)),
    BRIGHT_BLUE('G', "\u001B[94m", new Color(0, 0, 255)),
    BRIGHT_PURPLE('H', "\u001B[95m", new Color(255, 0, 255)),
    BRIGHT_CYAN('I', "\u001B[96m", new Color(0, 255, 255)),
    BRIGHT_WHITE('J', "\u001B[97m", new Color(255, 255, 255)),
    ORANGE('K', "\033[38;5;208m", new Color(255, 136, 0));

    private final char code;
    private final String escapeCode;
    private final Color color;

    ColorCodes(char code, String escapeCode, Color color) {
        this.code = code;
        this.escapeCode = escapeCode;
        this.color = color;
    }

    public char getCode() {
        return code;
    }

    public String getEscapeCode() {
        return escapeCode;
    }

    public Color getColor() {
        return color;
    }
    public String getAnsiCode() {
        return this.escapeCode.replace("\u001B[", "").replace("m", "");
    }


//    public String toHtml() {
//        if (this.color == null) {
//            return "";
//        }
//        return String.format("<span style='color: rgb(%d, %d, %d);'>", this.color.getRed(), this.color.getGreen(), this.color.getBlue());
//    }

    public static String translateAlternativeColor(char altCode, String msg) {
        StringBuilder translatedMsg = new StringBuilder();
        boolean escape = false;

        for (int i = 0; i < msg.length(); i++) {
            char currentChar = msg.charAt(i);

            if (currentChar == altCode) {
                if (escape) {
                    // Append a single altCode character if we encountered a double altCode
                    translatedMsg.append(altCode);
                    escape = false;
                } else {
                    escape = true;
                }
            } else if (escape) {
                escape = false;
                ColorCodes colorCode = getColorCodeByKey(currentChar);

                if (colorCode != null) {
                    translatedMsg.append(colorCode.escapeCode);
                } else {
                    // If the character following the altCode is not a valid key, include the altCode and the character as-is
                    translatedMsg.append(altCode).append(currentChar);
                }
            } else {
                translatedMsg.append(currentChar);
            }
        }

        // Reset color at the end of the message
        translatedMsg.append(RESET.escapeCode);

        return translatedMsg.toString();
    }

    private static ColorCodes getColorCodeByKey(char key) {
        for (ColorCodes colorCode : ColorCodes.values()) {
            if (Character.toUpperCase(key) == colorCode.code) {
                return colorCode;
            }
        }
        return null;
    }
    public static ColorCodes getColorCodeByEscapeCode(String escapeCode) {
        for (ColorCodes colorCodes : ColorCodes.values()) {
            if (colorCodes.escapeCode.equals(escapeCode)) return colorCodes;
        }
        return null;
    }
//    public static String translateAlternativeColorToHtml(char alternativeCode, String message) {
//        StringBuilder builder = new StringBuilder("<html><body>");
//        boolean reset = true;
//        for (int i = 0; i < message.length(); i++) {
//            char c = message.charAt(i);
//            if (c == alternativeCode && i + 1 < message.length()) {
//                char code = message.charAt(i + 1);
//                for (ColorCodes color : values()) {
//                    if (color.getCode() == code) {
//                        if (color == RESET) {
//                            builder.append("</span>");
//                            reset = true;
//                        } else {
//                            if (!reset) builder.append("</span>");
//                            if (color == BOLD) {
//                                builder.append("<b>");
//                            } else if (color == UNDERLINE) {
//                                builder.append("<u>");
//                            } else if (color == REVERSED) {
//                                builder.append("<span style=\"background-color:black; color:white;\">");
//                            } else {
//                                builder.append("<span style=\"color:").append(toHtmlColor(color.getColor())).append(";\">");
//                            }
//                            reset = false;
//                        }
//                        i++;
//                        break;
//                    }
//                }
//            } else {
//                builder.append(c);
//            }
//        }
//        if (!reset) builder.append("</span>");
//        builder.append("</body></html>");
//        return builder.toString();
//    }

//    private static String toHtmlColor(Color color) {
//        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
//    }

    @Override
    public String toString() {
        return this.escapeCode;
    }
}
