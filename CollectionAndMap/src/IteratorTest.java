import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("Java");
        books.add("C++");
        books.add("Python");
        Iterator it = books.iterator();
        while(it.hasNext()) {
            String book = (String)it.next();
            System.out.println(book);
            if(book.equals("Java")) {
                it.remove();
            }
            book = "test";
            //对book变量赋值，不会改变集合本身
        }
        System.out.println(books);
    }
}
