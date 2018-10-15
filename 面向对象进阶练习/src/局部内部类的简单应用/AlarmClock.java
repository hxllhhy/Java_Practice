package 局部内部类的简单应用;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class AlarmClock {
    private int delay;
    private boolean flag;
    public AlarmClock(int delay, boolean flag) {
        this.delay = delay;
        this.flag = flag;
    }
    public void start() {
        class Printer implements ActionListener { //定义内部类实现动作监听动作
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat format = new SimpleDateFormat("k:m:s"); //定义时间格式
                String result = format.format(new Date());  //获得当前时间
                System.out.println("当前的时间是：" + result);  //显示当前时间
                if(flag) { //根据flag来决定是否要发出声音
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        new Timer(delay, new Printer()).start(); //创建Timer对象并启动
    }
}
