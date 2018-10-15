package 字符与Unicode码的转换;

import java.util.Scanner;

public class CharacterASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            System.out.print((int)c + " ");
        }
    }
}
