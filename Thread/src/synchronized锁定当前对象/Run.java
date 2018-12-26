package synchronized锁定当前对象;

class Task {
    synchronized public void otherMethod() {
        System.out.println("-----------------run---otherMethod----------------");
    }
    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName()
                + " i=" + (i+1));
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
        task.otherMethod();
    }
}
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        ThreadA a = new ThreadA(task);
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(task);
        b.start();
    }
}
