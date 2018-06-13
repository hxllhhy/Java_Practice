package Queue;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        books.offer("Java");
        books.push("C");
        books.offer("C++");
        books.push("Python");
        books.offerFirst("PHP");
        for(int i = 0; i < books.size(); i++) {
            System.out.println("遍历中：" + books.get(i));
        }
        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}
