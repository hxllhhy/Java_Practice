package 一半异步一半同步;

class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }
}
class ThreadA extends Thread {
    private Task task;
    public ThreadA(Task task) {
        super();
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
class ThreadB extends Thread {
    private Task task;
    public ThreadB(Task task) {
        super();
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA a = new ThreadA(task);
        ThreadB b = new ThreadB(task);
        a.start();
        b.start();
    }
}
