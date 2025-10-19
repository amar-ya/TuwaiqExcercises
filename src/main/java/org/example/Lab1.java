package org.example;

import java.util.Random;
import java.util.Scanner;

public class Lab1
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //Q-1 write a program that add, subtracts, multiplay , and divide 2 input numbers

//        System.out.print("please give value to X: ");
//        int x = sc.nextInt();
//        System.out.print("please give value to Y: ");
//        int y = sc.nextInt();
//        int sum = x + y, sub = x - y, mul = x * y, div = x / y;
//        System.out.println(x + " + " + y + " = " + sum);
//        System.out.println(x + " - " + y + " = " + sub);
//        System.out.println(x + " * " + y + " = " + mul);
//        System.out.println(x + " / " + y + " = " + div);
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-2 write a program that print the multiplication table up to 10 for given number
//
//        System.out.print("which number you want to see its multiplication table?: ");
//        int num = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + " * " + i + " = " + num * i);
//        }
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//        //Q-3 write a program the print the area and perimeter of a circle
//
//        System.out.print("please give a radius for the circle: ");
//        double r = sc.nextDouble();
//        double pi = 3.14159;
//        double area = pi * (r * r);
//        double perimeter = 2 * pi * r;
//        System.out.println("the area of a circle with radius = " + r + " is = " + area);
//        System.out.println("the perimeter of a circle with radius = " + r + " is = " + perimeter);
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-4 java program to find the avg of set of integers
//
//
//        System.out.println("please tell me how many numbers you want to enclude in this set");
//        int nOfSet = sc.nextInt(), total = 0, count = 0;
//        for (int i = 1; i <= nOfSet; i++) {
//            if (i == 1) {
//                System.out.print("please give me the 1st value: ");
//                total += sc.nextInt();
//                count++;
//            } else if (i == 2) {
//                System.out.print("please give me the 2nd value: ");
//                total += sc.nextInt();
//                count++;
//            } else if (i == 3) {
//                System.out.print("please give me the 3rd value: ");
//                total += sc.nextInt();
//                count++;
//            } else {
//                System.out.print("please give me the " + i + "th value: ");
//                total += sc.nextInt();
//                count++;
//            }
//        }
//        float avg = (float) total / count;
//        System.out.println("the average of the set of numbers is: " + avg);
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-5 java program that takes 3 inputs and add 1st and 2nd and then compair them to the 3rd
//        //return true if they are same and false if not
//
//        System.out.print("please give value to X: ");
//        int x5 = sc.nextInt();
//        System.out.print("please give value to Y: ");
//        int y5 = sc.nextInt();
//        System.out.print("please give value to Z: ");
//        int z5 = sc.nextInt();
//        int sum5 = x5 + y5;
//        if (sum5 == z5) {
//            System.out.println("the result is :true");
//        } else {
//            System.out.println("the result is :false");
//        }
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-6 JAVA program that reverse a String
//
//
//        System.out.print("input a word: ");
//        String word = sc.nextLine();
//        String reverse = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reverse += word.charAt(i);
//        }
//        System.out.println(reverse);
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-7 java program that checks if num is even or odd
//
//        System.out.print("please give number to check if even or odd: ");
//        int x7 = sc.nextInt();
//        if (x7 % 2 == 0) {
//            System.out.println(x7 + " is even number");
//        } else {
//            System.out.println(x7 + " is odd number");
//        }
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-8 java program that convert temp from C to F
//
//        System.out.print("what is the temperature in celsius right now: ");
//        double c = sc.nextInt();
//        double f = (c * 9 / 5) + 32;
//        System.out.println(c + " degree celsius is equal to " + f + " degree fahrenheit");
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-9 java program that takes String and int from user and print the character at the given index
//
//        System.out.print("please input a sentence: ");
//        String sentence = sc.nextLine();
//        System.out.print("please input a number: ");
//        int index = sc.nextInt();
//
//        if (index > sentence.length() || index < 0) {
//            System.out.println("error there is no character in this index");
//        } else {
//            System.out.println("the character number " + index + " in the sentence is: " + sentence.charAt(index - 1));
//        }
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-10 java that calculate perimeter in rectangle
//
//        System.out.print("please input the height: ");
//        double height = sc.nextDouble();
//        System.out.println("please input the width");
//        double width = sc.nextDouble();
//        double area10 = height * width;
//        double p10 = 2 * (height + width);
//        System.out.println("the area of the rectangle is= " + area10);
//        System.out.println("the perimeter of the rectangle is= " + p10);
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-11 java program that compair 2 numbers
//
//        System.out.print("please input X: ");
//        int x11 = sc.nextInt();
//        System.out.print("please input Y: ");
//        int y11 = sc.nextInt();
//        if (x11 != y11) System.out.println(x11 + " != " + y11);
//        if (x11 == y11) System.out.println(x11 + " = " + y11);
//        if (x11 > y11) System.out.println(x11 + " > " + y11);
//        if (x11 >= y11) System.out.println(x11 + " >= " + y11);
//        if (x11 < y11) System.out.println(x11 + " < " + y11);
//        if (x11 <= y11) System.out.println(x11 + " <= " + y11);
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-12 java program that converts hours to mins and mins to seconds
//
//        System.out.print("please input seconds: ");
//        int seconds = sc.nextInt();
//        int minutes = 0, hours = seconds / 60 / 60;
//        for (int i = seconds; i > 0; i--) {
//            if (i >= 60) {
//                minutes += 1;
//                seconds--;
//            }
//        }
//        for (int i = minutes; i > 0; i--) {
//            if (minutes >= 60) {
//                minutes--;
//            }
//        }
//        System.out.println(hours + ":" + minutes + ":" + seconds);
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-13 java program that takes 4 inputs int and print equals if all equals and not if not
//
//        System.out.print("please input X: ");
//        int x13 = sc.nextInt();
//        System.out.print("please input Y: ");
//        int y13 = sc.nextInt();
//        System.out.print("please input Z: ");
//        int z13 = sc.nextInt();
//        System.out.print("please input C: ");
//        int c13 = sc.nextInt();
//        if (x13 == y13 && z13 == y13 && c13 == z13) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-14 java program that reads and tells if number negative positive or 0
//
//        int x14 = sc.nextInt();
//        if (x14 > 0) {
//            System.out.println("positive number");
//        } else if (x14 < 0) {
//            System.out.println("negative number");
//        } else {
//            System.out.println("zero");
//        }
//
//
//        //_______________________________________________________________________________________________________________________________________________\\
//
//
//        //Q-15
//
//        int x15 = 0;
//        for (; ; ) {
//            System.out.print("enter a number or -1 to stop: ");
//            x15 = sc.nextInt();
//            if (x15 == -1) {
//                System.out.println("program stopped!");
//                break;
//            }
//            if (x15 < 0) {
//                System.out.println(x15 + " negative");
//            } else if (x15 > 0) {
//                System.out.println(x15 + " positive");
//            } else {
//                System.out.println(x15 + " zero");
//            }
//
//
//            //_______________________________________________________________________________________________________________________________________________\\
//
//
//            //Q-16 java code that take an input and reverse its value
//
//            System.out.print("please enter an integer to reverse it: ");
//            int x = sc.nextInt();
//            int sign = 1;
//            long y = x;
//            if (y < 0) {
//                sign = -1;
//                y = -y;
//            }
//            int z = 0;
//            while (y > 0) {
//                int d = (int) (y % 10);
//                z = z * 10 + d;
//                y = y / 10;
//            }
//            System.out.println(sign * z);
//
//
//            //_______________________________________________________________________________________________________________________________________________\\
//
//
//            //Q-17 java program that takes inputs from user and tells which is biggest and smallest
//            int x17 = 0, biggest = 0, smallest = 0;
//            System.out.print("please give a number: ");
//            x17 = sc.nextInt();
//            String ans17 = "";
//            biggest = x17;
//            smallest = x17;
//            for (; ; ) {
//                if (x17 > biggest) {
//                    biggest = x17;
//                } else if (x17 < smallest) {
//                    smallest = x17;
//                }
//                System.out.print("do you want to add another number(yes or no): ");
//                ans17 = sc.nextLine().toLowerCase();
//                if (ans17.equals("yes")) {
//                    System.out.print("please give another number: ");
//                    x17 = sc.nextInt();
//                } else if (ans17.equals("no")) {
//                    break;
//                }
//
//            }
//            System.out.println("The biggest number is " + biggest);
//            System.out.println("The smallest number is " + smallest);
//
//
//            //_______________________________________________________________________________________________________________________________________________\\
//
//
//            //Q-18 java code that count the latter a come in the input
//
//            System.out.print("please write a sentence or a word: ");
//            String sentence18 = sc.nextLine().toLowerCase();
//            int count18 = 0;
//            for (int i = 0; i < sentence.length(); i++) {
//                if (sentence.charAt(i) == 'a') {
//                    count++;
//                }
//            }
//            System.out.println("the latter a has come " + count + " times in this sentences");
        }


    }
    }








