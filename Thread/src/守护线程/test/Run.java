package 守护线程.test;

class MyThread extends Thread {
    private int i = 0;
    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        Thread.sleep(5000);
        System.out.println("我离开了");
    }
}
