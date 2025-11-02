package org.example.TuwaiqExerciseWeek4Day1;

public class Truck implements Vehicle
{
    private int duration;
    private String model;

    public Truck() {
    }

    public Truck(int duration, String model) {
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
        return 500*duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck: " + model + " \nweekly rental cost: " + duration + " \ntotal price "+500*duration);
    }
}
