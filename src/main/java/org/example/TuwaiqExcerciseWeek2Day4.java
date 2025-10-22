package org.example;

import javax.management.relation.RelationTypeNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TuwaiqExcerciseWeek2Day4
{
    public static void main(String[] args)throws InputMismatchException, IllegalArgumentException, ArithmeticException {
        Scanner sc = new Scanner(System.in);

        //Please remove the code you want to test from the comment one by one just to avoid any variable naming conflict

        //Q-1

//        int x1 = 0;
//        int y1 = 0;
//        try{
//            System.out.print("please give value to X: ");
//            x1 = sc.nextInt();
//            System.out.print("please give value to Y: ");
//            y1 = sc.nextInt();
//            int sum = x1 + y1, sub = x1 - y1, mul = x1 * y1, div = x1 / y1;
//            System.out.println(x1 + " + " + y1 + " = " + sum);
//            System.out.println(x1 + " - " + y1 + " = " + sub);
//            System.out.println(x1 + " * " + y1 + " = " + mul);
//            System.out.println(x1 + " / " + y1 + " = " + div);
//        }catch (InputMismatchException e){
//            System.out.println("the value should be an integer");
//        }catch ( ArithmeticException a){
//            System.out.println("the value should not be zero");
//        }
//
//
//        //Q-2
//
//        System.out.print("which number you want to see its multiplication table?: ");
//        try{
//            int num = sc.nextInt();
//            if (num == 0){
//                throw new ArithmeticException();
//            }else {
//                for (int i = 1; i <= 10; i++) {
//                    System.out.println(num + " * " + i + " = " + num * i);
//                }
//            }
//
//        }catch (ArithmeticException a){
//            System.out.println("any number multiplied to Zero equals Zero");
//        }
//
//        //Q-3
//
//       try{
//           System.out.print("please give a radius for the circle: ");
//           double r = sc.nextDouble();
//           if (r == 0){
//               throw new ArithmeticException();
//           }else {
//               double pi = 3.14159;
//               double area = pi * (r * r);
//               double perimeter = 2 * pi * r;
//               System.out.println("the area of a circle with radius = " + r + " is = " + area);
//               System.out.println("the perimeter of a circle with radius = " + r + " is = " + perimeter);
//           }
//
//       }catch (ArithmeticException e){
//           System.out.println("how can it be a circle if its radius equals to zero?");
//       }
//
//        //Q-4
//
//        System.out.println("please tell me how many numbers you want to enclude in this set");
//        int nOfSet = sc.nextInt(), total = 0, count = 0;
//        for (int i = 1; i <= nOfSet; i++) {
//            try{
//                if (i == 1) {
//                    System.out.print("please give me the 1st value: ");
//                    total += sc.nextInt();
//                    count++;
//                } else if (i == 2) {
//                    System.out.print("please give me the 2nd value: ");
//                    total += sc.nextInt();
//                    count++;
//                } else if (i == 3) {
//                    System.out.print("please give me the 3rd value: ");
//                    total += sc.nextInt();
//                    count++;
//                } else {
//                    System.out.print("please give me the " + i + "th value: ");
//                    total += sc.nextInt();
//                    count++;
//                }
//            }catch ( InputMismatchException e){
//                System.out.println("the value should be an integer");
//            }
//        }
//        try{
//
//            if (count == 0){
//                throw new ArithmeticException();
//            }else {
//                float avg = (float) total / count;
//                System.out.println("the average of the set of numbers is: " + avg);
//            }
//
//        }catch (ArithmeticException e){
//            System.out.println("the size of the array cannot be Zero");
//        }
//
//
//        //Q-5
//
//        try{
//            System.out.print("please give value to X: ");
//            int x5 = sc.nextInt();
//            System.out.print("please give value to Y: ");
//            int y5 = sc.nextInt();
//            System.out.print("please give value to Z: ");
//            int z5 = sc.nextInt();
//            if ( z5 < x5 || z5 < y5){
//                throw new ArithmeticException();
//            }else {
//                int sum5 = x5 + y5;
//                if (sum5 == z5) {
//                    System.out.println("the result is :true");
//                } else {
//                    System.out.println("the result is :false");
//                }
//            }
//        }catch (ArithmeticException e){
//            System.out.println("how can Z be equal to X+Y if one of them bigger than him?");
//        }catch (InputMismatchException e){
//            System.out.println("the value should be an integer");
//        }
//
//        //Q-6
//
//        try{
//            System.out.print("input a word: ");
//            String word = sc.nextLine();
//            if (word.matches(".*[^A-za-z].*")){
//                throw new InputMismatchException();
//            }
//            String reverse = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reverse += word.charAt(i);
//            }
//            System.out.println(reverse);
//        }catch (InputMismatchException e){
//            System.out.println("the word should contain letters only");
//        }
//
//        //Q-7
//
//        System.out.print("please give number to check if even or odd: ");
//        try {
//            int x7 = sc.nextInt();
//        if (x7 == 0) {
//            throw new ArithmeticException();
//        } else if (x7 % 2 == 0) {
//            System.out.println(x7 + " is even number");
//        } else {
//            System.out.println(x7 + " is odd number");
//        }
//
//        }catch (InputMismatchException e){
//            System.out.println("the value should be an integer");
//        }catch (ArithmeticException e){
//            System.out.println("Zero is not odd nor even");
//        }
//
//        //Q-8
//
//        System.out.print("what is the temperature in celsius right now: ");
//        try{
//            double c = sc.nextInt();
//            double f = (c * 9 / 5) + 32;
//            System.out.println(c + " degree celsius is equal to " + f + " degree fahrenheit");
//        }catch (InputMismatchException  e){
//            System.out.println("temperature are represented in numbers");
//        }
//
//        //Q-9
//
//        try{
//            System.out.print("please input a sentence: ");
//            String sentence = sc.nextLine();
//            if(sentence.matches(".*[^A-za-z0-9].*")){
//                throw new InputMismatchException();
//            }
//            System.out.print("please input a number: ");
//            int index = sc.nextInt();
//            if(sentence.length() == 0){
//                throw new IllegalArgumentException();
//            } else if (index > sentence.length() || index < 0) {
//                throw new IllegalArgumentException();
//            }
//            else {
//                System.out.println("the character number " + index + " in the sentence is: " + sentence.charAt(index - 1));
//            }
//        }catch (InputMismatchException e){
//            System.out.println("wrong input");
//        }catch (IllegalArgumentException e) {
//            System.out.println("the sentence is too short or index is bigger than its length");
//        }
//
//        //Q-10
//
//        try{
//            perimeterInRectangle();
//        }catch (ArithmeticException e){
//            System.out.println("the height and width should be positive and not zero");
//        }
//
//        //Q-11
//
//        try{
//            System.out.print("please input X: ");
//            int x11 = sc.nextInt();
//            System.out.print("please input Y: ");
//            int y11 = sc.nextInt();
//            if (x11 != y11) System.out.println(x11 + " != " + y11);
//            if (x11 == y11) System.out.println(x11 + " = " + y11);
//            if (x11 > y11) System.out.println(x11 + " > " + y11);
//            if (x11 >= y11) System.out.println(x11 + " >= " + y11);
//            if (x11 < y11) System.out.println(x11 + " < " + y11);
//            if (x11 <= y11) System.out.println(x11 + " <= " + y11);
//
//        }catch (InputMismatchException e){
//            System.out.println("wrong input");
//        }
//
//        //Q-12
//
//
//        System.out.print("please input seconds: ");
//        try{
//            int seconds = sc.nextInt();
//            int minutes = 0, hours = seconds / 60 / 60;
//            for (int i = seconds; i > 0; i--) {
//                if (i >= 60) {
//                    minutes += 1;
//                    seconds--;
//                }
//            }
//            for (int i = minutes; i > 0; i--) {
//                if (minutes >= 60) {
//                    minutes--;
//                }
//            }
//            System.out.println(hours + ":" + minutes + ":" + seconds);
//        }catch (InputMismatchException e){
//            System.out.println("wrong input");
//        }
//
//
//        //Q-13
//
//       try{
//           System.out.print("please input X: ");
//           int x13 = sc.nextInt();
//           System.out.print("please input Y: ");
//           int y13 = sc.nextInt();
//           System.out.print("please input Z: ");
//           int z13 = sc.nextInt();
//           System.out.print("please input C: ");
//           int c13 = sc.nextInt();
//           if (x13 == y13 && z13 == y13 && c13 == z13) {
//               System.out.println("equal");
//           } else {
//               System.out.println("not equal");
//           }
//       }catch (InputMismatchException e) {
//           System.out.println("wrong input");
//       }
//
//        //Q-14
//
//        try{
//            int x14 = sc.nextInt();
//            if (x14 > 0) {
//                System.out.println("positive number");
//            } else if (x14 < 0) {
//                System.out.println("negative number");
//            } else {
//                throw new IllegalArgumentException();
//            }
//        }catch (InputMismatchException e){
//            System.out.println("the value should be an integer");
//        }catch (IllegalArgumentException e){
//            System.out.println("zero cant be negative or positive");
//        }
//
//        //Q-15
//
//
//        for (; ; ) {
//            try{
//                negativeOrPositive();
//            }catch (InputMismatchException e) {
//                System.out.println("the input should be an integer");
//            }catch (IllegalArgumentException e){
//                System.out.println("zero is not negative nor positive number");
//            }catch (RuntimeException e){
//                System.out.println("Good Bye!");
//                break;
//            }
//        }
//
//        //Q-16
//
//        System.out.print("please enter an integer to reverse it: ");
//        try{
//            int x = sc.nextInt();
//            int sign = 1;
//            long y = x;
//            if(x == 0 || x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9 ){
//                throw new RuntimeException();
//            }
//            else if (y < 0) {
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
//        }catch (InputMismatchException e){
//            System.out.println("the input should be an integer only");
//        }catch (RuntimeException e){
//            System.out.println("a single number cant be reversed");
//        }
//
//        //Q-17
//
//        int x17 = 0, biggest = 0, smallest = 0;
//        System.out.print("please give a number: ");
//
//       try{
//           x17 = sc.nextInt();
//           String ans17 = "";
//           biggest = x17;
//           smallest = x17;
//           sc.nextLine();
//           for (; ; ) {
//               if (x17 > biggest) {
//                   biggest = x17;
//               } else if (x17 < smallest) {
//                   smallest = x17;
//               }
//               System.out.print("do you want to add another number(yes or no): ");
//               ans17 = sc.nextLine().toLowerCase();
//               if (ans17.equals("yes")) {
//                   System.out.print("please give another number: ");
//                   x17 = sc.nextInt();
//                   sc.nextLine();
//               } else if(!ans17.equals("yes")) {
//                   throw new RelationTypeNotFoundException();
//
//               }
//           }
//       }catch (InputMismatchException e){
//           System.out.println("the input should be an integer only");
//       }catch (RelationTypeNotFoundException e){
//           System.out.println("Good Bye!");
//       }
//        System.out.println("The biggest number is " + biggest);
//        System.out.println("The smallest number is " + smallest);


//        //Q-18
//

//        System.out.print("please write a sentence or a word: ");
//        try{
//            String sentence18 = sc.nextLine().toLowerCase();
//            int count18 = 0;
//            if(sentence18.matches(".*[^A-za-z].*")){
//                throw new IllegalArgumentException();
//            }
//            for (int i = 0; i < sentence18.length(); i++) {
//                if (sentence18.charAt(i) == 'a') {
//                    count18++;
//                }
//            }
//            System.out.println("the latter a has come " + count18 + " times in this sentences");
//        }catch (InputMismatchException e){
//            System.out.println("the input should be a sentence or a word only");
//        }catch (IllegalArgumentException e){
//            System.out.println("the sentence or word should contain letters only");
//        }





    }

    public static void negativeOrPositive(){
        Scanner sc = new Scanner(System.in);
        int x15 = 0;
        System.out.print("enter a number or -1 to stop: ");
        x15 = sc.nextInt();
        if (x15 == -1) {
            throw new RuntimeException();
        }
        if (x15 < 0) {
            System.out.println(x15 + " negative");
        } else if (x15 > 0) {
            System.out.println(x15 + " positive");
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void perimeterInRectangle(){
        Scanner sc = new Scanner(System.in);

            System.out.print("please input the height: ");
            double height = sc.nextDouble();
            System.out.print("please input the width: ");
            double width = sc.nextDouble();
            if(height <= 0 || width <= 0){
                throw new ArithmeticException();
            }
            double area10 = height * width;
            double p10 = 2 * (height + width);
            System.out.println("the area of the rectangle is= " + area10);
            System.out.println("the perimeter of the rectangle is= " + p10);


    }
}
