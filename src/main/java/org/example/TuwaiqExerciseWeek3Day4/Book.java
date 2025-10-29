package org.example.TuwaiqExerciseWeek3Day4;

public class Book extends Product
{
    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{ title="+ getName() +
                " author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    //15% discount
    @Override
    public double getDiscount() {
        double discounted = (getPrice()*15) /100;
        return getPrice()-discounted;
    }
}
