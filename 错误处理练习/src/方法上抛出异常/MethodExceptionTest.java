package 方法上抛出异常;

public class MethodExceptionTest {
    public static void throwsException() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    public static void main(String[] args) {
        try {
            throwsException();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
