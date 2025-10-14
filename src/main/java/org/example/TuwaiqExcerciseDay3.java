package org.example;

import java.util.Random;
import java.util.Scanner;

public class TuwaiqExcerciseDay3 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        //Q-1 write a program that checks the role of the user
        System.out.print("please enter your role: ");
        String role = sc.nextLine().toLowerCase();

        if(role.equals("admin"))
        {
            System.out.println("welcome admin");
        }else if(role.equals("superuser")){
            System.out.println("welcome super User");
        } else if (role.equals("user"))
        {
            System.out.println("welcome user");
        }

        //Q-2 take 3 numbers from user and print the greatest number

        System.out.print("please enter value for x: ");
        int x = sc.nextInt();
        System.out.print("please enter value for y: ");
        int y = sc.nextInt();
        System.out.print("please enter value for z: ");
        int z = sc.nextInt();

        if(x > y && x > z){
            System.out.println("x = "+x + " so it is the greatest number");
        }else if ( y > z){
            System.out.println("y = "+y + " so it is the greatest number");
        }else {
            System.out.println("z = "+ z + " so it is the greatest number");
        }

        //Q-3 write a java program that generates an int between 1-7 and display the name of the week
        Random random = new Random();
        int day = random.nextInt(7);

        switch (day){
            case 0:
                System.out.println("the random generated 1 so it is sunday");
                break;
            case 1:
                System.out.println("the random generated 2 so it is monday");
                break;
            case 2:
                System.out.println("the random generated 3 so it is tuesday");
                break;
            case 3:
                System.out.println("the random generated 4 so it is wednesday");
                break;
            case 4:
                System.out.println("the random generated 5 so it is thursday");
                break;
            case 5:
                System.out.println("the random generated 6 so it is Friday");
                break;
            case 6:
                System.out.println("the random generated 7 so it is Saturday ");
                break;
        }

        //Q-4 write a java program that takes a number as input and print the corresponding latter for the score of the student
        System.out.print("please enter your grade to find you score: ");
        int grade = sc.nextInt();
        if ( grade >= 90){
            System.out.println("your grade is "+ grade + " and your score is : A");
        }else if (grade >= 80 ){
            System.out.println("your grade is "+ grade + " and your score is : B");
        }else if (grade >= 70){
            System.out.println("your grade is "+ grade + " and your score is : C");
        }else if(grade >= 60 ){
            System.out.println("your grade is "+ grade + " and your score is : D");
        }else {
            System.out.println("your grade is "+ grade + " and your score is : F");
        }

        //Q-5 write a program that take the user`s age and catagorize the user based on the age
        System.out.print("enter your age please: ");
        int age = sc.nextInt();
        if (age >= 20){
            System.out.println("you are an adult");
        }else if(age >= 13){
            System.out.println("you are a teenager");
        }else {
            System.out.println("you are a child");
        }

    }
}
