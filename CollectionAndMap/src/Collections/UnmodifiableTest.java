package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class UnmodifiableTest {
    public static void main(String[] args) {
        List unmL = Collections.emptyList(); //空的、不可变对象
        Set unmS = Collections.singleton("Java"); //只有一个元素、不可变的对象
        Map scores = new HashMap();
        scores.put("yu", 80);
        scores.put("java", 82);
        Map unmM = Collections.unmodifiableMap(scores); //不可变

        //异常UnsupportedOperationException
        unmL.add("test");
        unmS.add("test");
        unmM.put("yu", 90);
    }
}
