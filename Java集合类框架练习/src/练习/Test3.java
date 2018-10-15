package 练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
public class Test3 {
    static Scanner sc = new Scanner(System.in);
    static List<Student> list = new ArrayList<>();
    static Student stu = new Student();
    public static void main(String[] args) {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("【1】添加");
        System.out.println("【2】查看");
        System.out.println("【3】修改");
        System.out.println("【4】删除");
        System.out.print("请选择您的操作:");
        while (true) {
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    add();
                    break;
                case "2":
                    sel();
                    break;
                case "3":
                    set();
                    break;
                case "4":
                    del();
                    break;
            }
        }
    }
    static void add() {
        while (true) {
            System.out.print("请输入学生姓名:");
            stu.setName(sc.nextLine());
            System.out.print("请输入学生年龄:");
            stu.setAge(sc.nextLine());
            System.out.println("添加成功!");
            list.add(stu);
            System.out.println("继续添加?y/n:");
            String flag = sc.nextLine();
            if(flag.equals("n") || flag.equals("N")) {
                break;
            } else {
                continue;
            }
        }
    }
    static void sel() {
        for (Student s : list) {
            System.out.println("姓名:" + s.getName() + ",年龄:" + s.getAge());
        }
    }

    static void set() {
        System.out.println("请输入你要修改的学生姓名:");
        String name = sc.nextLine();
        for (Student s : list) {
            if(name.equals(s.getName())) {
                System.out.println("有学生信息正在修改");
                System.out.println("请输入修改后的姓名:");
                String newName = sc.nextLine();
                s.setName(newName);
                System.out.println("请输入修改后的年龄:");
                String newAge = sc.nextLine();
                s.setAge(newAge);
                System.out.println("修改成功");
                break;

            } else {
                System.out.println("修改失败,未找到学生");
            }
        }
    }
    static void del() {
        System.out.println("请输入要删除的姓名:");
        String name = sc.nextLine();
        for (Student s : list) {
            if(name.equals(s.getName())) {
                System.out.println("找到学生正在删除");
                list.remove(s);
                System.out.println("删除成功");
                break;
            } else {
                System.out.println("删除失败,未找到该学生");
            }
        }
    }
}
