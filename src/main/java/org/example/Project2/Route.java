package org.example.Project2;

public class Route
{

    private String pickUp, destination;
    private double price;

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Route() {
    }

    public Route(String pickUp, String destination, double price) {
        this.pickUp = pickUp;
        this.destination = destination;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Route{" +
                "pickUp='" + pickUp + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                '}';
    }
}
