import jdk.nashorn.internal.runtime.arrays.IteratorAction;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("Java");
        books.add("C++");
        books.add("Python");
        books.forEach(obj -> System.out.println("迭代集合元素：" + obj));

        Iterator it = books.iterator();
        it.forEachRemaining(obj -> System.out.println("元素：" + obj));
    }
}
