package at.leisner.server.plugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use to say they Server you need a special Plugin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Dependency {
    /**
     * The id of the Plugin witch you need
     * @return The id
     */
    String id();

    /**
     * If the Plugin is required.
     * If it's true and the Server cannot found the Plugin your Plugin will not enable
     * @return If the Plugin is required
     */
    boolean required() default false;

    /**
     * When your Dependency is load to your Plugin
     * @return The Loadtype
     */
    LoadType load() default LoadType.NORMAL;
}