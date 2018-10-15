package 适配器模式的简单应用;
//符合OCP原则，开闭原则，为类增加新的功能。
public class Test {
    public static void main(String[] args) {
        System.out.println("自定义普通的汽车：");
        Car car = new Car();
        car.setName("Adui");
        car.setSpeed(60);
        System.out.println(car);

        System.out.println("自定义GPS汽车：");
        GPSCar gpsCar = new GPSCar();
        gpsCar.setName("Adui");
        gpsCar.setSpeed(60);
        System.out.println(gpsCar);
    }
}
