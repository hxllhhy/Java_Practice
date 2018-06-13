import java.util.Collections;
import java.util.Vector;

public class GetVector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("1");
        v.add("9");
        v.add("6");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "4");
        System.out.println(index);
    }
}
