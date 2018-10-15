package 非法访问异常;

import java.lang.reflect.Field;

public class IllegalAccessExceptionTest {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if(field.getName().equals("hash")) {
                try {
                    System.out.println(field.getInt("hash"));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
