import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;

public class TempFile {
    public static void main(String[] args) throws Exception{
        File temp = File.createTempFile("test",".txt");

        System.out.println(temp.getAbsolutePath());

        temp.deleteOnExit();

        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        bw.write("aaaaaaaaaa");
        System.out.println("临时文件已创建");
        bw.close();
    }
}
