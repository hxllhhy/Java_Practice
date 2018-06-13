package ArraysTest.CopyOfTest;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[10];

        System.arraycopy(a,0,b,0,10);
        for(int i: b) {
            System.out.print(i + " ");
        }
        System.out.println();


        int[] c = Arrays.copyOf(a  ,14);
        for(int i : c) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] d = Arrays.copyOfRange(a,0,11);
        for(int i : d) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
