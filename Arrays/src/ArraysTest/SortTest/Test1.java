package ArraysTest.SortTest;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        Arrays.sort(a);
        //for(int i = 0; i < a.length; i++) {
        for(int i : a) {
            System.out.println(i);
        }
    }
}
