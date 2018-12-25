package 停止线程.暴力停止线程.test2;

class SynchronizedObject {
    private String username = "a";
    private String password = "aa";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class MyThread extends Thread {
    private SynchronizedObject object;
    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }
    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread t1 = new MyThread(object);
            t1.start();
            Thread.sleep(500);
            t1.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
