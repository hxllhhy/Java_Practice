package 查看类的声明;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/*
    forName(String className) 根据给定的名称获得Class对象
    getAnnotations() 返回此Class对象上存在的注释
    getCanonicalName() 返回底层类的规范化名称
    getGenericInterfaces() 返回泛型形式的对象类所实现的接口
    getGenericSuperClass() 返回泛型形式的对象类所直接继承的超类
    getModifiers() 返回此类或接口以整数编码的Java语言修饰符
    getTypeParameters() 按声明顺序返回TypeVariable对象的一个数组
 */

public class ClassDeclarationViewer {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        System.out.println("类的标准名称：" + clazz.getCanonicalName());
        System.out.println("类的修饰符：" + Modifier.toString(clazz.getModifiers()));

        //输出类的泛型参数
        TypeVariable[] typeVariables = clazz.getTypeParameters();
        System.out.print("类的泛型参数：");
        if(typeVariables.length != 0) {
            for (TypeVariable<?> typeVariable : typeVariables) {
                System.out.println(typeVariable + "\t");
            }
        } else {
            System.out.println("空");
        }

        //输出类所实现的所有接口
        Type[] interfaces = clazz.getGenericInterfaces();
        System.out.println("类所实现的接口：");
        if(interfaces.length != 0) {
            for (Type type : interfaces) {
                System.out.println("\t" + type);
            }
        } else {
            System.out.println("\t" + "空");
        }

        //输出类的直接继承类，如果继承Object则返回空
        Type superClass = clazz.getGenericSuperclass();
        System.out.println("类的直接继承类：");
        if(superClass != null) {
            System.out.println(superClass);
        } else {
            System.out.println("空");
        }

        //输出类的所有注释信息，有些注释信息是不能用反射获得的
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println("类的注解：");
        if(annotations.length != 0) {
            for (Annotation annotation : annotations) {
                System.out.println("\t" + annotation);
            }
        } else {
            System.out.println("空");
        }
    }
}
