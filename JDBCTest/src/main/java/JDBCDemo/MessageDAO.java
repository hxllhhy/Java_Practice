package JDBCDemo;


import java.sql.*;
import java.sql.Connection;
import java.util.*;

public class MessageDAO {
    private String url;
    private String user;
    private String passwd;

    public MessageDAO() {
    }

    public MessageDAO(String url, String user, String passwd) {
        this.url = url;
        this.user = user;
        this.passwd = passwd;
    }

    //在数据库中新增留言的方法
    public void add(Message message) {
        //取得Connection对象, 建立Statement对象
        try (Connection conn = DriverManager.getConnection(url, user, passwd);
             Statement statement = conn.createStatement()) {

            //System.out.print("1");
            String sql = String.format(
                    "INSERT INTO t_message(name, email, msg)VALUE('%s', '%s', '%s')",
                    message.getName(), message.getEmail(), message.getMsg());
            //System.out.print("2");
            //执行sql语句
            statement.executeUpdate(sql);
            //System.out.print("3");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    //从数据库中查询所有留言的方法
    public List<Message> get() {
        List<Message> messages = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, passwd);
             Statement statement = conn.createStatement()) {

            ResultSet result = statement.executeQuery("SELECT * FROM t_message");
            while (result.next()) {
                Message message = toMessage(result);
                messages.add(message);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return messages;
    }

    private Message toMessage(ResultSet result) throws SQLException {
        Message message = new Message();

        message.setId(result.getLong(1));
        message.setName(result.getString(2));
        message.setEmail(result.getString(3));
        message.setMsg(result.getString(4));

        return message;
    }
}