package 局部内部类的简单应用;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock(1000, true);
        //创建AlarmClock对象
        clock.start();
        //启动start方法
        JOptionPane.showMessageDialog(null, "是否退出？");
        //框框 点击退出 就停止
        System.exit(0);
    }
}
