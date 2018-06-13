package sum8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-->0) {
            int m = scan.nextInt();
            int sum = 0;
            while(m-- >0) {
                int a = scan.nextInt();
                sum += a;
            }
            System.out.println(sum);
            if(n != 0) {
                System.out.println();
            }
        }
    }
}
