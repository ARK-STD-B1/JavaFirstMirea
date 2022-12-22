package ru.mirea.task2.opt2;

public class Ball
{
    String typeOfBall;
    String color;
    float weight;

    public Ball(String t, String c, float w)
    {
        typeOfBall = t;
        color = c;
        weight = w;
    }

    public String toString()
    {
        return "Мяч {"
                + "Тип мяча = '" + typeOfBall + '\''
                + ", Цвет = " + color
                + ", Вес (кг) = " + weight
                + '}';
    }
}