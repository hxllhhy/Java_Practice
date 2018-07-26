package cn.jdbc;

import java.sql.*;
import java.util.ResourceBundle;

public final class DBUtils {
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    private static String DriverClassName;

    private DBUtils() {
    }

    private static ResourceBundle rb = ResourceBundle.getBundle("db-config");

    static {
        URL = rb.getString("jdbc.url");
        USERNAME = rb.getString("jdbc.username");
        PASSWORD = rb.getString("jdbc.password");
        DriverClassName = rb.getString("jdbc.driverClassName");

        try {
            Class.forName(DriverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("???????");
        }
        return conn;
    }

    public static void close(ResultSet rs, Statement st, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
