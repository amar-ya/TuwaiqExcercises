package org.example.TuwaiqExerciseWeek4Day1;

public class Bike implements Vehicle
{
    private int duration;
    private String model;

    public Bike() {
    }

    public Bike(int duration, String model) {
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
        return 10*duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike: " + model + " \nhourly rental cost: " + duration + " \ntotal price "+10*duration);
    }
}
