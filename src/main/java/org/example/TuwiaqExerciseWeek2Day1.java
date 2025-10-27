package org.example;

import java.util.Scanner;

public class TuwiaqExerciseWeek2Day1
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        //Q-1 java program that checks if the first and last values of an array are the same. array.length should be >= 2

//        System.out.print("please give the size of the array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++){
//            System.out.print("please give the value of the array: ");
//            arr[i] = sc.nextInt();
//        }
//        if (arr.length >= 2) {
//            if (arr[0] == arr[arr.length - 1]) {
//                System.out.println("true");
//            } else if (arr.length < 2) {
//                System.out.println("the array is too short");
//            } else {
//                System.out.println("false");
//            }
//        }

            //_________________________________________________________________________________________________________\\

            //Q-2 java program that finds numbers greater than the avg of the numbers in the array

//            System.out.print("enter the size of the array: ");
//            int size2 = sc.nextInt();
//            String biggerThan = "";
//            int avg = 0;
//            int[] arr2= new int[size2];
//            for (int i = 0; i < size2; i++){
//                System.out.print("please give the value of the index"+i+" : ");
//                arr2[i] = sc.nextInt();
//                avg += arr2[i];
//            }
//            avg = avg / size2;
//            for(int j = 0; j < size2; j++){
//                if(arr2[j] > avg){
//                    biggerThan += arr2[j] + " ";
//                }
//            }
//        System.out.println(biggerThan);




            //_________________________________________________________________________________________________________\\

            //Q-3 java program that finds the larger value between 1st and last index

//        System.out.print("give size for the array: ");
//        int size3 = sc.nextInt();
//        int[] arr3 = new int[size3];
//
//        for(int i = 0 ; i < size3; i++){
//            System.out.print("please give the value of the index "+i+" : ");
//            arr3[i] = sc.nextInt();
//        }
//        if (arr3[0] > arr3[size3-1]){
//            System.out.println("the value of index 0 is bigger");
//        }else if(arr3[0] < arr3[size3-1]){
//            System.out.println("the value of index "+(size3-1)+" is bigger");
//        }




            //_________________________________________________________________________________________________________\\

            //Q-4 java program that swaps first and last values of the array and creat new array

//        System.out.print("enter size of array: ");
//        int size4 = sc.nextInt();
//        int[] arr4 = new int[size4];
//        int[] result4 = arr4;
//        for(int i = 0; i < size4; i++){
//            System.out.print("enter value for index "+i+" : ");
//            arr4[i] = sc.nextInt();
//        }
//        int temp = result4[0];
//        result4[0] = result4[size4-1];
//        result4[size4-1] = temp;
//
//        System.out.println(Arrays.toString(result4));




            //_________________________________________________________________________________________________________\\

            //Q-5 java program that sort odd elements before even elements in the array

//        ArrayList<Integer> elementsStorted = new ArrayList<>();
//        System.out.print("how many elements you want to insert: ");
//        int size5 = sc.nextInt();
//
//        int[] arr5 = new int[size5];
//        for(int i = 0 ; i < size5;i++){
//            System.out.print("enter an element: ");
//            arr5[i] = sc.nextInt();
//            if(arr5[i] % 2 != 0){
//                elementsStorted.add(arr5[i]);
//            }
//        }
//        for(int i = 0; i < size5; i++){
//            if(arr5[i] % 2 == 0){
//                elementsStorted.add(arr5[i]);
//            }
//        }
//        System.out.println(elementsStorted);


        //_________________________________________________________________________________________________________\\

        //Q-6 java program that check equality of two arrays

//        System.out.print("enter size of arrays: ");
//        int size6 = sc.nextInt();
//        int missPoints = 0;
//        ArrayList<Integer> arr6 = new ArrayList<>();
//        ArrayList<Integer> arrToCompair7 = new ArrayList<>();
//
//        for (int i = 0 ; i< size6; i++){
//            System.out.print("please enter the value of index "+i+" for 1st Array: ");
//             arr6.add(sc.nextInt());
//        }
//        for(int j = 0 ; j< size6 ;j++){
//            System.out.print("please enter the value of index "+j+" for 2nd Array: ");
//            arrToCompair7.add(sc.nextInt());
//        }
//        for(int i = 0 ; i < arr6.toArray().length ; i++){
//            if(arr6.get(i).equals(arrToCompair7.get(i))){
//                missPoints++;
//            }
//        }
//        if (missPoints == 0){
//            System.out.println("false");
//        }else{
//            System.out.println("true");
//        }


    }
}
