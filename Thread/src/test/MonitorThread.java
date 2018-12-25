package test;

public class MonitorThread extends Thread {

    boolean waiting = true;
    boolean ready = false;
    MonitorThread() {

    }

    public void run() {
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName);
        while(waiting) {

        }
    }
}
