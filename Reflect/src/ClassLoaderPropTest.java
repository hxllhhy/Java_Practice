import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderPropTest {
    public static void main(String[] args) throws IOException {
        ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器：" + systemLoader);

        Enumeration<URL> eml = systemLoader.getResources("");
        while(eml.hasMoreElements()) {
            System.out.println(eml.nextElement());
        }

        C
    }
}
