package org.example.TuwaiqExerciseWeek3Day2;

public class Square extends Rectangle
{

    public Square(double side)
    {
        super.setLength(side);
    }

    public Square() {
    }

    public Square(double side, String color, boolean filled)
    {
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public String toString() {
        return "A square with side="+getSide()+" and its area= "+getArea()+" which is subclass of "+super.toString();
    }
}
