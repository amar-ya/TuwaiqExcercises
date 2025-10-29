package org.example.Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class interactiveMain
{

    public static ArrayList<Media> DBForMedia(){

        ArrayList<Media> storage = new ArrayList<>();
        //____________________________ACADEMICBOOK_________________________________\\
        Review academicBookReview = new Review("Saleh", "very bad book doesnt give any real world example and statics", 0);
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

        //____________________________ MUSIC _________________________________\\
        Music m1 = new Music("the places", "Mohammed Abdu", "1233214566547", 10);
        Music m2 = new Music("the time of Silence", "Talal Madah", "1233214566547", 10);
        Music m3 = new Music("oh the one who look for the easy", "Mohammed Abdu", "1233214566547", 10);
        Music m4 = new Music("i didnt wish you", "Mohammed Abdu", "1233214566547", 10);
        Music m5 = new Music("someone Like You", "Adele", "1233214566547", 10);

        //____________________________ MOVIE _________________________________\\
        Review movieReview= new Review("khalid", "this Auteur is amazing", 10);
        Movie mo1 = new Movie();
        Movie mo2 = new Movie();
        Movie mo3 = new Movie();
        Movie mo4 = new Movie("OP","Ammar","1233214566547",75.5,190);
        Movie mo5 = new Movie("HunterxHunter", "Mohammed", "1233214566547",75.5,120);
        mo1.setDuration(150);
        mo1.setAuteur("Ammar");
        mo1.setTitle("GOT");
        mo2.setTitle("GOT2");
        mo2.setAuteur("Khalid");
        mo3.setAuteur("Ammar");
        mo3.setTitle("OP");

        //____________________________BOOK_________________________________\\
        Review bookReview = new Review("Ammar","GOAT",50000);
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book("Lord of the ring","Saleh","1233214566547",75.5,100, new ArrayList<Review>());
        Book b5 = new Book("One Piece","Oda","1233214566547",75.5,100, new ArrayList<Review>());
        b1.setAuteur("Ammar");
        b1.setPrice(205.6);
        b1.setTitle("OCA SE 24");
        b1.setISNB("s1297518jk1");
        b2.setTitle("OCA SE 8");
        b2.setAuteur("Ammar");
        b3.setAuteur("Saleh");
        b3.setTitle("OCA SE 8");
        b5.addReview(bookReview);

        storage.add(b1);
        storage.add(b2);
        storage.add(b3);
        storage.add(b4);
        storage.add(b5);

        storage.add(m1);
        storage.add(m2);
        storage.add(m3);
        storage.add(m4);
        storage.add(m5);

        storage.add(mo1);
        storage.add(mo2);
        storage.add(mo3);
        storage.add(mo4);
        storage.add(mo5);

        storage.add(ab1);
        storage.add(ab2);
        storage.add(ab3);
        storage.add(ab4);
        storage.add(ab5);

        storage.add(n1);
        storage.add(n2);
        storage.add(n3);
        storage.add(n4);
        storage.add(n5);

        return storage;
    }

    public static AcademicBook DBForAcademicBooks(){
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
        int i = 1;
        for (AcademicBook a : listOfAcademicBooks ){
            System.out.println(i+". "+a.getTitle());
            i++;
        }
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            return ab1;
        } else if (choice == 2) {
            return ab2;
        } else if (choice == 3) {
            return ab3;
        } else if (choice == 4) {
            return ab4;
        } else if (choice == 5) {
            return ab5;
        }else {
            return new AcademicBook();
        }

    }
    public static Novel DBForNovels(){
        //____________________________ NOVEL _________________________________\\
        Review novelReview= new Review("Saleh", "this is actually not a bad novel", 3);
        ArrayList<Novel> listOfNovels = new ArrayList<>();
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
        listOfNovels.add(n1);
        listOfNovels.add(n2);
        listOfNovels.add(n3);
        listOfNovels.add(n4);
        listOfNovels.add(n5);
        int i = 1;
        for (Novel n : listOfNovels){
            System.out.println(i+". "+n.getTitle());
            i++;
        }
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            return n1;
        } else if (choice == 2) {
            return n2;
        } else if (choice == 3) {
            return n3;
        } else if (choice == 4) {
            return n4;
        }else if (choice == 5) {
            return n5;
        }else {
            return new Novel();
        }
    }

    public static Music DBForMusic(){
        //____________________________ MUSIC _________________________________\\
        ArrayList<Music> ListOfMusic = new ArrayList<>();
        Music m1 = new Music("the places", "Mohammed Abdu", "1233214566547", 10);
        Music m2 = new Music("the time of Silence", "Talal Madah", "1233214566547", 10);
        Music m3 = new Music("oh the one who look for the easy", "Mohammed Abdu", "1233214566547", 10);
        Music m4 = new Music("i didnt wish you", "Mohammed Abdu", "1233214566547", 10);
        Music m5 = new Music("someone Like You", "Adele", "1233214566547", 10);
        ListOfMusic.add(m1);
        ListOfMusic.add(m2);
        ListOfMusic.add(m3);
        ListOfMusic.add(m4);
        ListOfMusic.add(m5);
        int i = 1;
        for(Music m : ListOfMusic){
            System.out.println(i+". "+m.getTitle());
            i++;
        }
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1){
            return m1;
        }else if (choice == 2){
            return m2;
        }else if (choice == 3){
            return m3;
        } else if (choice == 4) {
            return m4;
        } else if (choice == 5) {
            return m5;
        }else{
            return new Music();
        }

    }
    public static Movie DBForMovies(){
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
        int i = 1;
        for(Movie m : ListOfMovies){
            System.out.println(i+" "+m.getTitle());
            i++;
        }
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1){
            return m1;
        } else if (choice == 2) {
            return m2;
        } else if (choice == 3) {
            return m3;
        } else if (choice == 4) {
            return m4;
        } else if (choice == 5) {
            return m5;
        }else {
            return new Movie();
        }
    }
    public static Book DBForBooks(){

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
        int i = 1;
        for (Book b : ListOfBooks){
            System.out.println(i+". "+b.getTitle());
            i++;
        }
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        if (choice == 1){
            return b1;
        } else if (choice == 2) {
            return b2;
        } else if (choice == 3) {
            return b3;
        } else if (choice == 4) {
            return b4;
        } else if (choice == 5) {
            return b5;
        }else {
            return new Book();
        }
    }
    public static void main(String[] args) {

        User user = new User(new ArrayList<Media>(),new ArrayList<Media>());
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to my interactive online Store");
        System.out.print("please enter your username: ");
        user.setUsername(sc.nextLine());
        System.out.print("please enter your email: ");
        user.setEmail(sc.nextLine());


        boolean working = true;
        int i;
        while (working){

            int choice = menu();

            if (choice == 1){
                int media = mediaType();
                if (media == 1){
                    Book book = DBForBooks();
                    user.addToCart(book);
                }else if (media == 2){
                    Novel novel = DBForNovels();
                    user.addToCart(novel);
                } else if (media == 3) {
                    AcademicBook ab = DBForAcademicBooks();
                    user.addToCart(ab);
                } else if (media == 4) {
                    Movie m = DBForMovies();
                    user.addToCart(m);
                } else if (media == 5) {
                    Music m = DBForMusic();
                    user.addToCart(m);
                }
            } else if (choice == 2) {
                int deleted ;
                i = 1;
                for (Media m : user.getShoppingCart()){
                    System.out.println(i+". "+m.getTitle());
                    i++;
                }
                deleted = sc.nextInt();
                user.removeFromCart(user.getShoppingCart().get(deleted - 1));
            } else if (choice == 3) {
                System.out.println(user.getShoppingCart());
            } else if (choice == 4) {
                user.checkOut();
            } else if (choice == 5){
                for (Media m : user.getShoppingCart()){
                    System.out.println(m.recommendSimilarMedia(DBForMedia())+"\n");
                }
            }else {
                working = false;
            }



        }

    }

    public static int mediaType(){
        System.out.println("1. for books \n 2. for novels \n 3. for academicBooks \n 4. for Movies \n 5. for Music");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add to cart");
        System.out.println("2. Remove from cart");
        System.out.println("3. Display cart");
        System.out.println("4. checkOut cart");
        System.out.println("5. recommendation based on items in cart");
        System.out.println("6. Exit");
        int choice = sc.nextInt();
        return choice;
    }
}
