package 判断网页请求与FTP请求;

import java.util.Scanner;

public class RequestType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String request = sc.nextLine();
        if(request.startsWith("http")) {
            System.out.println("您输入的是网页地址,希望浏览某个网站.");
        } else if(request.startsWith("ftp")) {
            System.out.println("您输入的是FTP地址,希望访问FTP服务器.");
        } else {
            System.out.println("您输入的请求信息不完整.");
        }
    }
}
