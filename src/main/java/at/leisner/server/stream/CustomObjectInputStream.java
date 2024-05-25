package at.leisner.server.stream;

import at.leisner.server.Server;
import com.sun.jdi.Bootstrap;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/**
 * This class is for that the {@link Server} to parse the {@link at.leisner.packet.Packet}s right.
 */
public class CustomObjectInputStream extends ObjectInputStream {
    /**
     * The custom {@link ClassLoader}
     */
    private  ClassLoader classLoader;

    /**
     * The constructor
     * @param in
     * @param classLoader
     * @throws IOException Throw if an error is thrown
     */
    public CustomObjectInputStream(InputStream in, ClassLoader classLoader) throws IOException {
        super(in);
        this.classLoader = classLoader;
    }

    /**
     * Resolve the class witch was sent from the client
     * @param desc an instance of class {@code ObjectStreamClass}
     * @return The class
     * @throws IOException ERROR
     * @throws ClassNotFoundException ERROR
     */
    @Override
    protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
        try {
            return Class.forName(desc.getName(), false, classLoader);
        } catch (ClassNotFoundException e) {
            try {
                return Class.forName(desc.getName(), false, System.class.getClassLoader());
            } catch (ClassNotFoundException cnfe) {
                return super.resolveClass(desc);
            }
        }
    }

    /**
     * Return the classloader
     * @return classloader
     */
    public ClassLoader getClassLoader() {
        return classLoader;
    }

    /**
     * Set the classloader
     * @param classLoader classLoader
     */
    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
