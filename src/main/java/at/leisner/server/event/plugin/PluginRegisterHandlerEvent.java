package at.leisner.server.event.plugin;

import at.leisner.server.event.Cancelable;
import at.leisner.server.handler.Handler;
import at.leisner.server.plugin.JavaPlugin;

public class PluginRegisterHandlerEvent extends PluginEvent implements Cancelable {
    private final Handler handler;
    private boolean cancel = false;
    public PluginRegisterHandlerEvent(JavaPlugin plugin, Handler handler) {
        super(plugin);
        this.handler = handler;
    }

    @Override
    public void callEvent() {

    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancel(boolean state) {
        cancel = state;
    }

    @Override
    public void callIfCanceled() {

    }
}
