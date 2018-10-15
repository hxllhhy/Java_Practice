package com.mingrisoft;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新员工的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新员工应聘的编程语言：");
        String language = sc.nextLine();
        switch (language) {
            case "java":
            case "Java":
            case "JAVA":
                System.out.println("员工" + name + "被分配到Java程序开发部门。");
                break;
            case "c#":
            case "C#":
                System.out.println("员工" + name + "被分配到C#项目维护组。");
                break;

                default:
                    System.out.println("本公司不需要" + language + "语言的程序开发人员。");
        }
    }
}
