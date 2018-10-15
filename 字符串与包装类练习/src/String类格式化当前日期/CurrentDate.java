package String类格式化当前日期;

import java.util.Date;
import java.util.Locale;

public class CurrentDate {
    public static void main(String[] args) {
        Date today = new Date();
        String a = String.format(Locale.US, "%tb", today); //格式化后的字符串为月份的英文缩写
        System.out.println("格式化后的字符串为月份的英文缩写tb:" + a);

        String b = String.format(Locale.US, "%tB", today); //格式化后的字符串为月份的英文全写
        System.out.println("格式化后的字符串为月份的英文全写tB:" + b);

        String c = String.format(Locale.US, "%ta", today);
        System.out.println("格式化后的字符串为星期ta:" + c);

        String d = String.format("%tA", today);
        System.out.println("格式化后的字符串为星期tA:" + d);

        String e = String.format("%tY", today);
        System.out.println("格式化后的字符串为4位的年份值tY:" + e);

        String f = String.format("%ty", today);
        System.out.println("格式化后的字符串为2位的年份值ty:" + f);

        String g = String.format("%tm", today);
        System.out.println("格式化后的字符串为2位的月份值tm:" + g);

        String h = String.format("%td", today);
        System.out.println("格式化后的字符串为2位的日期值td:" + h);

        String i = String.format("%te", today);
        System.out.println("格式化后的字符串为(不补0)日期值te:" + i);
    }
}
