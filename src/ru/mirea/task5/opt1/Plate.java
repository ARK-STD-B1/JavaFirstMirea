package ru.mirea.task5.opt1;
import java.util.Scanner;

public class Plate extends Dish
{
    private String shape;

    public Plate()
    {

    }

    public Plate(String c, String s)
    {
        this.color = c;
        this.shape = s;
    }

    public void setClean()
    {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.print("Тарелка чистая? (да/нет): ");
        answer = scanner.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА") || answer.equals("дА"))
        {
            this.isClean = true;
        }
        else
        {
            this.isClean = false;
        }
    }

    public String getShape()
    {
        return shape;
    }

    public void setShape(String s)
    {
        this.shape = s;
    }

    public String Info()
    {
        return "Тарелка:" + "\n\tЦвет: " + getColor() + "\n\tФорма: " + getShape() + "\n\tСостояние: " + getClean() + "\n";
    }
}
