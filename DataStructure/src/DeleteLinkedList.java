import java.util.LinkedList;

public class DeleteLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        System.out.println(l);
        l.subList(2,4).clear();
        System.out.println(l);
    }
}
