package 动态设置类的私有域;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Class<?> clazz = student.getClass();
        System.out.println("类的标准名称：" + clazz.getCanonicalName());
        try {
            Field id = clazz.getDeclaredField("id");
            System.out.println("设置前的id：" + student.getId());
            id.setAccessible(true);  //反射时访问私有变量
            id.setInt(student, 10);
            System.out.println("设置后的id：" + student.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
