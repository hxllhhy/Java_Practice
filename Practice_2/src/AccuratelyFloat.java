import java.math.BigDecimal;

public class AccuratelyFloat {
    public static void main(String[] args) {
        double money = 2;
        double price = 1.1;
        double result = money - price;
        System.out.println("非精确计算 剩余金额：" + result);

        BigDecimal money1 = new BigDecimal("2");
        BigDecimal price1 = new BigDecimal("1.1");
        BigDecimal result1 = money1.subtract(price1);
        System.out.println("精确计算  剩余金额：" + result1);
    }
}

//BigDecimal使用数字字符串作为参数
