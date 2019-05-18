package com.jzh.kaoshi.jdbc;



import com.jzh.kaoshi.util.SqlApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerBuilder extends AbsConnectionBuilder{


    public Connection getConnection() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*String url = SqlApplication.url;
        String user = SqlApplication.user;
        String pass = SqlApplication.pass;*/

        String url = PropertiesUtil.getProperties("url");
        String user = PropertiesUtil.getProperties("username");
        String pass = PropertiesUtil.getProperties("password");


        return DriverManager.getConnection(url,user,pass);
    }

}
