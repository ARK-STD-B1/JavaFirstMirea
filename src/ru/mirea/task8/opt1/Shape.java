package ru.mirea.task8.opt1;
import java.awt.*;
import java.util.Random;

public abstract class Shape
{
    public int x, y, width, height;
    public Color color;

    public abstract void draw(Graphics g);

    public abstract Color setColor();
    public abstract void setPos();
}
