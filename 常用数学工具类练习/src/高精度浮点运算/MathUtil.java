package 高精度浮点运算;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtil {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal(1.2345);
        BigDecimal number2 = new BigDecimal(5.4321);
        BigDecimal addtion = number1.add(number2);
        BigDecimal subtraction = number1.subtract(number2);
        BigDecimal multiplication = number1.multiply(number2);
        BigDecimal division = number1.divide(number2, RoundingMode.HALF_UP);
        System.out.println(addtion);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }

}
