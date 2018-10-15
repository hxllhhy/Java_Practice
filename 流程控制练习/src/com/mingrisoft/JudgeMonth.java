package com.mingrisoft;

import java.util.Scanner;

public class JudgeMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个月份：");
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("该月份是冬季。");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("该月份是春季。");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("该月份是夏季。");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("该月份是秋季。");
                break;
            default:
                System.out.println("你那里有" + month + "月份吗？");
        }
    }
}
