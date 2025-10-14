package org.example;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TuwaiqExcerciseDay2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Q-1 develop a program that takes the weight (in kilograms) and height (in meters)
        // as input and calculates the BMI, then prints it.

        // Answer-1

        System.out.print("please enter the weight: ");
        double weight = input.nextDouble();
        System.out.print("please enter the height: ");
        double height =  input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("BMI is : " + BMI );

        //Q-2 write a program that takes the obtained marks and total marks as input and calculates the precentage, then prints it
        //A-2
        System.out.print("please enter your marks: ");
        int marks = input.nextInt();
        System.out.print("please enter the total: ");
        int total = input.nextInt();
        int percentage = (marks*100)/total;
        System.out.println("percentage is : " + percentage);



        //Q-3 Create a program that takes an amount in one currency and an exchange rate as input
        // then converts and prints the amount in other currency

        //A-3
        System.out.print("please enter the amount in first currency : ");
        double currency =  input.nextDouble();
        System.out.print("please enter the exchange rate to the other currency : ");
        double exchangeRate = input.nextDouble();
        double afterExchange =  exchangeRate * currency;
        System.out.println("The exchange rate is: " + afterExchange);



        //Q-4 create a program that takes a string as input, calculates its length, and then reverses the string
        // using the StringBuilder class, finally print both the length and reversed string

        //A-4
        System.out.print("please enter a word: ");
        String word = input.nextLine();
        String reverse = new StringBuilder(word).reverse().toString();
        int length = word.length();
        System.out.println("the word in reverse is: " + reverse + " and its length is: " + length);



        //Q-5 develop a program that takes a sentence as input and extracts a substring from it
        // then prints the extracted substring

        //A-5
        System.out.print("please enter a sentence: ");
        String sentence = input.nextLine();
        System.out.println("Sentence length = " + sentence.length());
        System.out.print("Enter start index (0-"+sentence.length()+"): ");
        int start = input.nextInt();
        System.out.print("Enter end index ("+start+" - "+sentence.length()+"): ");
        int end = input.nextInt();
        String extracted = sentence.substring(start, end);
        System.out.println("Extracted substring: \"" + extracted + "\"");



        //Q-6 write a program that takes a sentence and keywords as input then check if the keyword is present
        // in the sentence and prints the result

        //A-6
        System.out.print("Please enter sentence : ");
        String sentence2 = input.nextLine();
        System.out.print("Please enter keyword : ");
        String keyword = input.nextLine();
        if (sentence2.contains(keyword))
        {
            System.out.println(keyword + " is present in the sentence: " + sentence2);
        }else {
            System.out.println(keyword + " is not present in the sentence: " + sentence2);
        }



        //Q-7 Develop a program that takes a sentence and a word to replace as input, then replace all occurrences
        // of the word with another word and prints the modified sentence

        //A-7
        System.out.print("please enter a sentence: ");
        String sentence3 = input.nextLine();
        System.out.print("please enter a word: ");
        String word2 = input.nextLine();
        System.out.print("please enter a replacement word: ");
        String replacement = input.nextLine();
        String replaced = sentence3.replaceAll(word2, replacement);
        System.out.println(replaced);



        //Q-8 Write a program that takes two strings as input and check if they are equal, ignoring the case,
        // then prints whether they are equal or not

        //A-8
        System.out.print("please enter a first word: ");
        String first =  input.nextLine();
        System.out.print("please enter a second word: ");
        String second = input.nextLine();
        if (first.equalsIgnoreCase(second))
        {
            System.out.println(first + " and " + second + " are the same(ingoring case)");
        }
        else
        {
            System.out.println(first + " and " + second + " are not the same");
        }

    }


}