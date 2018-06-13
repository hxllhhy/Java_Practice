public class FibonacciTest {
    public static long fibonacci(long num) {
        if((num == 0) || (num == 1)) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //System.out.printf("%d %d\n",i,fibonacci(i));
            System.out.println(i + " " + fibonacci(i));
        }
    }
}
