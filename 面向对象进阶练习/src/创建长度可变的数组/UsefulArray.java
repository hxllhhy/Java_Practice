package 创建长度可变的数组;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsefulArray {
    public static Object increaseArray(Object array) {
        Class<?> clazz = array.getClass();
        if(clazz.isArray()) {
            Class<?> componentType = clazz.getComponentType(); //获得数组元素的类型
            int length = Array.getLength(array);
            Object newArray = Array.newInstance(componentType, length+5); //新建数组（类型，长度）
            System.arraycopy(array, 0, newArray, 0, length); //复制源数组中的所有数据
            return newArray; //返回新建数组
        }
        return null; //如果输入的不是数组就返回空
    }
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.println("原始长度：" + intArray.length);
        Arrays.fill(intArray, 8);
        System.out.println("数组内容：");
        System.out.println(Arrays.toString(intArray));

        int[] newIntArray = (int[])increaseArray(intArray);
        System.out.println("扩展后：" + newIntArray.length);
        System.out.println("数组内容：");
        System.out.println(Arrays.toString(newIntArray));

    }
}
