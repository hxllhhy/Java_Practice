package com.mingrisoft;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long number = sc.nextLong();
        String check = (number%2 == 0)?"这个数字是：偶数":"这个数字是：奇数";
        System.out.println(check);
    }
}
