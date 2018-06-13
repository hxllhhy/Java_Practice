public class PrintErrorAndDebug {
    public static void main(String[] args) {
        System.out.println("main()方法开始运行了。");

        //输出错误信息
        System.err.println("在运行期间手动输出一个错误信息：");
        System.err.println("\t 该软件没有买保险，请注意安全");
        System.out.println("PrintErrorAndDebug.main()");
        System.out.println("main()方法运行结束。");

        //out是标准调试信息的输出流
        //err是标准错误信息的输出流，用于输出紧急错误信息，红色字体
        //使用static关键字修饰
    }
}
