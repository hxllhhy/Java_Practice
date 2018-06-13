import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("runoob.txt"));
            br.write("你好");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
