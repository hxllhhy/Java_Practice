package Map;

import java.util.LinkedHashMap;

public class LinkedHashTest {
    public static void main(String[] args) {
        LinkedHashMap scores = new LinkedHashMap(); //维护元素的插入顺序
        scores.put("语文", 80);
        scores.put("数学", 82);
        scores.put("英文", 76);
        scores.forEach((key, value)->System.out.println(key + "--->" + value));
    }
}
