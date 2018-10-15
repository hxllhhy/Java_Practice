import java.awt.*;
import java.util.Objects;

class Cat {
    private String name;
    private int age;
    private double weight;
    private String color;
    public Cat(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) { //利用属性来判断猫咪是否相同
        if(this == obj) { //如果两个猫咪是同一个对象则相等
            return true;
        }
        if(obj == null) { //如果两个猫咪有一个为null则不同
            return false;
        }
        if(getClass() != obj.getClass()) { //如果两个猫咪的类型不同则不同
            return false;
        }
        Cat cat = (Cat)obj;
        return name.equals(cat.name) && (age == cat.age) && (weight == cat.weight) && (color.equals(cat.color));
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("名字：" + name + "\n");
        sb.append("年龄：" + age + "\n");
        sb.append("重量：" + weight + "\n");
        sb.append("颜色：" + color + "\n");
        return sb.toString();
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + name.hashCode();
        result = 31*result + age;
        result = 31*result + (int)(Double.doubleToLongBits(weight)^(Double.doubleToLongBits(weight)>>>32));
        result = 31*result + color.hashCode();
        return result;
    }
}

public class CatTest {
    public static void main(String[] args) {
        Cat c1 = new Cat("Java", 12, 21, "Black");
        Cat c2 = new Cat("C++", 12, 21, "White");
        Cat c3 = new Cat("Java", 12, 21, "Black");
        System.out.println("猫咪1号：" + c1);
        System.out.println("猫咪2号：" + c2);
        System.out.println("猫咪3号：" + c3);
        System.out.println("猫咪1号是否与2号相同：" + c1.equals(c2));
        System.out.println("猫咪1号是否与3号相同：" + c1.equals(c3));
    }
}
