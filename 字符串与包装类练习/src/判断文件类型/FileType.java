package 判断文件类型;

import java.util.Scanner;

public class FileType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.endsWith(".txt")) {
            System.out.println("该文件是文本文件.");
        } else {
            System.out.println("该文件不是文本文件.");
        }
    }
}
