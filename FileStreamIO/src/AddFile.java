import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AddFile {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("file"));
        bw.write("hhhhhhhhhhhhh");
        bw.close();

        bw = new BufferedWriter(new FileWriter("file", true));
        bw.write("aaaaaaaaaaaaa");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("file"));
        String str;
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
