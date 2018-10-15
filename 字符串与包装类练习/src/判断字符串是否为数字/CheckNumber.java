package 判断字符串是否为数字;

import org.apache.commons.lang.math.NumberUtils;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(NumberUtils.isNumber(s)) {
            System.out.println("输入正确,是数字格式.");
        } else {
            System.out.println("输入错误,请确认格式.");
        }
    }
}
