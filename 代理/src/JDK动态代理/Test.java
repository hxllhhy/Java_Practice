package JDK动态代理;

import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
class ProxyHandler implements InvocationHandler {
    private Object tar;
    //绑定委托对象,并返回代理类
    public Object bind(Object tar) {
        this.tar = tar;
        //绑定该类实现的所有接口,取得代理类
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),
                                      tar.getClass().getInterfaces(),
                                    this);
    }

    //不依赖具体接口实现
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;//被代理的类型为Object基类
        //这里可以进行AOP
        //before处理
        System.out.println("before...");
        result = method.invoke(tar, args);
        //after
        System.out.println("after...");
        return result;
    }
}
public class Test {
    public static void main(String[] args) {
        ProxyHandler proxy = new ProxyHandler();
        //绑定该类实现的所有接口
        Subject sub = (Subject)proxy.bind(new RealSubject());
        sub.doSomething();
    }
}
/**
 * 在调用过程中使用了通用的代理类包装了RealSubject实例,然后调用了jdk的代理工厂方法实例化一个具体的代理类.
 * 当接口改变的时候,虽然被代理类需要改变,但是代理类却不用改变了.
 * 这个调用足够灵活,可以动态生成一个具体的代理类,而不用自己显示创建一个实现具体接口的代理类.
 */