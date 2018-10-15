package Chapter1多线程技能.randomThread.test;

import Chapter1多线程技能.randomThread.mythread.MyThread;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setName("mythread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
