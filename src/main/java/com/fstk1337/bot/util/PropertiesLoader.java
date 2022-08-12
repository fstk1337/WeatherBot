package com.fstk1337.bot.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesLoader {
    private static final Properties PROPS = loadProperties();

    public static String getProperty(String propertyName) {
        return PROPS.getProperty(propertyName);
    }

    private static Properties loadProperties() {
        Properties properties = new Properties();
        File file = new File(Objects.requireNonNull(
                PropertiesLoader.class.getClassLoader().getResource("application.properties")).getFile());
        try (FileInputStream fis = new FileInputStream(file)) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
