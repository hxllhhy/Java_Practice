package 重写父类中的方法;

public class Manager extends Employee {
    @Override
    public String info() {
        return "我是儿子：嘿嘿嘿";
    }
}
