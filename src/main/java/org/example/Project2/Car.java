package org.example.Project2;

public class Car
{
    private String code;
    private int maxCapacity;
    private Route fixedRoute;

    public Car(String code, int maxCapacity, Route fixedRoute) {
        this.code = code;
        this.maxCapacity = maxCapacity;
        this.fixedRoute = fixedRoute;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    @Override
    public String toString() {
        return "Car{" +
                "code='" + code + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", fixedRoute=" + fixedRoute +
                '}';
    }
}
