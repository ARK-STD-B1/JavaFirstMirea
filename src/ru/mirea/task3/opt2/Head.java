package ru.mirea.task3.opt2;

public class Head
{
    private String hairColor;
    private String eyesColor;
    private boolean isHavingScars;

    public Head()
    {

    }

    public Head(String hc, String ec, boolean isHavingScars)
    {
        this.hairColor = hc;
        this.eyesColor = ec;
        this.isHavingScars = isHavingScars;
    }

    public void setHairColor(String hc)
    {
        this.hairColor = hc;
    }

    public String getHairColor()
    {
        return hairColor;
    }

    public void setEyesColor(String ec)
    {
        this.eyesColor = ec;
    }

    public String getEyesColor()
    {
        return eyesColor;
    }

    public void setHavingScars(boolean hb)
    {
        this.isHavingScars = hb;
    }

    public boolean isHavingScars()
    {
        return isHavingScars;
    }

    @Override
    public String toString()
    {
        return  "\tЦвет волос: " + hairColor +
                "\n\tЦвет глаз: " + eyesColor
                ;
    }
}