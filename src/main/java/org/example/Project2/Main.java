package org.example.Project2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static int id = 1;
    public static ArrayList<Passenger> passengers = new ArrayList<>();
    public static ArrayList<Car> cars = new ArrayList<>();

    String exist = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note: Majd and Khalid are subscribed passengers, Ammar non subscribed without coupon and Yousef with coupon" +
                "\n any other username you input will be registered as new non subscribed without a coupon user");
        System.out.println("Welcome to KADDAD system");
        Passenger s1 = new Subscribers(id++, "Maj");
        passengers.add(s1);
        Passenger s2 = new Subscribers(id++, "Khalid");
        passengers.add(s2);
        Passenger ns1 = new NonSubscribers(id++, "Ammar", false);
        Passenger ns2 = new NonSubscribers(id++,"Yousef", true);
        passengers.add(ns1);
        passengers.add(ns2);

        cars.add(new Car("ksa 1", 4, new Route("Yanbu", "Jeddah", 120)));
        cars.add(new Car("ksa 2", 4, new Route("Jeddah", "Makkah", 80)));
        cars.add(new Car("ksa 3", 6, new Route("Makkah", "Riyadh", 240)));
        cars.add(new Car("ksa 4", 6, new Route("Riyadh", "Yanbu", 260)));
        cars.add(new Car("ksa 5", 8, new Route("Jeddah", "Riyadh", 250)));
        cars.add(new Car("ksa 6", 0, new Route("Jeddah", "Riyadh", 250)));
        boolean Logout = false, exit = false;
        String[] coupons = {"ksa1", "nationalDay2025","nd25"};



        while (!exit){
            System.out.println("1. Login or Register\n2. Exit");
            String choice1 = sc.nextLine();
            if (choice1.equals("1")){
                System.out.print("please enter your account name: ");
                String name = sc.nextLine();
                Passenger person = validateUser(name);
                passengers.add(person);
                while (!Logout){
                    String choice =  menu(person);
                    try{
                        switch (choice){
                            case "1":{
                                Car c = pickCar(person);
                                if (c != null && c.getMaxCapacity() > 0){
                                    for(Car t: cars){
                                        if (t.getCode().equals(c.getCode())){
                                            cars.remove(t);
                                            person.reserveCar(c);
                                            cars.add(c);
                                            System.out.println("Seat reserved successfully and it costs before any discount: "+c.getFixedRoute().getPrice());
                                            break;
                                        }
                                    }
                                } else if (c.getCode() == null) {
                                    throw new IllegalArgumentException();
                                } else {
                                    throw new ArithmeticException();
                                }
                                break;
                            } case "2": {
                                Car c = restOfSeats(person);
                                if (c != null && c.getMaxCapacity() > 1){
                                    for(Car t: cars){
                                        if (t.getCode().equals(c.getCode())){
                                            double cost = c.getFixedRoute().getPrice();
                                            int max = c.getMaxCapacity();
                                            cars.remove(t);
                                            person.reserveRestOfSeats(c);
                                            cars.add(c);
                                            System.out.println("Seats reserved successfully and it costs before any discount applied: "+(cost * max));
                                            break;
                                        }
                                    }
                                    break;
                                }
                            } case "3": {
                                for (Car c: cars){
                                    System.out.println("code: "+c.getCode()+" empty Seats: "+c.getMaxCapacity()+" route: "+c.getFixedRoute());
                                }
                                break;
                            } case "4":{
                                System.out.println("thank you for subscribing Mr/Ms."+person.getName());
                                for (Passenger p: passengers){
                                    if (p.getName().equals(person.getName())){
                                        passengers.remove(p);
                                        person = new Subscribers(person.getID(),person.getName());
                                        passengers.add(person);
                                        break;
                                    }
                                }
                                break;
                            } case "5":{

                                    if (person instanceof Subscribers) {
                                        System.out.println("you already have the subscription 50% coupon");
                                        break;
                                    }else if(person instanceof NonSubscribers && ((NonSubscribers) person).getCoupon()){
                                        System.out.println("you already have the non-subscription 10% coupon");
                                        break;
                                    }
                                    System.out.print("please enter the coupon code: ");
                                    String cop = sc.nextLine();
                                    for (String c: coupons){
                                    if (c.equals(cop) && person instanceof NonSubscribers){
                                        System.out.println("you have successfully entered a 10% coupon");
                                        passengers.remove(person);
                                        ((NonSubscribers) person).setCoupon(true);
                                        passengers.add(person);
                                    }
                                }
                                if(person instanceof NonSubscribers && !((NonSubscribers) person).getCoupon()){
                                    System.out.println("you are not eligible for this coupon");
                                }
                                System.out.println(person);
                                break;
                            } case "6":{
                                System.out.println("Mr/Ms."+person.getName()+" your check is "+person.getTripCost()+" SR please make sure to transfer the money to the bank");
                                break;
                            } case "7":{
                                System.out.println(person);
                                break;
                            } default:{
                                Logout = true;
                            }
                        }
                    }catch (ArithmeticException e){
                        System.out.println("this car doesnt have enough seats");
                    }catch (IllegalArgumentException e){
                        System.out.println("this car is full");
                    }

                }
            }else{
                System.out.println("Thank you for using KADDAD system goodbye!");
                exit = true;
            }
        }
    }

    public static Car pickCar(Passenger p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the car code: ");
        String carCode = sc.nextLine(), exist = "";
        for(Car c: cars){
            if (c.getCode().equals(carCode)){
                if (c.getMaxCapacity() > 0){
                    return c;
                }else {
                    throw new IllegalArgumentException();
                }
            }
        }
        return new Car(null, 4, null);
    }

    public static Car restOfSeats(Passenger p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the car code: ");
        String carCode = sc.nextLine(), exist = "";
        for(Car c: cars){
            if (c.getCode().equals(carCode) && c.getMaxCapacity() > 1){
                return c;
            }else if(c.getCode().equals(carCode) && c.getMaxCapacity() <= 1){
                System.out.println("there is "+c.getMaxCapacity()+" seat in this car only");
                return new Car(null, 4, null);
            }else {
                exist = "no";
            }
        }
        if (exist.equals("no")){
            System.out.println("Car not found");
        }
        return null;
    }

    public static Passenger validateUser(String username){
        String exist = "";
        Passenger person = null;
        for(Passenger p: passengers){
            if (username.equals(p.getName())){
                System.out.println("Welcome back Mr/Ms." + p.getName());
                return p;
            }else {
                exist = "no";
            }
        }
        if(exist.equals("no")){
            System.out.println("you are not registered a new non-subscribed account has been made");
            person = new NonSubscribers(id++, username, false);
            passengers.add(person);
        }

        return person;
    }

    public static String menu(Passenger p){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Reserve a car");
        System.out.println("2. Reserve the rest of the seats *5% more off applied if available*");
        System.out.println("3. Display available trips/cars");
        System.out.println("4. Subscribe to the service");
        System.out.println("5. Use a coupon");
        System.out.println("6. Check");
        System.out.println("7. View my account details");
        System.out.println("8. Logout");
        String choice = sc.nextLine();
        return choice;
    }
}
