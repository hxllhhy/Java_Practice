package sum6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int n = scan.nextInt();
            int sum = 0;
            while (n-- > 0) {
                int a = scan.nextInt();
                sum += a;
            }
            System.out.println(sum);
        }
    }
}
