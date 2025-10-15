package org.example;

import java.util.Scanner;

public class TuwaiqExcerciseDay4
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        //Q-1 write a program that prints the numbers from 1 to 100 such that:
        //if the number is multiply of 3 then print "Fizz"
        //if the number is multiply of 5 then print "Buzz"
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0) {
                System.out.println("Buzz");
            }else
            {
                System.out.println(i);
            }
        }

        //Q-2 write a program that reverse a String


    }
}
