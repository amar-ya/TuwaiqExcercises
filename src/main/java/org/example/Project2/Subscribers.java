package org.example.Project2;

public class Subscribers extends Passenger
{

    public Subscribers(int ID, String name) {
        super(ID, name);
    }

    public Subscribers() {
    }

    @Override
    public void setTripCost(double tripCost) {
        super.setTripCost(tripCost-(tripCost*0.5));
    }

    @Override
    public double reserveCar(Car car) {
        this.setCar(car);
        double cost = car.getFixedRoute().getPrice();
        int max = this.getCar().getMaxCapacity();
        this.getCar().setMaxCapacity(max-1);
        this.setTripCost(cost);
        return cost;
    }

    @Override
    public double reserveRestOfSeats(Car car) {
        this.setCar(car);
        double cost = car.getFixedRoute().getPrice();
        int max = this.getCar().getMaxCapacity();
        this.getCar().setMaxCapacity(0);
        this.setTripCost((cost-(cost*0.05))*max);
        return (cost-(cost*0.05))*max;
    }

    @Override
    public String toString() {
        return "Subscribers{ " + super.toString() + "}";
    }
}
