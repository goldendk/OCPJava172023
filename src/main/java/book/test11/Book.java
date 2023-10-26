package book.test11;

public class Book {
    private final String title;
    private final double price;

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
