package Queue;

import java.util.ArrayDeque;

public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque();
        //offer and poll

        queue.offer("Java");
        queue.offer("C++");
        queue.offer("Python");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
