package ArraysTest.DeepTest;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        int[] c = {9, 8, 7, 6, 5};

        //1 对比引用是否相同
        //2 对比是否存在null
        //3 对比长度是否相同
        //4 挨个元素对比
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(b, c));//equals用于一维数组
        System.out.println(Arrays.toString(a)); //toString用于一维数组
        System.out.println();

        int[][] stuGrades1 = {{80, 81, 82}, {84, 85, 86}, {87, 88, 89}};
        int[][] stuGrades2 = {{80, 81, 82}, {84, 85, 86}, {87, 88, 89}};
        int[][] stuGrades3 = {{0 , 81, 82}, {84, 85, 86}, {87, 88, 89}};

        System.out.println(Arrays.deepHashCode(stuGrades1));
        System.out.println(Arrays.deepHashCode(stuGrades2));
        System.out.println(Arrays.deepEquals(stuGrades1, stuGrades2)); //deepEquals用于二维数组
        System.out.println(Arrays.deepEquals(stuGrades1, stuGrades3));
        System.out.println(Arrays.deepToString(stuGrades1)); //deepToString用于二维数组
    }
}
