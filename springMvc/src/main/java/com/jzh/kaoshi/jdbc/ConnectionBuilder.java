package com.jzh.kaoshi.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 数据库连接创建者
 */
public interface ConnectionBuilder {
    /**
     * 建立连接
     * @return
     */
    Connection getConnection() throws SQLException;

    /**
     * 关闭连接
     */
    void close(Connection conn);

    /**
     * 关闭ResultSet
     */
    void close(ResultSet rs);

    /**
     * 关闭Statement
     */
    void close(Statement stat);

    /**
     * 关闭所有资源
     */
    void  close(Connection conn, ResultSet rs, Statement stat);
}
