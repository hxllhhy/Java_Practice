package cn.jdbc;

import java.sql.*;
import java.util.Date;



public class DateTest {
    public static void main(String[] args) throws SQLException {
        //create("yayya",new Date(), 100.0f);
        Date d = read(7);
        System.out.println(d);
    }

    static void create(String name, Date birthday, float money) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();

            String sql = "insert into user(name, birthday, money) values (?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setDate(2,new java.sql.Date(birthday.getTime()));
            ps.setFloat(3,money);

            int i = ps.executeUpdate();
            System.out.println(i);
        } finally {
            DBUtils.close(rs, ps, conn);
        }
    }

    static Date read(int id) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        Date birthday = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT id, name, birthday,money from user where id =" + id);
            while(rs.next()) {
                birthday = rs.getDate("birthday");
            }
        } finally {
            DBUtils.close(rs, st, conn);
        }
        return birthday;
    }
}
