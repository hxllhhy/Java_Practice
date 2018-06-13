package abs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextDouble()) {
            double a = scan.nextDouble();
            System.out.printf("%.2f\n\r",Math.abs(a));
        }
    }
}
