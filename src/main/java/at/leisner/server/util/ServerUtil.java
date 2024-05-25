package at.leisner.server.util;

import at.leisner.server.plugin.JavaPlugin;
import at.leisner.server.stream.CustomObjectInputStream;

import java.io.*;

public class ServerUtil {
    public static <T extends Serializable> T loadDefaultFile(File file, T defaultObject, JavaPlugin javaPlugin) {
        ClassLoader classLoader = javaPlugin.getClassLoader();
        if (file.exists() && file.length() > 0) {
            try (ObjectInputStream ois = new CustomObjectInputStream(new FileInputStream(file), classLoader)) {
                return (T) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(defaultObject);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defaultObject;
    }
    public static <T extends Serializable> T loadDefaultFile(File file, T defaultObject, ClassLoader classLoader) {
        if (file.exists() && file.length() > 0) {
            try (ObjectInputStream ois = new CustomObjectInputStream(new FileInputStream(file), classLoader)) {
                return (T) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(defaultObject);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defaultObject;
    }

    public static <T extends Serializable> T loadDefaultFile(File file, ExecuteIfNotExist<T> executeIfNotExist, JavaPlugin javaPlugin) {
        ClassLoader classLoader = javaPlugin.getClassLoader();
        if (file.exists() && file.length() > 0) {
            try (ObjectInputStream ois = new CustomObjectInputStream(new FileInputStream(file), classLoader)) {
                return (T) ois.readObject();
            } catch (InvalidClassException ice) {
                T object = executeIfNotExist.execute();
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                    oos.writeObject(object);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ice.printStackTrace();
                return object;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        T object = executeIfNotExist.execute();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return object;
    }
    public static <T extends Serializable> T loadDefaultFile(File file, ExecuteIfNotExist<T> executeIfNotExist, ClassLoader classLoader) {
        if (file.exists() && file.length() > 0) {
            try (ObjectInputStream ois = new CustomObjectInputStream(new FileInputStream(file), classLoader)) {
                return (T) ois.readObject();
            } catch (InvalidClassException ice) {
                T object = executeIfNotExist.execute();
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                    oos.writeObject(object);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ice.printStackTrace();
                return object;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        T object = executeIfNotExist.execute();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return object;
    }

    public static <T extends Serializable> T saveObject(File file, T object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return object;
    }
}