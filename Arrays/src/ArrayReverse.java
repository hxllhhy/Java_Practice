import java.util.ArrayList;
import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.get(-3));
    }
}
