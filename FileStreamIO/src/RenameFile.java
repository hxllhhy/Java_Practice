import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldName = new File("filefile");
        File newName = new File("file");
        if(oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }
    }
}
