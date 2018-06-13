import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("srcfile"));
        bw.write("hahahaha");
        bw.close();

        InputStream in = new FileInputStream(new File("srcfile"));
        OutputStream out = new FileOutputStream(new File("destfile"));
        byte[] buf = new byte[1024];
        int len;
        while((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();

        BufferedReader in1 = new BufferedReader(new FileReader("destfile"));
        String str;
        while((str = in1.readLine()) != null) {
            System.out.println(str);
        }
        in1.close();
    }
}
