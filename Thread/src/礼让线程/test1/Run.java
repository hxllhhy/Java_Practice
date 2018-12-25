package 礼让线程.test1;

import javax.sound.midi.Soundbank;
import java.util.Map;

class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000; i++) {
            //Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时:" + (endTime-beginTime) + "ms!");
    }
}
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
