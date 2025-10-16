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


        //_______________________________________________________________________________\\


        //Q-2 write a program that reverse a String

        System.out.print("Please enter a word for the program ro reverse it: ");
        String word = sc.nextLine();
        String reversedWord = "";
        for ( int i = word.length() - 1 ; i >= 0 ; i-- )
        {
            reversedWord += word.charAt(i);
        }
        System.out.println("Reversed: " + reversedWord + "\n Original: " + word);


        //_______________________________________________________________________________\\


        //Q-3 write a program that give the factorial of a value that were given by the user

        System.out.print("please enter a number to calculate its factorial");
        int originalNumber = sc.nextInt();
        int factorial = originalNumber;
        for( int i = 1; i <= originalNumber - 1; i++ ){

            factorial = factorial * (originalNumber - i);
        }
        System.out.println("the factorial of " + originalNumber + " is = " + factorial);


        //_______________________________________________________________________________\\


        //Q-4 write a program to calculate the first number to the power of the second number
        // to of them are inputs from user

        System.out.print("Enter a number to use it in calculation: ");
        int OGNumber = sc.nextInt();
        int x = OGNumber;
        System.out.print("enter a number to use it as power for the 1st number: ");
        int y = sc.nextInt();
            for (int i = y -1 ; i > 0 ; i--){
                x = OGNumber * x;
            }
        System.out.println("The result is " + x);


        //_______________________________________________________________________________\\


        //Q-5 write a program that reads a set of integers and then print the sum
        // of even and odd numbers

        System.out.print("please tell me how many numbers you want to enter");
        int count = sc.nextInt();
        int placeholder = 0;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1 ; i < count + 1 ; i++){
            if( i == 1){
                System.out.print("please enter the 1st number: ");
                sumOdd += sc.nextInt();
            }else if( i == 2)
            {
                System.out.print("please enter the 2nd number: ");
                sumEven += sc.nextInt();
            }else {
                System.out.print("please enter the "+ (i) +"rd number: ");
                placeholder = sc.nextInt();
                if(placeholder % 2 == 0){
                    sumEven += placeholder;
                }else  {
                    sumOdd += placeholder;
                }
            }
        }
        System.out.println("Sum of even numbers is: " + sumEven);
        System.out.println("Sum of odd numbers is: " + sumOdd);


        //_______________________________________________________________________________\\


        //Q-6 write a program that propmts the user to input a positive integer
        //then tells if it's a prime number or not

        System.out.print("Please give a positive number to see if its prime or not: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("not Prime");
        }
        else if (n == 2) {
            System.out.println("Prime");
        }
        else if (n % 2 == 0) {
            System.out.println("Not Prime");
        }else
        {
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                System.out.println("Not Prime");
            }
        }
        System.out.println("Prime");
        }


        //_______________________________________________________________________________\\


        //Q-7 use for loop to print 4 weeks and loop inside it to print 7 day for each week

        for (int i = 1 ; i <= 4; i++){
            System.out.println("Week "+i);
            for (int j = 1 ; j <= 7; j++){
                System.out.println("Day "+j);
            }
        }


        //_______________________________________________________________________________\\


        //Q-8 write a program the read and tells us if a text is palindrome or not

        System.out.print("Please enter a word for the program ro reverse it: ");
        String word2 = sc.nextLine();
        String reversedWord2 = "";
        for ( int i = word2.length() - 1 ; i >= 0 ; i-- )
        {
            reversedWord2 += word2.charAt(i);
        }
        System.out.println("the text after reversing the order is: "+reversedWord2);
        if  ( reversedWord2.equalsIgnoreCase(word2) )
        {
            System.out.println("so it is palindrome");
        }else {
            System.out.println("so it is not palindrome");
        }
    }
}


