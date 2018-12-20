package 静态代理;

//抽象角色
interface Subject {
    void doSomething();
}
//真实角色
class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("call doSomething()");
    }
}
//代理角色
class ProxySubject implements Subject {
    //代理模式的作用是：为其他对象提供一种代理以控制对这个对象的访问
    Subject subimpl = new RealSubject();
    @Override
    public void doSomething() {
        System.out.println("before"); //调用目标对象之前可以做相关操作
        subimpl.doSomething();
        System.out.println("after"); //调用目标对象之后可以做相关操作
    }
}
public class Test {
    public static void main(String[] args) {
        Subject sub = new ProxySubject();
        sub.doSomething();
    }
}
/**
 * ProxySubject实现了Subject接口,并持有Subject接口类型的引用
 * 这样调用的依然是doSomething方法,只是实例化对象的过程改变了
 * 结果来看,代理类ProxySubject可以自动为我们加上before和after等我们需要的动作
 */
