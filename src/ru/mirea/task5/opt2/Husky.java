package ru.mirea.task5.opt2;

public class Husky extends Dog
{
    public Husky()
    {

    }

    public Husky(String n, String c, double w)
    {
        this.name = n;
        this.color = c;
        this.weight = w;
    }

    public String Info() {
        return "Хаски:" + "\n\tКличка: "+ getName()+ "\n\tЦвет: " + getColor() + "\n\tВес: " + getWeight();
    }
}