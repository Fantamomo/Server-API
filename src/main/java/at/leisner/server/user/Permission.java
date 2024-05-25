package at.leisner.server.user;

public interface Permission {
    /**
     *
     * @return The name of the Permission z.B. "this.is.an.permission.*"
     */
    String getName();

    /**
     *
     * @return The value of the Permission
     */
    boolean getValue();

    /**
     * Set the Permission to value
     * @param value
     */
    void setValue(boolean value);

    @Override
    boolean equals(Object o);
    @Override
    int hashCode();
}
