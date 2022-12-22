package ru.mirea.task3.opt1;

public class Circle
{
    double rad; //Радиус
    double cirCum; //Длина окружности
    double areaOfCircle; //Площадь окружности

    public void setRad(double r) { rad = r; }
    public double getRad() { return rad; }

    public double getCirCum() { return calcCirCum(); }

    public double getAreaOfCircle() { return calcAreaOfCircle(); }

    public double calcCirCum()
    {
        return (cirCum = Math.PI * 2 * rad);
    }

    public double calcAreaOfCircle()
    {
        return (areaOfCircle = Math.PI * Math.pow(rad, 2));
    }
}