package 练习;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(9);
        System.out.println("索引值为:" + listTest(arrayList, 4));
    }
    public static int listTest(ArrayList<Integer> al, Integer s) {
        for (Integer i : al) {
            if(i == s) {
                return al.indexOf(i); //得到索引值
            }
        }
        return -1;
    }
}
