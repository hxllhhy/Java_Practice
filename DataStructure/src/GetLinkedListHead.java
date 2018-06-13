import java.util.LinkedList;

public class GetLinkedListHead {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
