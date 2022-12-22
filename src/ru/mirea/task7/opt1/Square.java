package ru.mirea.task7.opt1;

public class Square extends Rectangle
{
    public Square(){};

    public Square(double side){
        length=side;
    }

    public Square(double side, String color, boolean filled){
        this.length=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide(){
        double side=length;
        return side;
    }

    public void setSide(double side){
        this.length=side;
    }

    @Override
    public double getPerimeter() {
        return 4*getSide();
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public String toString() {
        return  "Square:" + "\n\tColor: " + getColor() + "\n\tisFilled: " + isFilled() + "\n\tArea: " + getArea() + "\n\tPerimeter: " + getPerimeter() + "\n";
    }
}