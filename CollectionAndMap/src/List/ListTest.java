package List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("Java"));
        books.add(new String("C++"));
        books.add(new String("Python"));
        System.out.println(books);
        books.add(1, new String("PHP"));
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf(new String("C++")));
        books.set(1, new String("Java"));
        System.out.println(books);

        //将book集合的第二个元素（包含）到第三个元素（不包含）截取成子集合
        System.out.println(books.subList(1, 2));
    }
}
