package at.leisner.server.user;

public interface Permission {

    String getName();

    boolean getValue();

    void setValue(boolean value);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
