package 停止线程.在沉睡中停止.test1;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(20000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止!进入catch!" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t1 = new MyThread();
            t1.start();
            Thread.sleep(2000);
            t1.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
