package com.jzh.kaoshi.jdbc;


import com.jzh.kaoshi.util.SqlApplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class JDBCUtil {

    private static ConnectionBuilder builder;

    static {
        //String builderName = SqlApplication.driverMangerBuilder;
        String builderName = PropertiesUtil.getProperties("connectionBuilder");
        try {
            Class clazz = Class.forName(builderName);
            builder = (ConnectionBuilder) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static final Connection getConnection() throws SQLException {
        return builder.getConnection();
    }

    public static final void close(Connection conn, Statement stat, ResultSet rs){
        builder.close(conn, rs, stat);
    }

}
