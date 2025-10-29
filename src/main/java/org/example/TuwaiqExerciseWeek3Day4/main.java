package org.example.TuwaiqExerciseWeek3Day4;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Book book = new Book("", 125.3, "i am the author");
        Movie movie = new Movie("", 125.3, "i am the author");
        Scanner sc = new Scanner(System.in);
        System.out.println("hello to the store please choose a pick: \n1. movie \n2. book");
        int pick = sc.nextInt();
        sc.nextLine();
        if (pick == 1){
            System.out.print("what movie do you want to buy? : ");
            String name = sc.nextLine();
            movie.setName(name);
            System.out.println(movie);
            System.out.println("price is fixed *if you want to insist on getting discount say yes*");
            String ans = sc.nextLine();
            if (ans.equals("yes") || ans.equals("y")){
                System.out.println("price after discount is "+movie.getDiscount());
            }
        } else if (pick == 2) {
            System.out.print("what Book do you want to buy? : ");
            String name = sc.nextLine();
            book.setName(name);
            System.out.println(book);
            System.out.println("price is fixed *if you want to insist on getting discount say yes*");
            String ans = sc.nextLine();
            if (ans.equals("yes") || ans.equals("y")){
                System.out.println("price after discount is "+book.getDiscount());
            }
        }
        System.out.println("thank you for shopping with us");


        System.out.println("welcome to the moving game");
        int x , y, xs , ys;
        System.out.print("please enter an initial position for x: ");
        x = sc.nextInt();
        System.out.print("please enter an initial position for y: ");
        y = sc.nextInt();
        System.out.print("please enter an moving speed for x: ");
        xs = sc.nextInt();
        System.out.print("please enter an moving speed for y: ");
        ys = sc.nextInt();
        MovablePoint p = new MovablePoint(x,y,xs,ys);
        boolean playing = true;
        while (playing){
            System.out.println("where do you want to move \n1. vertical \n2. horizontal \n3. exit game");
            int move = sc.nextInt();
            if (move == 1){
                System.out.println("1. move up \n2. move down");
                int side = sc.nextInt();
                if (side == 1){
                    p.moveUp();
                } else if (side == 2) {
                    p.moveDown();
                }
            } else if (move == 2) {
                System.out.println("1. move right \n2. move left");
                int side = sc.nextInt();
                if (side == 1){
                    p.moveRight();
                } else if (side == 2) {
                    p.moveLeft();
                }
            }else {
                playing = false;
            }
        }
        System.out.println(p);

    }
}
