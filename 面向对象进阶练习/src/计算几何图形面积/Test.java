package 计算几何图形面积;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.getName());
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(1, 1);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.getArea());
    }

}
