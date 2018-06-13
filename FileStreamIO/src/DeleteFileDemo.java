import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File f = new File("./yaya");
        deleteFolder(f);
    }

    public static void deleteFolder(File f) {
        File[] files = f.listFiles();
        if(files != null) {
            System.out.println(123);
            for(File ff : files) {
                if(ff.isDirectory()) {
                    deleteFolder(ff);
                } else {
                    ff.delete();
                }
            }
        } 
        f.delete();
    }
}
