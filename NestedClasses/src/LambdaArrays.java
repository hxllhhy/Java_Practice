import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaArrays {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"java", "fkava", "fkit", "ios", "android"};
        Arrays.parallelSort(arr1, (o1, o2) -> o1.length() - o2.length());
        //目标类型是Comparator，指定了判断字符串大小的标准：字符串越长，则认为该字符串越大
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr2, (left, right) -> left * right);
        //目标类型是IntBinaryOperator，根据前一个元素和当前元素的值来计算当前元素的值
        System.out.println(Arrays.toString(arr2));

        long[] arr3 = new long[5];
        Arrays.parallelSetAll(arr3, opereand -> opereand * 5);
        //目标类型是IntToLongFunction，根据当前元素的索引来计算当前元素的值
        System.out.println(Arrays.toString(arr3));

        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));

// 1.1 使用匿名内部类根据 name 排序 players
//        Arrays.sort(players, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return (s1.compareTo(s2));
//            }
//        });
//        System.out.println(Arrays.toString(players));

// 1.2 使用 lambda expression 排序 players
//        Comparator<String> sortByName = (String s1, String s2) -> s1.length() - s2.length();
//        Arrays.sort(players, sortByName);
//        System.out.println(Arrays.toString(players));

// 1.3 也可以采用如下形式:
            Arrays.sort(players, (String s1, String s2) -> s1.length()-s2.length());
        System.out.println(Arrays.toString(players));
        List<String> list =new ArrayList<String>();

        //赋值；

        list.add("ss");
        list.forEach(System.out::println);
        System.out.println(list);
        list.forEach(s -> System.out.println("::::" + s));
    }
}
