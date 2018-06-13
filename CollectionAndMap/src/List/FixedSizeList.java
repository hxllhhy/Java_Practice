package List;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
    public static void main(String[] args) {
        List fixedList = Arrays.asList("Java","C++");

        //获取fixedList的实现类
        System.out.println(fixedList.getClass());

        //使用方法引用遍历集合元素
        fixedList.forEach(System.out::println);

        //试图增加、删除元素都会引发UnsupportedOperationException异常
        fixedList.add("Python");
        fixedList.remove("Java");
    }
}
