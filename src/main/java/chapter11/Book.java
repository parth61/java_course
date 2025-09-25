package chapter11;

@SuppressWarnings("ALL")
public class Book implements Product {

    private double price;
    private String name;
    private String color;
    private String author;
    private int pages;
    private String isbn;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @SuppressWarnings("unused")
    public String getAuthor() {
        return author;
    }

    @SuppressWarnings("unused")
    public void setAuthor(String author) {
        this.author = author;
    }

    @SuppressWarnings("unused")
    public int getPages() {
        return pages;
    }

    @SuppressWarnings("unused")
    public void setPages(int pages) {
        this.pages = pages;
    }

    @SuppressWarnings("unused")
    public String getIsbn() {
        return isbn;
    }

    @SuppressWarnings("unused")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
