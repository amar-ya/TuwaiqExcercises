package org.example.Project2;



public class NonSubscribers extends Passenger
{


    private Boolean coupon;
    public NonSubscribers() {
    }

    public NonSubscribers(int ID, String name, Boolean coupon) {
        super(ID, name);
        this.coupon = coupon;
    }

    public Boolean getCoupon() {
        return coupon;
    }

    public void setCoupon(Boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public void setTripCost(double cost) {
        if (coupon) {
            super.setTripCost(cost-(cost*0.1));
        }else {
            super.setTripCost(cost);
        }
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
        return "NonSubscribers{" +
                super.toString() +
                "coupon=" + coupon +
                '}';
    }
}
