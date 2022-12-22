package ru.mirea.task3.opt2;

public class Hand
{
    private int fingers;
    private float sizeHand;

    public Hand()
    {

    }

    public Hand(int f, float sh)
    {
        this.fingers = f;
        this.sizeHand = sh;
    }

    public void setFingers(int f)
    {
        this.fingers = f;
    }

    public int getFingers()
    {
        return fingers;
    }

    public void setSizeHand(float sH)
    {
        this.sizeHand = sH;
    }

    public float getSizeHand()
    {
        return sizeHand;
    }

    @Override
    public String toString()
    {
        return  "\tПальцы на руках: " + fingers +
                "\n\tРазмер кисти: " + sizeHand
                ;
    }
}