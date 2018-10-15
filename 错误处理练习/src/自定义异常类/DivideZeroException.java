package 自定义异常类;

public class DivideZeroException extends ArithmeticException {
    public DivideZeroException() {

    }
    public  DivideZeroException(String msg) {
        super(msg);
    }
}
