package com.jzh.kaoshi.util;

/**
 * 设置数据库连接工具字符串
 */
public class SqlApplication {

    /**
     * 返回url
     */
    public final static String url =
            "jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
    /**
     * 返回user
     */
    public final static String user = "root";
    /**
     * 返回pass
     */
    public final static String pass = "dddjqm888";
    /**
     * 返回DriverManagerBuilder
     */
    public final static String driverMangerBuilder =
            "com.jzh.kaoshi.jdbc.DriverManagerBuilder";







}
