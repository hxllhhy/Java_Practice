package 判断手机号的合法性;

import java.util.Scanner;

public class CheckMobilePhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^(13|15|18)\\d{9}$";
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if(s.matches(regex)) {
                System.out.println(s + "是合法的手机号!");
            } else {
                System.out.println(s + "不是合法的手机号!");
            }
        }
    }
}
