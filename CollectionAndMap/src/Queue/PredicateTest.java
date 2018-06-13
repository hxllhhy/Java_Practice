package Queue;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add(new String("Java"));
        books.add(new String("C++"));
        books.add(new String("Python"));
        books.add(new String("PHP"));

        books.removeIf(ele -> ((String)ele).length() < 4);
        System.out.println(books);
    }
}
