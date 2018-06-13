package Map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapErrorTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(new A(60000), "Java");
        hm.put(new A(87563), "C++");
        System.out.println(hm);
        Iterator it = hm.keySet().iterator();
        A first = (A)it.next();
        //取出Map中第一个key，并修改它的count
        first.count = 87563;
        System.out.println(hm);
        hm.remove(new A(87563)); //只能删除没有被修改过的key所对应的key-value对
        System.out.println(hm);
        System.out.println(hm.get(new A(87563)));
        System.out.println(hm.get(new A(60000)));
    }
}
