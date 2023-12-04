package com.jfp.finalproject.utils;
import java.sql.*;
public class DatabaseUtil {
    private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    private static final String PROTOCOL ="jdbc:mysql";
    private static final String HOST ="localhost";
    private static final String PORT ="3306";
    private static final String USERNAME ="test";
    private static final String PASSWORD ="1234";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DatabaseUtil.DRIVER);

        return DriverManager.getConnection(String.format("%s://%s:%s", DatabaseUtil.PROTOCOL, DatabaseUtil.HOST, DatabaseUtil.PORT), DatabaseUtil.USERNAME, DatabaseUtil.PASSWORD);
    }

    private DatabaseUtil() {super();}
}
