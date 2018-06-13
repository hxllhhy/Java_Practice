import java.io.File;

public class ReadOnlyFile {
    public static void main(String[] args) {
        File file = new File("file");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
