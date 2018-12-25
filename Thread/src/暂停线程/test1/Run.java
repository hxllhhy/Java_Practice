package 暂停线程.test1;


class MyObject {
    private String username = "1";
    private String password = "11";
    public void setValue(String u, String p) {
        this.username = u;
        if(Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程!");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }
    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                myObject.setValue("a", "aa");
            };
        };
        t1.setName("a");
        t1.start();
        Thread.sleep(500);
        Thread t2 = new Thread() {
            public void run() {
                myObject.printUsernamePassword();
            };
        };
        t2.start();
    }

}
