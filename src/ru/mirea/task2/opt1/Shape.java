package ru.mirea.task2.opt1;

public class Shape
{
    String shapeName;
    float width;
    float height;

    public Shape(String s, float w, float h)
    {
        shapeName = s;
        width = w;
        height = h;
    }

    public String toString()
    {
        return "Shape {"
                + "ShapeName = '" + shapeName + '\''
                + ", width = " + width
                + ", height = " + height
                + '}';
    }
}