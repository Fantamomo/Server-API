package at.leisner.server.client;

import at.leisner.server.plugin.JavaPlugin;

public class Meta {
    private Object object;
    private JavaPlugin javaPlugin;

    public Meta(Object object, JavaPlugin javaPlugin) {
        this.object = object;
        this.javaPlugin = javaPlugin;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public JavaPlugin getJavaPlugin() {
        return javaPlugin;
    }

    public void setJavaPlugin(JavaPlugin javaPlugin) {
        this.javaPlugin = javaPlugin;
    }
}
