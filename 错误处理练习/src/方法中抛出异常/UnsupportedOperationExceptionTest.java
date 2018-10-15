package 方法中抛出异常;

public class UnsupportedOperationExceptionTest {
    public static void main(String[] args) {
        throwException();
    }
    public static void throwException() {
        throw new UnsupportedOperationException("方法未实现");
    }

}
