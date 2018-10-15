package 验证IP地址的有效性;

import java.util.Scanner;

public class CheckIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(matches(s));
    }
    public static String matches(String s) {
        if(s != null && !s.isEmpty()) {
            String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
            if(s.matches(regex)) {
                return  s + "是一个合法的IP地址!";
            } else {
                return s + "不是一个合法的IP地址!";
            }
        }
        return "请输入要验证的IP地址!";
    }
}
