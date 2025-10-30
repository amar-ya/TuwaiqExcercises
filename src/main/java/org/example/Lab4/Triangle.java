package org.example.Lab4;

public class Triangle extends Shape
{
    private double height, base;



    public Triangle() {
    }

    @Override
    public double calculateArea() {
        return 0.5*(height*base);
    }

    @Override
    public double calculateCircumference() {
        return height+height+base;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", Area= " + String.format("%.2f",calculateArea()) +
                ", Circumference= " + String.format("%.2f",calculateCircumference()) +
                '}';
    }
}
