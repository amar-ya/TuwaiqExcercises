package org.example;

import java.util.Scanner;

public class TuwaiqExcerciseWeek2Day2
{
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);


        //Q-1 java method to find the smallest number

        System.out.print("enter the 1st value: ");
        int x = sc.nextInt();
        System.out.print("enter the 2nd value: ");
        int y = sc.nextInt();
        System.out.print("enter the 3rd value: ");
        int z = sc.nextInt();
        System.out.println(biggestOfThree(x,y,z));


        //__________________________________________________________________________________\\


        //Q-2 java method return the sign of an integer
        System.out.print("enter the number to check the sign: ");
        int x2 = sc.nextInt();
        signOfNumber(x2);


        //__________________________________________________________________________________\\


        //Q-3 java method that checks if password is valid or not
        // Rules: 1- it must be atleast 10 characters
        // 2- must be only letters and digits
        // 3- must have alteast 2 digits
        sc.nextLine();
        System.out.print("input a password (you are agreeing to the above Terms and Conditions) : ");
        String password = sc.nextLine();
        isValidPassword(password);

    }


    //__________________________________________________________________________________\\


    //Q-1 java method to find the smallest number
    public static int biggestOfThree(int x, int y, int z){
        if(x <= y && x <= z){
            return x;
        } else if (y <= x && y <= z) {
            return y;
        }else {
            return z;
        }
    }


    //__________________________________________________________________________________\\


    //Q-2 java method return the sign of an integer
    public static void signOfNumber(int x){
        if (x>0){
            System.out.println(x+" is a positive number");
        }else if(x <0){
            System.out.println(x+ " is a negative number");
        }else{
            System.out.println(x+ " is zero and not positive nor negative");
        }
    }

    //__________________________________________________________________________________\\


    //Q-3 java method that checks if password is valid or not
    // Rules: 1- it must be atleast 10 characters
    // 2- must be only letters and digits
    // 3- must have alteast 2 digits
    public static void isValidPassword(String password){
        String regex = "! @ # $ % ^ & * ( ) _ + | } { \" : ? > < , . / ~ `", nums = "0123456789", letters = "abcdefghijklmnopqrstuvwxyxABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int digitsCounter =0, lettersCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            String temp = password.charAt(i)+"";
            if (nums.contains(temp)) {
                digitsCounter++;
            }
        }
        for(int i = 0; i< password.length();i++){
            String temp = password.charAt(i)+"";
            if(letters.contains(temp)){
                lettersCounter++;
            }
        }


        if(lettersCounter < 8){
            System.out.println("A password must have atleast eight letters");
        }
        if (password.length() < 10){
            System.out.println("A password must be atleast 10 character long");
        }
        if (digitsCounter < 2){
            System.out.println("the password should have atleast two numbers");
        }
        boolean valid = false;
        if(lettersCounter >= 8  && digitsCounter >= 2){
            for(int i = 0 ; i< password.length();i++){
                String temp = password.charAt(i)+"";
                if(!regex.contains(temp)){

                    valid = true;
                }else {
                    valid = false;
                    break;
            }
        }
            if (valid){
                System.out.println("the password is valid and strong!");
            }else{
                System.out.println("A password consists of only letter and digits ");
            }
        }

    }
}

