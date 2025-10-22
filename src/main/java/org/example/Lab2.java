package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Q-1 java program to print all the longest words in an array

//        String[] arr = {"cat","dog","red","is","am"};
//        System.out.println(biggestOfGiven(arr));

        //Q-2 java program display the number of occurrences of an element of an array

//        int[] arr2 = {1,2,1,3,1,4,1,2,3,1,5,5};
//        countOccurrences(arr2);

        //Q-3 java program that prints the k lergest elements in a given array. can be in any order
//        Integer[] arr3 = {1,3,1,3,4,7,5};
//        printXLargest(arr3,3);

        //Q-4 method that reverse any array of integers without creating another array

//        int[] arr = {1,2,3,4,5,6};
//        reverseArray(arr);


        //Q-5 menu driven program from the given in the question

//        menu(5);


        //Q-6 method returns random number that takes its intial number and largest from the user

//        System.out.print("to generate random number \n please enter the smallest number that you can get: ");
//        int start = sc.nextInt();
//        System.out.print("please enter the largest number that you can get: ");
//        int end = sc.nextInt();
//        sc.nextLine();
//        randomNumber(start, end);

        //Q-7 method check the strength of a password based on given criteria

//        System.out.print("please enter your password: ");
//        String pass = sc.nextLine();
//        int score = checkSpecialCharacter(pass) + checkLength(pass) + checkLowerAndUpperCaseLetters(pass) ;
//        if (score >= 8){
//            System.out.println("Password is strong");
//        }else if ( score >= 5){
//            System.out.println("Password is moderately strong");
//        }else {
//            System.out.println("Password is weak!");
//        }


        //Q-8 method that generate fibonacci series up to a given number

//        printFibonacci(10);


    }


    //Q-1 java program to print all the longest words in an array
    public static ArrayList biggestOfGiven(String []arr)
    {
        int length = 0;
        ArrayList<String> longest = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++){
            if(arr[i].length() >= length){
                length = arr[i].length();
            }
        }
        for (int i = 0; i < arr.length ; i++){
            if (arr[i].length() >= length){
                longest.add(arr[i]);
            }
        }
        return longest;
    }


    //Q-2 java program display the number of occurrences of an element of an array
    public static void countOccurrences(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            String timeWord = (count == 1) ? "time" : "times";
            System.out.println(entry.getKey() + " occurs " + count + " " + timeWord);
        }

    }

    //Q-3 java program that prints the k lergest elements in a given array. can be in any order
    public static void printXLargest(Integer[] arr, int x){
        ArrayList<Integer> list = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(arr)));
        for(int i = 0 ; i < list.size() ; i++){
            for(int j = i+1 ; j < list.size(); j++){
                if (list.get(i) <= list.get(j)){
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for(int i = 0 ; i < x; i++){
            System.out.println(list.get(i));
        }
    }

    //Q-4 method that reverse any array of integers without creating another array

    public static void reverseArray(int[] arr) {
        for(int i = 0 ; i<arr.length /2;i++){
            int temp = arr[i];
             arr[i] = arr[arr.length-1 -i];
            arr[arr.length-1 -i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Q-5 menu driven program from the given in the question

    public static void menu(int length){
        int[] arr = new int[length];
        Scanner sc = new Scanner(System.in);
        String choice = "";
        for(int i= 0; i<= arr.length;i++){

            System.out.println("1. Accept element of an array ");
            System.out.println("2. Display elements of an array");
            System.out.println("3. search for an element within the array");
            System.out.println("4. sort the array");
            System.out.println("5. stop");
            choice = sc.nextLine();
            if (choice.equals("1") && i < arr.length){
                System.out.print("please enter value for index "+ i + " : ");
                arr[i] = sc.nextInt();
                sc.nextLine();
            }else if(choice.equals("1") && i == arr.length){
                System.out.println("the array is full");
                i--;
            }
            else if (choice.equals("2")) {
                System.out.println(Arrays.toString(arr));
                i--;
            } else if (choice.equals("3")) {
                System.out.print("what is the value you want to search for?: ");
                int search = sc.nextInt();
                sc.nextLine();
                for(int j = 0 ; j< arr.length;j++){
                    if (arr[j] == search){
                        System.out.println("the value " + search + " is in index " + j);
                        break;
                    }else if ( j == arr.length && search != arr[j]){
                        System.out.println("the value "+search+" is not found");
                    }
                }
                i--;
            } else if (choice.equals("4")) {
                for (int j = 0; j < arr.length - 1; j++) {
                    for (int k = 0; k < arr.length - 1 - j; k++) {
                        if (arr[k] > arr[k + 1]) {
                            int temp = arr[k];
                            arr[k] = arr[k + 1];
                            arr[k + 1] = temp;
                        }
                    }
                }
                i--;
            }else {
                System.out.println("Good Bye!");
                break;
            }
        }
    }

    //Q-6 method returns random number that takes its intial number and largest from the user

    public static void randomNumber(int initial,int largest){
        Random random = new Random();
        int start = initial, end = largest;
        System.out.println(random.nextInt(start, end+1));
    }

    //Q-7 method check the strength of a password based on given criteria
    public static int checkLength(String passowrd){
        if(passowrd.length() <= 5){
            return 0;
        } else if (passowrd.length() <= 7) {
            return 2;
        }else {
            return 3;
        }
    }
    public static int checkSpecialCharacter(String password){
        String regex = "! @ # $ % ^ & * ( ) - _ + = { } [ ] : ; \" ' < > , . ? / \\ | ~ `";
        if (password.matches(".*[^A-Za-z0-9].*")){
            return 2;
        }else {
            return 0;
        }
    }
    public static int checkLowerAndUpperCaseLetters(String password){
        if(password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")){
            return 3;
        } else if (password.matches(".*[A-Z].*") || password.matches(".*[a-z].*")) {
            return 2;
        }else {
            return 0;
        }
    }

    //Q-8 method that generate fibonacci series up to a given number

    public static void printFibonacci(int fibonacci) {
        int currnet = 0, next = 1;
        System.out.print("Fibonacci sequence: ");

        for (int i = 0; i < fibonacci; i++) {
            System.out.print(currnet + " ");
            int temp = currnet + next;
            currnet = next;
            next = temp;
        }
    }


}
