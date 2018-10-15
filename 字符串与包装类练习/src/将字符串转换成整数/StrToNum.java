package 将字符串转换成整数;

import java.util.Scanner;

public class StrToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(Integer.parseInt(s));
        }
    }
}
