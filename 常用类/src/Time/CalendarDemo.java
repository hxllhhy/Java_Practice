package Time;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR)); //2018
        System.out.println(cal.get(Calendar.MONTH)); //2
        System.out.println(cal.get(Calendar.DATE)); //17
        cal.set(2003, 10, 23, 12, 32, 23); //设置年月日时分秒
        System.out.println(cal.getTime()); //Sun Nov 23 12:32:23 CST 2003
        cal.add(Calendar.YEAR, -1); //向前推1年
        System.out.println(cal.getTime()); //Sat Nov 23 12:32:23 CST 2002
        cal.roll(Calendar.MONTH, 8); //向前推8个月
        System.out.println(cal.getTime()); //Tue Jul 23 12:32:23 CST 2002
    }
}
