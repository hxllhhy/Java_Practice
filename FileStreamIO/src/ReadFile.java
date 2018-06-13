import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
