class Demo {
    //在功能上通过throws的关键字声明该功能可能出现问题
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[a];
        System.out.println(arr[4]);//制造的第一处异常
        return a/b; //制造的第二处异常
    }
}


public class ExceptionTest {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            //int x = d.div(4, 0);
            //int x = d.div(5,0);
            int x = d.div(4,1);
            System.out.println("x=" +x);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (Exception e) {  //父类 写在此处是为了捕捉其他没预料到的异常 只能写在子类异常的代码后面
                                     //不过一般情况下是不写的
            System.out.println(e.toString());
        }
        System.out.println("Over");
    }
}
