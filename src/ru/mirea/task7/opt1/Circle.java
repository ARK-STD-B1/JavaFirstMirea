package ru.mirea.task7.opt1;

public class Circle extends Shape
{
    protected double radius;

    public Circle() {}

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return 3.14*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter()
    {
        return 2*3.14*radius;
    }

    @Override
    public String toString()
    {
        return "Circle:" + "\n\tColor: " + getColor() + "\n\tisFilled: " + isFilled() + "\n\tArea: " + getArea() + "\n\tPerimeter: " + getPerimeter() + "\n";
    }
}