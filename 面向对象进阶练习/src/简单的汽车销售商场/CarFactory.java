package 简单的汽车销售商场;

public class CarFactory {
    public static Car getCar(String name) {
        //equals比较是否相等时区分大小写的，而equalsIgnoreCase是不区分大小写的
        if(name.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if(name.equalsIgnoreCase("Benz")) {
            return new Benz();
        } else {
            return null;
        }
    }
}
