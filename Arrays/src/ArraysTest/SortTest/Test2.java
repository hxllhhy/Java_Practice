package ArraysTest.SortTest;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        Arrays.sort(a,0,3); //第0到第2个进行排序
        for(int i : a) {
            System.out.println(i);
        }
    }
}
