package ru.mirea.task3.opt2;

public class Leg
{
    private int toes;
    private float sizeLeg;

    public Leg()
    {

    }

    public Leg(int t, float sL)
    {
        this.toes = t;
        this.sizeLeg = sL;
    }

    public void setToes(int t)
    {
        this.toes = t;
    }

    public int getToes()
    {
        return toes;
    }

    public void setSizeLeg(float sL)
    {
        this.sizeLeg = sL;
    }

    public float getSizeLeg()
    {
        return sizeLeg;
    }

    @Override
    public String toString()
    {
        return  "\tПальцы на ногах: " + toes +
                "\n\tРазмер стопы: " + sizeLeg
                ;
    }
}