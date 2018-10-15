package ASCII编码查看器;

import java.util.Scanner;

public class ASCIIViewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                System.out.print(Character.codePointAt(s, i) + " ");
            }
            System.out.println();
        }
    }
}
