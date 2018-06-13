package Queue;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] arg) {
        Collection books = new HashSet();
        books.add(new String("I love Java"));
        books.add(new String("I love C++"));
        books.add(new String("Python"));
        books.add(new String("PHP"));

        System.out.println(calAll(books, ele->((String)ele).contains("I love")));
        System.out.println(calAll(books, ele->((String)ele).contains("P")));
        System.out.println(calAll(books, ele->((String)ele).length() > 10));
    }
    public static int calAll(Collection books, Predicate p) {
        int total = 0;
        for(Object obj : books) {
            if(p.test(obj)){
                total ++;
            }
        }
        return total;
    }
}
