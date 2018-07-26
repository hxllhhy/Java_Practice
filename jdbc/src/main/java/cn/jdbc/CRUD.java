package cn.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    public static void main(String[] args) throws SQLException {
        read();
        create();
        update();
        delete();
        read();
    }

    //増
    static void create() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            //建立连接
            conn = DBUtils.getConnection();
            //创建语句
            st = conn.createStatement();
            String sql = "insert into user(name, birthday, money) values ('yaya', '1998-01-14', 400)";
            //执行语句
            int i = st.executeUpdate(sql);
            System.out.println(i);
        } finally {
            DBUtils.close(rs, st, conn);
        }
    }

    //删
    static void delete() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            String sql = "delete from user where id > 4";
            int i = st.executeUpdate(sql);
            System.out.println(i);
        } finally {
            DBUtils.close(rs, st, conn);
        }
    }

    //改
    static void update() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            String sql = "update user set money = money + 10";
            int i = st.executeUpdate(sql);
            System.out.println(i);
        } finally {
            DBUtils.close(rs, st, conn);
        }
    }

    //查
    static void read() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            //建立连接
            conn = DBUtils.getConnection();
            //创建语句
            st = conn.createStatement();
            //执行语句
            rs = st.executeQuery("SELECT id, name, birthday, money from user");
            //处理结果集
            while(rs.next()) {
                System.out.println(rs.getObject("id") + "\t"
                + rs.getObject("name") + "\t"
                + rs.getObject("birthday") + "\t"
                + rs.getObject("money"));
            }
        } finally {
            DBUtils.close(rs, st, conn);
        }
    }
}
