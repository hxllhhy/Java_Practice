import java.io.File;

public class SizeFile {
    public static void main(String[] args) {
        long size = getFileSize("srcfile");
        System.out.println(size);
    }

    public static long getFileSize(String filename) {
        File f = new File(filename);
        if( !f.exists() || !f.isFile()) {
            System.out.println("文件不存在");
            return -1;
        }
        return f.length();
    }
}
