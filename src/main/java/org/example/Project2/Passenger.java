package org.example.Project2;

public abstract class Passenger
{
    private int ID;
    private String name;
    private Car car;
    private Double tripCost = 0.0;

    public Passenger() {
    }

    public Passenger(int ID, String name) {
        this.ID = ID;
        this.name = name;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost += tripCost;
    }

    public abstract double reserveCar(Car car);

    public abstract double reserveRestOfSeats(Car car);


    @Override
    public String toString() {
        return "Passenger{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", car=" + car +
                ", tripCost=" + tripCost +
                '}';
    }
}
