package at.leisner.server.event;

/**
 * If you want to Listen at {@link Event} your class need to implement this interface
 * You need for each {@link Event} a methode the name is irrelevant. This methode need the {@link EventHandler} annotation and one parameter a class that extend from {@link Event}
 *
 * e.g. <pre>{@code
 * @EventHandler
 * public void name(DisconnectEvent event) {
 *      System.out.println(event.getClient().getType())
 * }}</pre>
 */
public interface Listener {}
