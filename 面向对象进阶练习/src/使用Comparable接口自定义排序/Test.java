package 使用Comparable接口自定义排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(3, "Java", 21));
        list.add(new Employee(2, "Java", 22));
        list.add(new Employee(1, "Java", 23));
        System.out.println("排序前：");
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("排序后：");
        Collections.sort(list);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
