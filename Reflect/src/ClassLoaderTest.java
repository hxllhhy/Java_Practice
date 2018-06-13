import java.lang.*;

class Tester {
    static {
        System.out.println("Tester类的静态初始化块...");
    }
}
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader c1 = ClassLoader.getSystemClassLoader();
        c1.loadClass("Tester");   //只加载类，不初始化
        System.out.println("系统加载Tester类");
        Class.forName("Tester");  //强制初始化该类
    }
}
