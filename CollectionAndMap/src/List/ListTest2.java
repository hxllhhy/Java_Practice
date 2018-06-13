package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest2 {
    public static void main(String[] args) {
        String[] books = {"疯狂Java讲义","疯狂IOS讲义","Java EE"};
        List list = new ArrayList();
        for(String i : books) {
            list.add(i);
        }
        ListIterator it = list.listIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            it.add("=================");
        }
        while(it.hasPrevious()) {
            System.out.println(it.previous());

        }
    }
}
