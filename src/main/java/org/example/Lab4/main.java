package org.example.Lab4;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the shape calculator");
        boolean done = false;
        while (!done){
            System.out.println("please pick a shape to calculate\n1. Circle\n2. Rectangle\n3. Triangle\n4. Exit");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.print("please enter the radius of the circle = ");
                double rad = sc.nextDouble();
                System.out.println("what do you want to calculate\n1. area\n2. Circumference\n3. Both");
                int c = sc.nextInt();
                try{
                    System.out.println(calculatCircle(rad,c));
                }catch (IllegalArgumentException e){
                    System.out.println("radius must not be a negative value");
                }
            } else if (choice == 2) {
                System.out.print("please enter the height of the Rectangle = ");
                double h = sc.nextDouble();
                System.out.print("please enter the width of the Rectangle = ");
                double w = sc.nextDouble();
                System.out.println("what do you want to calculate\n1. area\n2. Circumference\n3. Both");
                int c = sc.nextInt();
                try{
                    System.out.println(calculateRectangle(h,w,c));
                }catch (IllegalArgumentException e){
                    System.out.println("the values of height and width shouldnt be negative numbers");
                }
            } else if (choice == 3) {
                System.out.print("please enter the height of the Triangle = ");
                double h = sc.nextDouble();
                System.out.print("please enter the base of the Triangle = ");
                double w = sc.nextDouble();
                System.out.println("what do you want to calculate\n1. area\n2. Circumference\n3. Both");
                int c = sc.nextInt();
                try{
                    System.out.println(calculateTriangle(h,w,c));
                }catch (IllegalArgumentException e){
                    System.out.println("the values of height and base shouldnt be negative numbers");
                }
            }else{
                done = true;
            }
        }


    }

    public static String calculateRectangle(double h, double w, int choice){
        if (h<0||w<0){
            throw new IllegalArgumentException();
        }
        Rectangle r = new Rectangle();
        r.setHeight(h);
        r.setWidth(w);
        if (choice == 1){
            return "the area of that rectangle is "+String.format("%.2f",r.calculateArea())+" cm²";
        }else if (choice == 2){
            return "the Circumference of that rectangle is "+String.format("%.2",r.calculateCircumference())+" cm";
        }else if(choice == 3){
            return r.toString();
        }else {
            return "invalid choice";
        }
    }

    public static String calculateTriangle(double h, double b, int choice){
        if(h<0||b<0){
            throw new IllegalArgumentException();
        }
        Triangle t = new Triangle();
        t.setBase(b);
        t.setHeight(h);
        if (choice == 1){
            return "the area of that Triangle is "+String.format("%.2f",t.calculateArea())+" cm";
        }else if (choice == 2){
            return "the Circumference of that Triangle is "+String.format("%.2f",t.calculateCircumference())+" cm";
        }else if(choice == 3){
            return t.toString();
        }else {
            return "invalid choice";
        }
    }

    public static String calculatCircle(double rad,int choice){
        if(rad < 0 ){
            throw new IllegalArgumentException();
        }
        Circle r = new Circle();
        r.setRadius(rad);
        if (choice == 1){
            return "the area of that circle is "+String.format("%.2f",r.calculateArea())+" cm";
        }else if (choice == 2){
            return "the Circumference of that circle is "+String.format("%.2f",r.calculateCircumference())+" cm";
        }else if(choice == 3){
            return r.toString();
        }else {
            return "invalid choice";
        }
    }
}
