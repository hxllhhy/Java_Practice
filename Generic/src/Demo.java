import java.util.ArrayList;
import java.util.List;
public class Demo {

    public void fun1() {
        Object[] objArray = new String[10]; //正确

        //objArray[0] = new Integer(100);
        //错误
        //编译器不会报错，但是运行时会抛ArrayStoreException

        //List<Object> objList = new ArrayList<String>();
        //错误
        //编译器报错，泛型引用和创建两端，给出的泛型变量必须相同
    }

    public void fun2() {
        List<Integer> integerList = new ArrayList<Integer>();
        print(integerList);

        List<String> stringList = new ArrayList<String>();
        print(stringList);
    }
    /*
     * 其中的?就是通配符
     * ?它表示一个不确定的类型，它的值会在调用时确定下来
     * 通配符只能出现在左边,即不能在new时使用通配符
     * List<?> list = new ArrayList<String>();
     * 通配符好处：可以使泛型类型更加通用,尤其是在方法调用时形参使用通配符
     */
    public void print(List<?> list) {
        //list.add("hello");
        //错误
        //编译器报错，当使用通配符时，对泛型类中的参数为泛型的方法起到了副作用，不能再使用！

        Object s = list.get(0);//正确
    }

    public void fun3() {
        List<Integer> intList = new ArrayList<Integer>();
        print1(intList);

        List<Long> longList = new ArrayList<Long>();
        print1(longList);
    }
    /*
     * 给通配符添加了限定：
     *   只能传递Number或其子类型
     *   子类通配符对通用性产生了影响，但使用形参更加灵活
     */
    public void print1(List<? extends Number> list) {
        //list.add(new Integer(100));
        //错误
        //编译器报错，说明参数为泛型的方法还是不能使用（因为?也可能为Long型）

        Number number = list.get(0);//正确
    }

    public void fun4() {
        List<Integer> intList = new ArrayList<Integer>();
        print2(intList);

        List<Number> numberList = new ArrayList<Number>();
        print2(numberList);

        List<Object> objList = new ArrayList<Object>();
        print2(objList);
    }
    /*
     * 给通配符添加了限定
     *   只能传递Integer类型，或其父类型
     */
    public void print2(List<? super Integer> list) {
        list.add(new Integer(100)); //正确
        Object obj =  list.get(0); //正确
    }
}
