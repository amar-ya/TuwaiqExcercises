package org.example.Lab4;

public class Circle extends Shape
{
    private double radius;


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return (radius * radius)* Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return (2*Math.PI)*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Area= " + String.format("%.2f",calculateArea()) +
                ", Circumference= "+String.format("%.2f",calculateCircumference())+
                '}';
    }
}
