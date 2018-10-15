class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("《Java》", "you", 60);
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
    }
}
