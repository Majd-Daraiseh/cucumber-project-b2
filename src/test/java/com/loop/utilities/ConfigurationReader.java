package com.loop.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * this class as designed to read properties file and send the data to source code
 */
public class ConfigurationReader {


    private static Properties properties;

    static {
        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperties(String KeyName){
        return properties.getProperty(KeyName);
    }
}
