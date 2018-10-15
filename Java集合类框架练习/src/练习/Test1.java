package 练习;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[10];
        Random ra = new Random(); //产生随机数的对象
        for (int i : arr) {
            i = ra.nextInt(100)+1; //0-100
            if(i >= 10) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
