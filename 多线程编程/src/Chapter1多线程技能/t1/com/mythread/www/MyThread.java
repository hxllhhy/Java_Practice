package Chapter1多线程技能.t1.com.mythread.www;


//多线程创建方式1---继承Thread类
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
