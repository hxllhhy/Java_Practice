import java.util.LinkedList;

public class LinkedListHeadTailAdd {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        System.out.println(l);
        l.addFirst("0");
        l.addLast("4");
        l.add("3");
        System.out.println(l);
    }
}
