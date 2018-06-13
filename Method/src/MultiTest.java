public class MultiTest {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d! = %d\n", i, fac(i));
        }
    }
    public static long fac(long i) {
        if(i <= 1) {
            return 1;
        } else {
            return i * fac(i - 1);
        }
    }
}
