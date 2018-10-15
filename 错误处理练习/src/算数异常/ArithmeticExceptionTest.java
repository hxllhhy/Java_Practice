package 算数异常;

public class ArithmeticExceptionTest {
    public static void main(String[] args) {
        System.out.println("-1.0/0=" + (-1.0/0));
        System.out.println("+1.0/0=" + (+1.0/0));
        //浮点数被0除不引发算数异常
        try {
            System.out.println("-1/0=" + (-1/0));
        } catch (Exception e) {
            System.out.println("抛出异常:" + e.getMessage());
        }
        //整数被0除产生异常
        System.out.println("+1/0=" + (+1/0));
        System.out.println("结束");
    }
}
