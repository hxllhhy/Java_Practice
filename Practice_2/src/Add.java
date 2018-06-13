import java.math.BigDecimal;

public class Add {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(0.0);
        BigDecimal fac = new BigDecimal(1.0);
        int i = 1;
        while(i <= 20) {
            sum = sum.add(fac);
            ++i;
            fac = fac.multiply(new BigDecimal(1.0/i));
        }
        System.out.println("1 + 1/2! + 1/3! + .. + 1/20! = " + sum);
    }
}
