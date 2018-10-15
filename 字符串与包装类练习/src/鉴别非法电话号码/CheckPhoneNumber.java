package 鉴别非法电话号码;

import java.util.Scanner;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }

    public static String check(String s) {
        if (s == null || s.isEmpty()) {
            return "请输入电话号码!";
        }
        String regex = "^\\d{3}-?\\d{8}|\\d{4}-?\\d{8}$";
        if (s.matches(regex)) {
            return s + "是一个合法的电话号码!";
        } else {
            return s + "不是一个合法的电话号码!";
        }
    }
}
