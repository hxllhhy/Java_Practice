package 不重复随机数组排序;

import java.util.Random;
import java.util.TreeSet;

public class RandomSortArray {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Random ra = new Random();
        int count = 0;
        while(count < 10) {
            boolean succeed = ts.add(ra.nextInt(100));
            if(succeed) {
                count++;
            }
        }
        int size = ts.size();
        Integer[] array = new Integer[size];
        ts.toArray(array);
        System.out.println("生成的重复随机数组内容如下:");
        for (Integer integer : array) {
            System.out.println(integer + " ");
        }
    }
}
