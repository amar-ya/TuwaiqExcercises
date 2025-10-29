package org.example.Lab3;

import java.util.ArrayList;
import java.util.List;

public class main
{
    public static void main(String[] args) {

        //____________________________BOOK_________________________________\\
        Review bookReview = new Review("Ammar","GOAT",50000);
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book("Lord of the ring","Saleh","1233214566547",75.5,100, new ArrayList<Review>());
        Book b5 = new Book("One Piece","Oda","1233214566547",75.5,100, new ArrayList<Review>());
        ArrayList<Book> ListOfBooks = new ArrayList<>();
        b1.setAuteur("Ammar");
        b1.setPrice(205.6);
        b1.setTitle("OCA SE 24");
        b1.setISNB("s1297518jk1");
        b2.setTitle("OCA SE 8");
        b2.setAuteur("Ammar");
        b3.setAuteur("Saleh");
        b3.setTitle("OCA SE 8");
        b5.addReview(bookReview);
        ListOfBooks.add(b1);
        ListOfBooks.add(b2);
        ListOfBooks.add(b3);
        ListOfBooks.add(b4);
        ListOfBooks.add(b5);

        System.out.println("\n\n"+b5+"\n\n");



        //____________________________ MOVIE _________________________________\\
        Review movieReview= new Review("khalid", "this Auteur is amazing", 10);
        ArrayList<Movie> ListOfMovies = new ArrayList<>();
        Movie m1 = new Movie();
        Movie m2 = new Movie();
        Movie m3 = new Movie();
        Movie m4 = new Movie("OP","Ammar","1233214566547",75.5,190);
        Movie m5 = new Movie("HunterxHunter", "Mohammed", "1233214566547",75.5,120);
        m1.setDuration(150);
        m1.setAuteur("Ammar");
        m1.setTitle("GOT");
        m2.setTitle("GOT2");
        m2.setAuteur("Khalid");
        m3.setAuteur("Ammar");
        m3.setTitle("OP");
        ListOfMovies.add(m1);
        ListOfMovies.add(m2);
        ListOfMovies.add(m3);
        ListOfMovies.add(m4);
        ListOfMovies.add(m5);
        System.out.println(m1.recommendSimilarMovies(ListOfMovies));


        //____________________________ MUSIC _________________________________\\
        ArrayList<Music> ListOfMusic = new ArrayList<>();
        Music music1 = new Music("the places", "Mohammed Abdu", "1233214566547", 10);
        Music music2 = new Music("the time of Silence", "Talal Madah", "1233214566547", 10);
        Music music3 = new Music("oh the one who look for the easy", "Mohammed Abdu", "1233214566547", 10);
        Music music4 = new Music("i didnt wish you", "Mohammed Abdu", "1233214566547", 10);
        Music music5 = new Music("someone Like You", "Adele", "1233214566547", 10);
        ListOfMusic.add(music1);
        ListOfMusic.add(music2);
        ListOfMusic.add(music3);
        ListOfMusic.add(music4);
        ListOfMusic.add(music5);

        System.out.println(music1.generatePlayList(ListOfMusic));


        //____________________________ NOVEL _________________________________\\
        Review novelReview= new Review("Saleh", "this is actually not a bad novel", 3);
        Novel n1 = new Novel("The Great Gatsby", "F. Scott Fitzgerald", "1233214566547", 100.95, 100000,new ArrayList<Review>(), "Fiction");
        Novel n2 = new Novel("the beginning after the end", "Suliman", "L123321456654", 25.7, 150, new ArrayList<Review>(), "Fantasy");
        Novel n3 = new Novel();
        Novel n4 = new Novel();
        Novel n5 = new Novel();
        n3.setAuteur("Ammar");
        n3.setGenre("sci-fi");
        n3.setTitle("something new");
        n4.setAuteur("Ammar");
        n4.setGenre("sci-fi");
        n4.setTitle("IDK what to name this Novel");
        n5.setAuteur("Ammar");
        n5.setGenre("sci-fi");
        n5.setTitle("I ran out of ideas");
        n2.addReview(novelReview);



        //____________________________ACADEMICBOOK_________________________________\\
        Review academicBookReview = new Review("Saleh", "very bad book doesnt give any real world example and statics", 0);
        ArrayList<AcademicBook> listOfAcademicBooks = new ArrayList<>();
        AcademicBook ab1 = new AcademicBook("the meow meow book", "cat bin misfer al cat", "1233214566547", 100.95, 100000,new ArrayList<Review>(), "Science Fiction");
        ab1.addReview(academicBookReview);
        AcademicBook ab2 = new AcademicBook("Rich dad poor dad", "robert kiyosaki" , "1233214566547",35.0, 25000,new ArrayList<Review>(), "Business");
        AcademicBook ab3 = new AcademicBook("fake money fake teacher", "robert kiyosaki", "1233214566547", 25.0, 15000, new ArrayList<Review>(), "Business");
        AcademicBook ab4 = new AcademicBook();
        AcademicBook ab5 = new AcademicBook();
        ab4.setAuteur("Ammar");
        ab4.setTitle("the knowledge of nothing");
        ab5.setAuteur("Ammar");
        ab5.setTitle("wallah im out of names to give");

        listOfAcademicBooks.add(ab1);
        listOfAcademicBooks.add(ab2);
        listOfAcademicBooks.add(ab3);
        listOfAcademicBooks.add(ab3);
        listOfAcademicBooks.add(ab5);
        System.out.println(listOfAcademicBooks);




        //____________________________USER_________________________________\\
        ArrayList<User> listOfUsers = new ArrayList<>();
        User u1 = new User("Abdulrahman", "abdo97@hotmail.com", new ArrayList<Media>(), new ArrayList<Media>());
        User u2 = new User("Hatem", "Hatem97@hotmail.com", new ArrayList<Media>(), new ArrayList<Media>());
        User u3 = new User("Ziyad", "Zezo97@hotmail.com", new ArrayList<Media>(), new ArrayList<Media>());
        User u4 = new User("muteb", "Muteb97@hotmail.com", new ArrayList<Media>(), new ArrayList<Media>());
        User u5 = new User("abdulelah", "abdo98@hotmail.com", new ArrayList<Media>(), new ArrayList<Media>());
        listOfUsers.add(u1);
        listOfUsers.add(u2);
        listOfUsers.add(u3);
        listOfUsers.add(u4);
        listOfUsers.add(u5);

        u1.addToCart(m1);
        u2.addToCart(m2);
        u1.addToCart(music1);
        u1.addToCart(ab1);
        u3.addToCart(b2);
        u4.addToCart(n5);
        u5.addToCart(b4);
        u1.checkOut();
        u2.checkOut();
        u3.checkOut();
        u4.checkOut();
        u5.checkOut();
    }

}
