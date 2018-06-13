import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname = "./yaya/1/2/3";
        File f = new File(dirname);
        f.mkdirs();
    }
}
