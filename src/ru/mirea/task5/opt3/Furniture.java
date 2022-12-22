package ru.mirea.task5.opt3;

public abstract class Furniture
{
    protected int price;
    protected String color;
    protected boolean inStock = true;

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public String getInStock()
    {
        if (inStock)
        {
            return "да";
        }
        else
        {
            return "нет";
        }
    }

    public abstract void setInStock();
    public abstract String Info();
}