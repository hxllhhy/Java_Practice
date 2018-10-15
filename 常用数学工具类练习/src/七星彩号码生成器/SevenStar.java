package 七星彩号码生成器;

import java.util.Random;
import java.util.Scanner;

public class SevenStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            Random ra = new Random();
            int number = ra.nextInt((int)Math.pow(10, 7));
            String luckNumber = "" + number;
            while (luckNumber.length() < 7) {
                luckNumber += "0";
            }
            System.out.println(luckNumber);
        }
    }
}
