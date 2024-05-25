package at.leisner.server.util;

import at.leisner.server.plugin.JavaPlugin;
import at.leisner.server.stream.CustomObjectInputStream;

import java.io.*;

/**
 * A static class to help Plugin autors to save and load Objects in Files
 */
public class ServerUtil {
    /**
     * The methode tries to open the file and load the object. If the file didn't exist or if it is empty the methode write the defaultObject in it and return it
     * @param file The File to open
     * @param defaultObject The object witch is writen in the file if file didn't exist or is empty
     * @param javaPlugin The Plugin to get the classloader
     * @return Return the object in the file or the defaultObject
     * @param <T> The type of the Object witch will read of the file
     */
    public static <T extends Serializable> T loadDefaultFile(File file, T defaultObject, JavaPlugin javaPlugin) {
        ClassLoader classLoader = javaPlugin.getClassLoader();
        return loadDefaultFile(file, defaultObject, classLoader);
    }
    /**
     * The methode tries to open the file and load the object. If the file didn't exist or if it is empty the methode write the defaultObject in it and return it
     * @param file The File to open
     * @param defaultObject The object witch is writen in the file if file didn't exist or is empty
     * @param classLoader The classloader for custom classes to be loaded
     * @return Return the object in the file or the defaultObject
     * @param <T> The type of the Object witch will read of the file
     */
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
    /**
     * The methode tries to open the file and load the object. If the file didn't exist or if it is empty the methode will execute the executeIfNotExist and write the return value in it and return it
     * @param file The File to open
     * @param executeIfNotExist The funktion must return the object witch will write in the file and the funktion will execute if the file is empty
     * @param javaPlugin The Plugin to get the classloader
     * @return Return the object in the file or the object from executeIfNotExist
     * @param <T> The type of the Object witch will read of the file
     */
    public static <T extends Serializable> T loadDefaultFile(File file, ExecuteIfNotExist<T> executeIfNotExist, JavaPlugin javaPlugin) {
        ClassLoader classLoader = javaPlugin.getClassLoader();
        return loadDefaultFile(file, executeIfNotExist, classLoader);
    }
    /**
     * The methode tries to open the file and load the object. If the file didn't exist or if it is empty the methode will execute the executeIfNotExist and write the return value in it and return it
     * @param file The File to open
     * @param executeIfNotExist The funktion must return the object witch will write in the file and the funktion will execute if the file is empty
     * @param classLoader The classloader for custom classes to be loaded
     * @return Return the object in the file or the object from executeIfNotExist
     * @param <T> The type of the Object witch will read of the file
     */
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

    /**
     * Save an Object witch implement {@link Serializable} in the file
     * @param file The file
     * @param object the object witch will be saved
     * @return Return object
     * @param <T> The Type of the object
     */

    public static <T extends Serializable> T saveObject(File file, T object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return object;
    }
}