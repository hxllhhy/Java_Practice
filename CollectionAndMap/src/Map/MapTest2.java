package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("Java", 100);
        map.put("C++", 79);
        map.put("Python", 10);
        map.replace("Java",66);
        System.out.println(map);
        map.merge("C++", 20, (oldVal, param)->(Integer)oldVal + (Integer)param);
        System.out.println(map);
        map.computeIfAbsent("JavaHHH", (key)->((String)key).length());
        System.out.println(map);
        map.computeIfPresent("JavaHHH", (key, value)->(Integer)value * (Integer)value);
        System.out.println(map);
    }
}
