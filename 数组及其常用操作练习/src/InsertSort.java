import java.util.*;

public class InsertSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
