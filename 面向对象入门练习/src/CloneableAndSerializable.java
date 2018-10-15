import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Em implements Cloneable,Serializable {
    private String name;
    private int age;
    public Em(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：" + name +  ",");
        sb.append("年龄：" + age + "\n");
        return sb.toString();
    }
    @Override
    public Em clone() {
        Em em = null;
        try {
            em = (Em)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return em;
    }
}
public class CloneableAndSerializable {
    public static void main(String[] args) {
        List<Em> ems = new ArrayList<Em>();
        Em em = new Em("yaya", 2);
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ems.add(em.clone());
        }
        System.out.println("克隆花费时间：" + (System.currentTimeMillis() - currentTime) + "ms");

        long currentTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); //创建字节数组输出流
            ObjectOutputStream out = null;
            try {
                out = new ObjectOutputStream(baos);
                out.writeObject(em);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            //获取字节数组输出流内容
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream in = null;
            try {
                in = new ObjectInputStream(bais);
                ems.add((Em)in.readObject());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {

            }
        }
        System.out.println("序列化花费时间：" + (System.currentTimeMillis() - currentTime2) + "ms");
    }
}
