package 字符串大小写转换;

import java.util.Scanner;

public class StringConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("全部转换为小写:" + s.toLowerCase());
        System.out.println("全部转换为大写:" + s.toUpperCase());
    }
}
