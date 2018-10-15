package 文件未发现异常;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("test.txt");
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
