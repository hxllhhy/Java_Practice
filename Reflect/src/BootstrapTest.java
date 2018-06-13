import java.net.URL;



//获得了根类加载器所加载的核心类库
public class BootstrapTest {
    public static void main(String[] args) {
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        //获取根类加载器所加载的全部URL数组

        for(int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }
    }
}
