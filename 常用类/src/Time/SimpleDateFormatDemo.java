package Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //2018年03月17日 21时19分33秒
        SimpleDateFormat myFmt1 = new SimpleDateFormat("yy/MM/dd HH:mm");
        //18/03/17 21:19
        SimpleDateFormat myFmt2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2018-03-17 21:19:33
        SimpleDateFormat myFmt3 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E");
        //2018年03月17日 21时19分33秒 星期六
        SimpleDateFormat myFmt4 = new SimpleDateFormat("一年中的第D天,一年中第w个星期,一月中第W个星期,在一天中k时z时区");
        //一年中的第76天,一年中第11个星期,一月中第3个星期,在一天中21时CST时区
        Date now= new Date();
        System.out.println(myFmt.format(now));
        System.out.println(myFmt1.format(now));
        System.out.println(myFmt2.format(now));
        System.out.println(myFmt3.format(now));
        System.out.println(myFmt4.format(now));
        System.out.println(now.toString());
        //Sat Mar 17 21:19:33 CST 2018
    }
}
