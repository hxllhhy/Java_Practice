package cn.jdbc;

import java.sql.*;

public class SQLInjectTest {
    public static void main(String[] args) throws SQLException {
//        long start = System.currentTimeMillis();
          read("lisi");
//        long end = System.currentTimeMillis();
//        System.out.println("read:" + (end - start));
//
//        start = System.currentTimeMillis();
          read1("lisi");
//        end = System.currentTimeMillis();
//        System.out.println("read1:" + (end - start));
    }

    //使用PreparedStatement
    static void read(String name) throws SQLException {
        Connection conn = null;
        //Statement st = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            long start = System.currentTimeMillis();
            String sql = "select id, name, birthday, money from user where name= ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getObject("id") + "\t"
                        + rs.getObject("name") + "\t"
                        + rs.getObject("birthday") + "\t"
                        + rs.getObject("money"));
            }
            long end = System.currentTimeMillis();
            System.out.println("read:" + (end - start));
        } finally {
            DBUtils.close(rs, ps, conn);
        }
    }

    //使用Statement
    static void read1(String name) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            long start = System.currentTimeMillis();
            st = conn.createStatement();
            String sql = "select id, name, birthday, money from user where name= '" + name + "'";
            rs = st.executeQuery(sql);
            while(rs.next()) {
                System.out.println(rs.getObject("id") + "\t"
                        + rs.getObject("name") + "\t"
                        + rs.getObject("birthday") + "\t"
                        + rs.getObject("money"));
            }
            long end = System.currentTimeMillis();
            System.out.println("read1:" + (end - start));
        } finally {
            DBUtils.close(rs, st, conn);
        }
    }
}
