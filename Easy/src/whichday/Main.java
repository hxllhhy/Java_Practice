package whichday;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String date = scan.nextLine();
            //创建date对象得到输入的字符串
            SimpleDateFormat demo = new SimpleDateFormat("yyyy/MM/dd");
            //创建demo对象,根据特定的日期格式在Date和字符串之间转换
            Date inputDate = null;
            //创建Date类的inputDate对象
            try {
                inputDate = demo.parse(date);
                //parse方法用于将字符串类型的日期时间解析为Date类型
                //执行该方法需要处理异常
            } catch (Exception e) {
                e.printStackTrace();
            }

            Calendar cal = Calendar.getInstance();
            //创建Calendar类的cal对象
            cal.setTime(inputDate);
            //因为Calendar没有构造函数可以接收Date对象，必须先获得一个Calendar实例再调用其setTime()方法
            int whichday = cal.get(Calendar.DAY_OF_YEAR);
            //返回当年的第几天
            System.out.println(whichday);
        }
    }
}