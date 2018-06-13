package Time;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        long now = date.getTime();
        //getTime():返回的时间是距离1970年的毫秒数.值不受setTime()的影响
        //date值受setTime()的影响
        System.out.println(now);//1521292091214
        System.out.println(date);//Sat Mar 17 21:08:11 CST 2018
        long time = now + 1000*60*60*24;//时间设置为明日此时
        date.setTime(time);
        System.out.println(date.getTime());//1521378491214
        System.out.println(now);//1521292091214
        System.out.println(date);//Sun Mar 18 21:08:11 CST 2018
    }
}