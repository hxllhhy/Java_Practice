package List;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

public class ListTest4 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("Java"));
        books.add(new String("C++"));
        books.add(new String("Python"));
        books.add(new String("PHP"));
        books.add(new String("ABC"));
        books.sort((o1, o2)->((String)o1).length() - ((String)o2).length());
        System.out.println(books);
        books.replaceAll(ele->((String)ele).length());
        System.out.println(books);
    }
}
