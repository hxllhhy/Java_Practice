package Time;

import java.util.Calendar;

public class LenientTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.MONTH, 13); //设置MONTH为13，结果为YEAR+1，MONTH为1
        System.out.println(cal.getTime());

        //cal.setLenient(false); //关闭容错性

        cal.set(Calendar.MONTH, 13); //导致运行时异常
        System.out.println(cal.getTime());
    }
}
