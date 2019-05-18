package com.jzh.kaoshi.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class PropertiesUtil {

    public static final Properties p = new Properties();

    static {
        InputStream in =  PropertiesUtil.class.getClassLoader().getResourceAsStream("application.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperties(String key){
        return p.getProperty(key);
    }
    public static Properties getProperties(){
        return p;
    }

    /*public static void main(String[] args) {
        String url = PropertiesUtil.getProperties("url");
        String username = PropertiesUtil.getProperties("username");
        String password = PropertiesUtil.getProperties("password");
        String connectionBuilder = PropertiesUtil.getProperties("connectionBuilder");

        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
        System.out.println(connectionBuilder);
    }*/
}
