package 动态实例化类;

import java.io.File;
import java.lang.reflect.Constructor;

public class NewClassTest {
    public static void main(String[] args) {
        try {
            Constructor<File> constructor = File.class.getDeclaredConstructor(String.class);
            System.out.println("使用反射创建File对象");
            File file = constructor.newInstance("123.txt");
            System.out.println("创建文件");
            file.createNewFile();
            System.out.println("文件是否创建成功：" + file.exists());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
