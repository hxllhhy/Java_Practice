
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/hehanyue/Desktop/123.txt");
//        BufferedReader br = new BufferedReader(fr);
//        String s;
//        while ((s = br.readLine()) != null) {
//            System.out.println(s);
//        }
//        fr.close();
        char[] cbuf = new char[512];
        while((fr.read(cbuf,0,512))!=-1) {
            System.out.println(123);
            System.out.println(new String(cbuf));

        }
    }
}
