package org.example.Lab4;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome \n1. calculator\n2. guessing the calculation game");
        String choice = sc.nextLine();

        switch (choice){
            case "1" : {
                calculator();
                break;
            }
            case "2": {
                game();
                break;
            }
            default:
                System.out.println("goodBye!");

        }



    }

    private static void game()
    {
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        while (!done){
            System.out.println("please pick a shape to calculate\n1. Circle\n2. Rectangle\n3. Triangle\n4. Exit");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.print("please enter the radius of the circle = ");
                double rad = sc.nextDouble();
                System.out.println("what do you want to calculate\n1. area\n2. Circumference");
                int c = sc.nextInt();
                Circle circle = new Circle(rad);
                double x = (int)circle.calculateArea();
                double y = (int)circle.calculateCircumference();
                if (c == 1){
                    System.out.print("guess the area of the circle");
                    double guess = sc.nextDouble();
                    if (guess == x){
                        System.out.println("perfect 10 out of 10");
                    } else if (guess == y) {
                        System.out.println("no that was the Circumference");
                    } else  {
                        System.out.println("thats a wrong answer");
                    }
                } else if (c == 2) {
                    System.out.print("guess the Circumference of the circle: ");
                    double guess = sc.nextDouble();
                    if (guess == y){
                        System.out.println("perfect 10 out of 10");
                    } else if (guess == x) {
                        System.out.println("no that was the Area");
                    }else{
                        System.out.println("thats a wrong answer");
                    }
                }
            } else if (choice == 2) {
                System.out.print("please enter the height of the Rectangle = ");
                double h = sc.nextDouble();
                System.out.print("please enter the width of the Rectangle = ");
                double w = sc.nextDouble();
                System.out.println("what do you want to guess\n1. area\n2. Circumference");
                int c = sc.nextInt();
                Rectangle rectangle = new Rectangle(h, w);
                double x = (int)rectangle.calculateArea(), y = (int)rectangle.calculateCircumference();
                if(c == 1){
                    System.out.print("guess the area of the rectangle: ");
                    double guess = sc.nextDouble();
                    if (guess == x){
                        System.out.println("perfect 10 out of 10");
                    }else if(guess == y){
                        System.out.println("no that was the Circumference");
                    }else {
                        System.out.println("thats a wrong answer");
                    }
                } else if (c == 2) {
                    System.out.print("guess the Circumference of the rectangle: ");
                    double guess = sc.nextDouble();
                    if (guess == y){
                        System.out.println("perfect 10 out of 10");
                    }else if(guess == x){
                        System.out.println("no that was the Area");
                    }else {
                        System.out.println("thats a wrong answer");
                    }
                }
            } else if (choice == 3) {
                System.out.print("please enter the height of the Triangle = ");
                double h = sc.nextDouble();
                System.out.print("please enter the base of the Triangle = ");
                double w = sc.nextDouble();
                System.out.println("what do you want to calculate\n1. area\n2. Circumference");
                int c = sc.nextInt();
                Triangle triangle = new Triangle(h, w);
                double x = (int)triangle.calculateArea(), y = (int)triangle.calculateCircumference();
                if (c == 1){
                    System.out.print("guess the area of the triangle: ");
                    double guess = sc.nextDouble();
                    if (guess == x){
                        System.out.println("perfect 10 out of 10");
                    } else if (guess == y) {
                        System.out.println("no that was the Circumference");
                    }else {
                        System.out.println("thats a wrong answer");
                    }
                } else if (c == 2) {
                    System.out.print("guess the Circumference of the triangle: ");
                    double guess = sc.nextDouble();
                    if (guess == y){
                        System.out.println("perfect 10 out of 10");
                    } else if (guess == x) {
                        System.out.println("no that was the Area");
                    }else {
                        System.out.println("thats a wrong answer");
                    }
                }
            }else{
                done = true;
            }
        }
    }

    public static void calculator(){
        Scanner sc = new Scanner(System.in);
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
