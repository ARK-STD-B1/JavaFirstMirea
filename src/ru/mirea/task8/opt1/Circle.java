package ru.mirea.task8.opt1;
import java.awt.*;
import java.util.Random;

public class Circle extends Shape
{
    public int randint(int min, int max)
    {
        Random rnd = new Random();
        return min + rnd.nextInt(max - min);
    }

    @Override
    public Color setColor()
    {
        Color[] colors = new Color[]{new Color(0, 255, 0), new Color(0, 255, 255), new Color(0, 169, 255),
                new Color(106, 0, 255), new Color(200, 50, 255), new Color(255, 60, 200), new Color(255, 80, 80)};
        return colors[randint(0, colors.length)];
    }

    @Override
    public void setPos()
    {
        this.x = randint(20, 380);
        this.y = randint(20, 180);
        this.width = this.height = randint(10, 40);
        this.color = setColor();
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
