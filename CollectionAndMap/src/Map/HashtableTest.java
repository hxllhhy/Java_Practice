package Map;

import java.util.Hashtable;

class A { //只要两个对象的count相等，则返回true,hashCode也相等
    int count;
    public A(int count) {
        this.count = count;
    }
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj != this && obj.getClass() == A.class) {
            A a = (A)obj;
            return this.count == a.count;
        }
        return false;
    }
    public int hashCode() {
        return this.count;
    }
}
class B { //与任何对象都相等
    public boolean equals(Object obj) {
        return true;
    }
}
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(60000), "Java");
        ht.put(new A(87563), "C++");
        ht.put(new A(1232), new B());
        System.out.println(ht);

        System.out.println(ht.containsValue("teststring"));
        System.out.println(ht.containsKey(new A(87563)));
        ht.remove(new A(1232));
        System.out.println(ht);
    }
}
