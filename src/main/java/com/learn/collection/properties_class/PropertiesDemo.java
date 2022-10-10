package com.learn.collection.properties_class;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static final String USER_DIR = "";

    public static void main(String[] args) {

        /*Properties:
        * properties objects contains key and value pair both as a string.
        * java.util.Properties class is subclass of Hashtable.
        *
        * Properties class provides methods to get data from the properties file and store data into properties file.
        * Moreover, This can be used to get system properties.
        *
        * Note:
        * Recompilation is not required if the information is changes from a properties file.
        * */

        try {
            //USER_DIR = Properties.getProperty("user.dir");

            FileReader reader = new FileReader("src/main/resources/db.properties");

            Properties p = new Properties();
            p.load(reader);

            System.out.println(p.getProperty("user"));
            System.out.println(p.getProperty("password"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void getSystemProperties() {
        Properties p = System.getProperties();
        Set<Map.Entry<Object, Object>> s = p.entrySet();

        for (Map.Entry<Object, Object> entry : s) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void createPropertiesFile() throws IOException {
        Properties p = new Properties();
        p.setProperty("name", "user");
        p.setProperty("email", "common@gmail.com");

        p.store(new FileWriter("src/main/resources/user.properties"), "Properties Example");
    }
}
