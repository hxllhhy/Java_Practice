//创建抽象父类
abstract class Device {
    private String name;
    public abstract double getPrince();
    public Device() {

    }
    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AnonymousInner {
    public void test(Device d) {
        System.out.println("购买了一个" + d.getName() + ",花掉了" + d.getPrince());
    }

    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();

        //调用有参数的构造器创建Device匿名实现类的对象
        ai.test(new Device("电子示波器") {
            @Override
            public double getPrince() {
                return 67.8;
            }
        });

        //调用无参数的构造器创建Device匿名实现类的对象
        Device d = new Device() {
            //初始化块
            {
                System.out.println("匿名内部类的初始化块...");
            }
            //实现抽象方法
            @Override
            public double getPrince() {
                return 56.2;
            }
            //重写父类的实例方法
            @Override
            public String getName() {
                return "键盘";
            }
        };
        ai.test(d);
    }
}
