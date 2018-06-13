import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("蛋蛋");
        c.add(6);
        System.out.println("c集合里的元素个数：" + c.size());
        c.remove(6);
        System.out.println("c集合里的元素个数：" + c.size());
        System.out.println("c集合里是否包含\"蛋蛋\"字符串：" + c.contains("蛋蛋"));
        c.add("龙龙");
        System.out.println("c集合里的元素：" + c);

        Collection books = new HashSet();
        books.add("龙龙");
        books.add("苒苒");
        System.out.println("books集合里的元素：" + books);
        System.out.println("c集合里是否完全包含books集合：" + c.containsAll(books));
        c.removeAll(books);
        System.out.println("c集合里的元素：" + c);
        c.clear();
        System.out.println("c集合里的元素：" + c);
        books.retainAll(c);
        System.out.println("books集合里的元素：" + books);


    }
}
