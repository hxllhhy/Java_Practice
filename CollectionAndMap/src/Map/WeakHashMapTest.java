package Map;

import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap whm = new WeakHashMap();
        whm.put(new String("yuwen"), new String("A"));
        whm.put(new String("shuxue"), new String("B"));
        whm.put(new String("yingyu"), new String("C"));
        whm.put("Java", new String("B"));
        //该key是一个系统缓存的字符串对象
        System.out.println(whm);
        System.gc();
        System.runFinalization();
        System.out.println(whm);
    }

}
