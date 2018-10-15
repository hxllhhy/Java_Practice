package 计算几何图形面积;

public abstract class Shape {
    public String getName() {
        return this.getClass().getSimpleName();
    }
    public abstract double getArea();
}
