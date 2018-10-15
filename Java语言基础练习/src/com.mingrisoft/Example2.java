package com.mingrisoft;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long number = sc.nextLong();
        System.out.println("你输入的数字是：" + number);
        System.out.println("该数字乘2：" + (number << 1));
        System.out.println("该数字乘4：" + (number << 2));
        System.out.println("该数字乘8：" + (number << 3));
        System.out.println("该数字乘16：" + (number << 4));
    }
}
