package 将数字格式化为货币字符串;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//获取货币格式对象 public static NumberFormat getCurrencyInstance(Locale inLocale)
//执行格式化 public final String format(double number)

public class FormatNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        double number = sc.nextDouble();
        System.out.println("该数字用Locale类的常量作为格式化对象的构造参数，将获得不同的货币格式：");

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("Locale.CHINA:" + format.format(number));

        format = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Locale.US:" + format.format(number));

        format = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println("Locale.ENGLISH:" + format.format(number));
    }
}
