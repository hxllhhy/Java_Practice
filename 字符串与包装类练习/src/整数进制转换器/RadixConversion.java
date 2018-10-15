package 整数进制转换器;

import java.util.Scanner;

public class RadixConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(Integer.toBinaryString(Integer.parseInt(s)));
            System.out.println(Integer.toOctalString(Integer.parseInt(s)));
            System.out.println(Integer.toHexString(Integer.parseInt(s)));
        }

    }
}
