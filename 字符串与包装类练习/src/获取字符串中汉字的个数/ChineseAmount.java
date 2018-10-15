package 获取字符串中汉字的个数;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ChineseAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int amount = 0;
            String s = sc.nextLine();
            char[] charArray = s.toCharArray();
            for (char i : charArray) {
                boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$", i + "");
                if (matches) {
                    amount++;
                }
            }
            System.out.println(amount);
        }
    }
}
