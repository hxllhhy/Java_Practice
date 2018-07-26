package cn.jdbc;

import java.io.*;
import java.sql.*;

public class ClobTest {
    public static void main(String[] args) throws SQLException, IOException {
        //create();
        read();
    }

    //添加大文本数据（varchar最大255，所以大文本应该用text类型）
    static void create() throws SQLException, IOException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();

            String sql = "insert into clob_test(big_text) values (?)";
            ps = conn.prepareStatement(sql);

            File file = new File("src/main/java/cn/jdbc/DBUtils.java");
            Reader reader = new BufferedReader(new FileReader(file));
            ps.setCharacterStream(1, reader, (int)file.length());
            int i = ps.executeUpdate();
            reader.close();
            System.out.println(i);
        } finally {
            DBUtils.close(rs, ps, conn);
        }
    }
    static void read() throws SQLException,IOException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT big_text from clob_test");
            while (rs.next()) {
                Clob clob = rs.getClob(1);
                Reader reader = clob.getCharacterStream();
                File file = new File("DBUtiles_bak.java");
                Writer writer = new BufferedWriter(new FileWriter(file));
                char[] buff = new char[1024];
                for(int i = 0;(i = reader.read(buff)) > 0; i++) {
                    writer.write(buff, 0, i);
                }
                writer.close();
                reader.close();
            }
        } finally {
            DBUtils.close(rs, st, conn);
        }
    }
}
