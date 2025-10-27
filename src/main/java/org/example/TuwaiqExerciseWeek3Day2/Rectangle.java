package org.example.TuwaiqExerciseWeek3Day2;

public class Rectangle extends Shape
{
    double length = 1.0;
    double width = 1.0;

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length * width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "A rectangle with width="+getWidth()+" with perimeter="+getPerimeter()+" which is a subclass of "+super.toString();
    }
}
