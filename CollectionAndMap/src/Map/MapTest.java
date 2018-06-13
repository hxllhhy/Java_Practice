package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Java",100);
        map.put("C++",79);
        map.put("Python",10);
        //输出原value，用新值覆盖
        System.out.println(map.put("C++",99));
        System.out.println(map);
        System.out.println("是否包含C++key：" + map.containsKey("C++"));
        System.out.println("是否包含C++value：" + map.containsValue(99));
        for(Object key : map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
        map.remove("Python");
        System.out.println(map);

    }
}
