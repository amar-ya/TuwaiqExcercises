package org.example.TuwaiqExerciseWeek3Day2;

public class main
{
    public static void main(String[] args) {
        //_______________________________Q-1_________________________________\\
        Shape s1 = new Shape();
        s1.setColor("Green");
        s1.setFilled(true);
        System.out.println(s1);

        System.out.println();
        //_______________________________Q-2___________________________________\\

        Circle c1 = new Circle();
        c1.setColor("Blue");
        c1.setFilled(false);
        System.out.println(c1);

        System.out.println();
        //_______________________________Q-3___________________________________\\
        Rectangle r1 = new Rectangle();
        r1.setColor("violate");
        r1.setFilled(true);
        System.out.println(r1);

        System.out.println();
        //_______________________________Q-4___________________________________\\
        Square s2 = new Square();
        s2.setSide(2);
        s2.setColor("Red");
        s2.setFilled(true);
        System.out.println(s2);


    }
}
