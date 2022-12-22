package ru.mirea.task5.opt2;

public abstract class Dog
{
    protected double weight;
    protected String name, color;

    public void setName(String n)
    {
        this.name = n;
    }

    public String getName()
    {
        return name;
    }

    public void setColor(String c)
    {
        this.color = c;
    }

    public String getColor()
    {
        return color;
    }

    public void setWeight(double w)
    {
        this.weight = w;
    }

    public double getWeight()
    {
        return weight;
    }

    public abstract String Info();
}