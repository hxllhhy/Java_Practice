package Map;


import java.util.IdentityHashMap;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(new String("yuwen"), 89);
        ihm.put(new String("yuwen"), 78);
        ihm.put("java", 90);
        ihm.put("java", 99);
        System.out.println(ihm);
    }
}
