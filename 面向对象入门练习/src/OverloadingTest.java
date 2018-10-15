public class OverloadingTest {
    public void info() {
        System.out.println("普通方法：哈哈哈！");
    }
    public void info(int age) {
        System.out.println("重载方法：我" + age + "岁了！");
    }

    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        ot.info();
        for (int i = 1; i < 5; i++) {
            ot.info(i);
        }
    }
}
