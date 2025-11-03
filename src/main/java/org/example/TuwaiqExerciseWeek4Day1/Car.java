package org.example.TuwaiqExerciseWeek4Day1;

import org.example.Project2.Route;

public class Car implements Vehicle
{

    private int duration;
    private String model;

    public Car() {

    }

    public Car(int duration, String model) {
        this.duration = duration;
        this.model = model;
    }



    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculateRentalCost() {
        return 50*duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car model: " + model + " \ndaily rental cost: " + duration + "  \ntotal price "+50*duration);
    }
}
