import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String line = scanner.nextLine();

        //打印对输出文本的描述
        System.out.println("原来你身份证号是" + line.length() + "位数字的啊");

        //in输入流的实例对象作为类成员来接收用户的输入
        //Scanner类是Java的扫描器类，可以从输入流中读取指定类型的数据或字符串
    }
}
