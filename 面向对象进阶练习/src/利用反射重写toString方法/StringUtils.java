package 利用反射重写toString方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StringUtils {
    @SuppressWarnings("unchecked")
    public String toString(Object object) {
        Class clazz = object.getClass();
        StringBuilder sb = new StringBuilder();

        Package packageName = clazz.getPackage(); //获得类所在的包
        sb.append("包名：" + packageName.getName() + "\t");

        String className = clazz.getSimpleName(); //获得类的简单名称
        sb.append("类名：" + className + "\n");

        sb.append("公共构造方法：\n");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            String modifier = Modifier.toString(constructor.getModifiers());
            if(modifier.contains("public")) {
                sb.append(constructor.toGenericString() + "\n");
            }
        }

        sb.append("公共域：\n");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String modifier = Modifier.toString(field.getModifiers());
            if(modifier.contains("public")) {
                sb.append(field.toGenericString() + "\n");
            }
        }

        sb.append("公共方法：\n");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            String modifier = Modifier.toString(method.getModifiers());
            if(modifier.contains("public")) {
                sb.append(method.toGenericString() + "\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new StringUtils().toString(new java.util.Date()));
    }
}
