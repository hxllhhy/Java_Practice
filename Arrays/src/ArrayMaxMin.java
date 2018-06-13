import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Integer[] num = {8,2,7,1,4,9,5};
        int min = (int) Collections.min(Arrays.asList(num));
        int max = (int) Collections.max(Arrays.asList(num));
        System.out.println(min);
        System.out.println(max);
    }
}
