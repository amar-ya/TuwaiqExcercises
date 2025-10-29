package org.example.TuwaiqExerciseWeek3Day4;

public class Movie extends Product
{
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Movie() {
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }


    @Override
    public String toString() {
        return "Movie{ title="+ getName() +
                "director='" + director + '\'' +
                ", price=" + price +
                '}';
    }

    //10% discount
    @Override
    public double getDiscount() {
        double discounted = (getPrice()*10) /100;
        return getPrice()-discounted;
    }
}
