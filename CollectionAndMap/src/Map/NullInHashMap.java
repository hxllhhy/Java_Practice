package Map;

import java.util.HashMap;

public class NullInHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(null, null);
        hm.put(null, null);//已经有一个key-value的key为null,所以无法放入
        hm.put("a", null);//允许多个value为null
        System.out.println(hm);

    }
}
