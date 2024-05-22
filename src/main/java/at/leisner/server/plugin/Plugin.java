package at.leisner.server.plugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {
    String id();
    String version();
    String[] authors() default {};
    String description() default "";
    Dependency[] dependencies() default {};
    String name();
    String[] types() default {};
}
