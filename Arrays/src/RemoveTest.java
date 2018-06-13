import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class RemoveTest {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<>();
        objArray.clear();
        objArray.add(0,"第0个");
        objArray.add(1,"第1个");
        objArray.add(2,"第2个");
        System.out.println(objArray);
        objArray.remove(1);
        objArray.remove("第0个");
        System.out.println(objArray);
    }
}
