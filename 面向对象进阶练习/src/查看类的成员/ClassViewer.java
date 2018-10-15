package 查看类的成员;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassViewer {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> clazz = Class.forName("java.util.ArrayList");
        System.out.println("类的标准名称：" + clazz.getCanonicalName());

        Constructor[] constructors = clazz.getConstructors();
        System.out.println("类的构造方法：");
        if(constructors.length != 0) {
            for (Constructor construct : constructors) {
                System.out.println("\t" + construct);
            }
        } else {
            System.out.println("\t 空");
        }

        Field[] fields = clazz.getDeclaredFields();
        System.out.println("类的非继承域变量：");
        if(fields.length != 0) {
            for (Field field : fields) {
                System.out.println("\t" + field);
            }
        } else {
            System.out.println("\t 空");
        }

        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("类的非继承方法：");
        if(methods.length != 0) {
            for (Method method : methods) {
                System.out.println("\t" + method);
            }
        } else {
            System.out.println("\t 空");
        }
    }
}
