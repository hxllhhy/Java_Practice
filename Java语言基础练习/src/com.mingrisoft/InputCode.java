package com.mingrisoft;

import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String line = sc.nextLine();
        System.out.println("原来你身份证号是：" + line.length() + "位数字的啊");
    }
}
