package org.example.TuwaiqExerciseWeek4Day1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();
        boolean rent = false;
        System.out.println("Welcome to Ammar`s Vehicle rental workshop");
        while(!rent){
            String c = Menu();
            switch (c){
                case "1": {
                    System.out.print("Enter the model of the car:");
                    String model = sc.nextLine();
                    System.out.print("Enter the durations in days: ");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    Vehicle car = new Car(duration,model);
                    rentedVehicles.add(car);
                    break;
                } case "2":{
                    System.out.print("Enter the type of the bike:");
                    String type = sc.nextLine();
                    System.out.print("Enter the duration in hours: ");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    Vehicle bike = new Bike(duration,type);
                    rentedVehicles.add(bike);
                    break;
                } case "3":{
                    System.out.print("Enter the model of the Truck:");
                    String type = sc.nextLine();
                    System.out.print("Enter the duration in weeks: ");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    Vehicle truck = new Truck(duration,type);
                    rentedVehicles.add(truck);
                    break;
                } case "4":{
                    for (Vehicle v : rentedVehicles){
                        v.displayDetails();
                    }
                    break;
                } case "5": {
                    System.out.println("Thank you for renting with us");
                    rent = true;
                    break;
                } default: {
                    System.out.println("invalid input");
                    break;
                }

            }
        }
    }
    public static String Menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("1.Rent a car *Daily*");
        System.out.println("2.Rent a bike *Hourly*");
        System.out.println("3.Rent a Truck *Weekly*");
        System.out.println("4.Display all rented vehicles");
        System.out.println("5.Exit");
        String choice = input.nextLine();
        return choice;
    }
}
