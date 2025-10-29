package org.example.Lab3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Movie extends Media
{
    private int duration;
    private ArrayList<Review> review;
    public void addReview(Review review){
        this.review.add(review);
    }


    public void watch(User user){
        user.checkOut();
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        ArrayList<Movie> similarMovies = new ArrayList<Movie>();
        for(Movie m : movieCatalog){
            if (m.getAuteur().equals(this.getAuteur()) && m != this){
                similarMovies.add(m);
            }
        }
        return similarMovies;
    }

    @Override
    public String getMediaType(){
        if (getDuration() >= 120){
            return "Long movie";
        }else {
            return "Movie";
        }
    }

    public Movie() {
    }

    public Movie(String title, String auteur, String ISNB, double price, int duration) {
        super(title, auteur, ISNB, price);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                super.toString()+'}';
    }
}
