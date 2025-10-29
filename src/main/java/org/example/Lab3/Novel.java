package org.example.Lab3;

import java.util.ArrayList;

public class Novel extends Book
{
    private String genre;

    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5){
            return "Bestselling Novel";
        }else {
            return "Novel";
        }
    }

    public Novel() {
    }

    public Novel(String title, String auteur, String ISNB, double price, int stock, ArrayList<Review> review, String genre) {
        super(title, auteur, ISNB, price, stock, review);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "genre"+getGenre()+" "+super.toString();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
