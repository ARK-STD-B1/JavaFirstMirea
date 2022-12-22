package ru.mirea.task5.opt1;

public abstract class Dish
{
    protected boolean isClean = true;
    protected String color;

    public void setColor(String c)
    {
        this.color = c;
    }

    public String getColor()
    {
        return color;
    }

    public String getClean()
    {
        if (isClean)
        {
            return "Посуда чистая";
        }
        else
        {
            return "Посуда грязная";
        }
    }

    public abstract void setClean();
    public abstract String Info();
}