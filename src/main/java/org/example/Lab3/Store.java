package org.example.Lab3;

import java.util.ArrayList;



public class Store {
    private ArrayList<User> user;
    private ArrayList<Media> media;

    public void addUser(User user) {
        this.user.add(user);
    }

    private ArrayList<User> displayUsers() {
        return user;
    }

    public void addMedia(Media media) {
        this.media.add(media);
    }

    public Store(ArrayList<User> user, ArrayList<Media> media) {
        this.user = user;
        this.media = media;
    }

    public Store() {
    }

    public ArrayList<Media> displayMedias() {
        return media;
    }

    public Book searchBook(String title) {
        Book book = new Book();
        for (Media m : media) {
            if (m.getTitle().equals(title)) {
                book.setTitle(m.getTitle());
                book.setISNB(m.getISNB());
                book.setPrice(m.getPrice());
                book.setAuteur(m.getAuteur());
            }
        }
        return book;
    }

}
