package org.example.Lab3;

import java.util.ArrayList;

public class AcademicBook extends Book
{
    private String subject;


    public AcademicBook() {
    }

    public AcademicBook(String title, String auteur, String ISNB, double price, int stock, ArrayList<Review> review, String subject) {
        super(title, auteur, ISNB, price, stock, review);
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        if(getAverageRating() >= 4.5){
            return "Bestselling AcademicBook";
        }else {
            return "AcademicBook";
        }
    }

    @Override
    public String toString() {
        return "subject "+getSubject()+" "+super.toString();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
