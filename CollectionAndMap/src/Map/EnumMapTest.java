package Map;

import java.util.EnumMap;


enum Season2 {
    SPRING,SUMMER,FALL,WINTER
}
public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap en = new EnumMap(Season2.class);
        en.put(Season2.SUMMER, "xia");
        en.put(Season2.SPRING,"chun");
        System.out.println(en);
    }
}
