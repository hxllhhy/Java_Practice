import java.util.HashSet;
import java.util.Set;

public class UnionTest {
    public static void main(String[] args) throws Exception {
        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = {"4", "5", "6"};
       // String[] arr = new String[10];
        Set<String> s = new HashSet<>();
        for (String a : arr1) {
            s.add(a);
        }
        for (String a : arr2) {
            s.add(a);
        }
        System.out.println(s);
    }
}
