package 停止线程.暴力停止线程.test1;

class MyThread extends Thread {
    private int i = 0;
    @Override
    public void run() {
        try {
            while (true) {
                i ++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t1 = new MyThread();
            t1.start();
            Thread.sleep(8000);
            t1.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
