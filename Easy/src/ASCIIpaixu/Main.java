package ASCIIpaixu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] ascii = new char[3];
        while(scan.hasNext()) {
            String string = scan.nextLine();
            for(int i = 0; i < 3; i++) {
                ascii[i] = string.charAt(i);
            }
            Arrays.sort(ascii);
            System.out.print(ascii[0] + " ");
            System.out.print(ascii[1] + " ");
            System.out.println(ascii[2]);
        }
    }
}
