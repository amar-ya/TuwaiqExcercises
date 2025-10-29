package org.example.Lab3;

import java.util.ArrayList;
import java.util.List;

public class Music extends Media
{
    private String artist;

    public String getArtist() {
        return super.getAuteur();
    }

    public void setArtist(String artist) {
        super.setAuteur(artist);
    }

    public void listen(User user){
        user.checkOut();
    }

    public ArrayList<Music> generatePlayList(List<Music> musicCatalog){
        ArrayList<Music> playlist = new ArrayList<>();
        for(Music m : musicCatalog){
           if (m.getArtist().equals(this.getArtist()) && m != this){
               playlist.add(m);
           }
        }
        return playlist;
    }

    @Override
    public String getMediaType() {
        if(getPrice() >= 10){
            return "Premium Music";
        }else {
            return "Music";
        }
    }

    public Music() {
    }

    public Music(String title, String artist, String ISNB, double price) {
        super(title, artist, ISNB, price);
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                super.toString()+'}';
    }
}
