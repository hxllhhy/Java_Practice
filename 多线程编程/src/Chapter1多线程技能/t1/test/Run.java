package Chapter1多线程技能.t1.test;

import Chapter1多线程技能.t1.com.mythread.www.MyThread;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束!");
    }
}
//代码运行结果与调用顺序无关
//线程的调用的随机性
