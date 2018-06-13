class MyClass {
    int height;
    MyClass() {
        System.out.println("无参构造函数");
        height = 4;
    }
    MyClass(int i) {
        System.out.println("房子高度为" + i + "米");
        height = i;
    }
    void info() {
        System.out.println("房子高度为" + height + "米");
    }
    void info(String s) {
        System.out.println(s + "房子高度为" + height + "米");
    }
}



public class OverloadTest {
    public static void main(String[] args) {
        MyClass t = new MyClass(3);
        t.info();
        t.info("重载");
        new MyClass();
    }
}
