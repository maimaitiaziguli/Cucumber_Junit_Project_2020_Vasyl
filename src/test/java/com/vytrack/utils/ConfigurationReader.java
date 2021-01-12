package com.vytrack.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {


    //#1- We created the properties object
    private static final Properties properties = new Properties();

    static {
        try {
            //#2- We get the path and pass it into FileInputStream, to open the file
            FileInputStream in = new FileInputStream("configuration.properties");
            //#3- We load the opened file into properties object
            properties.load(in);
            //#5- close the in
            //in.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to load Properties file");
        }
    }
    //#4- We read from file: we will be creating a utility method for reading.
    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}
