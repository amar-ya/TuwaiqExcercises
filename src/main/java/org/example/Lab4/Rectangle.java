package org.example.Lab4;

public class Rectangle extends Shape
{
    private double height, width;


    public Rectangle() {
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculateCircumference() {
        return (2*height)+(2*width);
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", Area= " + String.format("%.2f",calculateArea()) +
                ", Circumference= " + String.format("%.2f",calculateCircumference()) +
                '}';
    }
}
