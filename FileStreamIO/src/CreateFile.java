import java.io.File;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("./");
        file = File.createTempFile("JavaTemp",".javatemp",dir);
        System.out.println(file.getPath());
    }
}
