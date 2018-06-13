import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("runoob.txt");
        if(file.delete()) {
            System.out.println(file.getName() + "已删除");
        } else {
            System.out.println("删除失败");
        }
    }
}
