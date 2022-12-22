package ru.mirea.task5.opt2;

public class Corgi extends Dog
{
    public Corgi()
    {

    }

    public Corgi(String n, String c, double w)
    {
        this.name = n;
        this.color = c;
        this.weight = w;
    }

    public String Info() {
        return "Корги:" + "\n\tКличка: "+ getName()+ "\n\tЦвет: " + getColor() + "\n\tВес: " + getWeight();
    }
}