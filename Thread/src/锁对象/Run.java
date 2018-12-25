package 锁对象;

class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void methodB() {
        try {
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName() + " begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class ThreadA extends Thread {
    private MyObject myObject;
    public ThreadA(MyObject myObject) {
        super();
        this.myObject = myObject;
    }
    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
class ThreadB extends Thread {
    private MyObject myObject;
    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }
    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}
public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(myObject);
        a.setName("A");
        ThreadB b = new ThreadB(myObject);
        b.setName("B");
        a.start();
        b.start();
    }
}
