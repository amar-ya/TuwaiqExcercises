package org.example.TuwaiqExerciseWeek3Day2;

public class main
{
    public static void main(String[] args) {
        //_______________________________Q-1_________________________________\\
        Shape s1 = new Shape();
        Shape s2 = new Shape();
        Shape s3 = new Shape();
        s2.setColor("Blue");
        s2.setFilled(true);
        s3.setColor("Silver");
        s3.setFilled(false);
        s1.setColor("Green");
        s1.setFilled(true);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println();
        //_______________________________Q-2___________________________________\\

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        c2.setRadius(1.2);
        c2.setColor("Orange");
        c2.setFilled(false);
        c1.setColor("Blue");
        c1.setFilled(false);
        c3.setColor("Yellow");
        c3.setFilled(true);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println();
        //_______________________________Q-3___________________________________\\
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,3);
        Rectangle r3 = new Rectangle(4,5);
        r1.setColor("violate");
        r1.setFilled(true);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println();
        //_______________________________Q-4___________________________________\\
        Square sq1 = new Square();
        Square sq2 = new Square(2);
        Square sq3 = new Square(3,"Golden",false);
        sq1.setSide(2);
        sq1.setColor("Red");
        sq1.setFilled(true);
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq3);


    }
}
