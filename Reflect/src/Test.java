public class Test {
    static {
        b = 6;
        System.out.println("---------");
    }

    //声明变量a时指定的初始值
    static int a = 5;
    static int b = 9;
    static int c;
    public static void main(String[] args) {
        System.out.println(Test.b);
    }
}
