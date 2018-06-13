package Queue;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        //push and pop

        stack.push("Java");
        stack.push("C++");
        stack.push("Python");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
