package 计算几何图形面积;

public class Circle extends Shape {
    private double radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
