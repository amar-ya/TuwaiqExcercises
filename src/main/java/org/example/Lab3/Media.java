package org.example.Lab3;

import java.util.ArrayList;

public class Media
{
    private String title, auteur, ISNB;
    private double Price;


    public Media() {
    }

    public Media(String title, String auteur, String ISNB, double price) {
        this.title = title;
        this.auteur = auteur;
        this.ISNB = ISNB;
        Price = price;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", ISNB='" + ISNB + '\'' +
                ", Price=" + Price +
                '}';
    }

    public String getMediaType(){
        return "Media";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public ArrayList<Media> recommendSimilarMedia(ArrayList<Media> mediaCatalog){
        ArrayList<Media> similarMedia = new ArrayList<>();
        for(Media m : mediaCatalog){
            if (m.getAuteur().equals(this.getAuteur()) && m != this){
                similarMedia.add(m);
            }
        }
        return similarMedia;
    }

    public String getISNB() {
        return ISNB;
    }

    public void setISNB(String ISNB) {
        this.ISNB = ISNB;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
