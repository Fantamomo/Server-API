package at.leisner.server.plugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If you want to register a Plugin by the Server your Plugin class need this annotation and must extend from {@link JavaPlugin}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {
    /**
     * The id of the Plugin witch will indentify your Plugin.
     * @return The id
     */
    String id();

    /**
     * The version of the plugin
     * @return The version
     */
    String version();

    /**
     * A list of autors for that plugin
     * @return A list of autors
     */
    String[] authors() default {};

    /**
     * A description for the Plugin
     * @return A description
     */
    String description() default "";

    /**
     * If your Plugin need other plugins to work if the have classes or else.
     * If you add an {@link Dependency} and you say it is required and the {@link Dependency} couldn't found a message will write in the chat and your plugin will not enable
     * @see Dependency
     * @return The array of {@link Dependency}
     */
    Dependency[] dependencies() default {};

    /**
     * The name for the Plugin. For logging
     * @return The name
     */
    String name();

    /**
     * A list of types for witch that plugin will register it
     * @return
     */
    String[] types() default {};

    /**
     * The Type of the plugin.
     * {@link PluginType}
     * @return The PluginType
     */
    PluginType pluginType() default PluginType.CLIENT_HANDLER;
}
