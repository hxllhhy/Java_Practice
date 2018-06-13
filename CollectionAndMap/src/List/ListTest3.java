package List;

import java.util.ArrayList;
import java.util.List;

class AA {
    public boolean equals(Object obj) {
        return true;
    }
}
public class ListTest3 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books. add(new String("Java"));
        books.add(new String("C++"));
        books.add(new String("Python"));
        System.out.println(books);
        books.remove(new AA());
        System.out.println(books);
        books.remove(new AA());
        System.out.println(books);
    }
}
