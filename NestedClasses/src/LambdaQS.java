import sun.misc.Launcher;

interface Eatable {
    void taste();
}
interface Flyable {
    void fly(String weather);
}
interface Addable {
    int add(int a, int b);
}

public class LambdaQS {
    public void eat(Eatable e) {
        System.out.println("我正在吃：" + e);
        e.taste();
    }
    public void drive(Flyable f) {
        System.out.println("我正在驾驶：" + f);
        f.fly("碧空如洗的日子");
    }
    public void test(Addable add) {
        System.out.println("我正在做加法：" + add);
        System.out.println("5和3的和为：" + add.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQS lq = new LambdaQS();

        //Lambda表达式的代码块只有一条语句，可以省略花括号
        lq.eat(() -> System.out.println("苹果味道不错！"));

        //Lambda表达式的形参列表只有一个形参，可以省略圆括号
        lq.drive(weather -> {
            System.out.println("今天天气是：" + weather);
            System.out.println("直升机飞行平稳");
        });

        //Lambda表达式的代码块只有一条语句，可以省略花括号
        //代码块中只有一条语句，即该表达式需要返回值，可省略return
        lq.test((a, b) -> a+b);
    }
}
