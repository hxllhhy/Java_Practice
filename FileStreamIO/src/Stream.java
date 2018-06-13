
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) throws IOException{
        try {
            FileInputStream fis = new FileInputStream("/home/hehanyue/Desktop/123.txt");
            int n = 512;
            byte[] buffer = new byte[n];
            while (fis.read(buffer,0,n)!= -1) {
                System.out.print(new String(buffer));
            }

            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
