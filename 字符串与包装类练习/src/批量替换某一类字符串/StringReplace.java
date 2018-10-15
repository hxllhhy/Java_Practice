package 批量替换某一类字符串;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        System.out.println("请输入要替换的部分:");
        String sOld = sc.nextLine();
        System.out.println("请输入替换字符串的部分:");
        String sNew = sc.nextLine();
        System.out.println(s.replaceFirst(sOld, sNew)); //只替换第一次出现的,支持正则表达式
        System.out.println(s.replace(sOld, sNew)); //全部替换
        System.out.println(s.replaceAll(sOld, sNew)); //全部替换,支持正则表达式
    }
}
