package 高精度整数运算;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigInteger;

public class MathUtil {
    public static void main(String[] args) {
        BigInteger number1 = new BigInteger("12345");
        BigInteger number2 = new BigInteger("54321");
        BigInteger addtion = number1.add(number2);
        BigInteger subtraction = number1.subtract(number2);
        BigInteger multiplication = number1.multiply(number2);
        BigInteger division = number1.divide(number2);
        System.out.println(addtion);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }

}
