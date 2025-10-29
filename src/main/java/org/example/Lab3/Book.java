package org.example.Lab3;

import java.util.ArrayList;


public class Book extends Media
{
    private int stock;
    private ArrayList<Review> review;


    public Book() {
    }

    public Book(String title, String auteur, String ISNB, double price, int stock, ArrayList<Review> review) {
        super(title, auteur, ISNB, price);
        this.stock = stock;
        this.review = review;
    }


    public ArrayList<Book> recommendSimilarBooks(ArrayList<Book> bookCatalog){
        ArrayList<Book> similarBooks = new ArrayList<>();
        for(Book m : bookCatalog){
            if (m.getAuteur().equals(this.getAuteur()) && m != this){
                similarBooks.add(m);
            }
        }
        return similarBooks;
    }

    public void addReview(Review review){
        this.review.add(review);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setReview(ArrayList<Review> review) {
        for (int i = 0 ; i > review.size() ; i++) {
            this.review.add(review.get(i));
        }
    }

    public double getAverageRating(){
        double avgRating = 0.0;
        for(Review r : review){
            avgRating += r.getRating();
        }
        avgRating /= review.size();
        return avgRating;
    }


    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5){
            return "Best selling book";
        }else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock='" + stock + '\'' +
                ", review=" + review +
                '}' + " "+ super.toString();
    }
}
