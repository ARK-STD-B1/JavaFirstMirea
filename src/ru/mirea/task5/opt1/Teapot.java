package ru.mirea.task5.opt1;
import java.util.Scanner;

public class Teapot extends Dish
{
    private String type;

    public Teapot()
    {

    }

    public Teapot(String c, String t)
    {
        this.color = c;
        this.type = t;
    }

    public void setClean()
    {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.print("Чайник чистый? (да/нет): ");
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

    public String getType()
    {
        return type;
    }

    public void setType(String t)
    {
        this.type = t;
    }

    public String Info()
    {
        return "Чайник:" + "\n\tЦвет: " + getColor() + "\n\tВид: " + getType() + "\n\tСостояние: " + getClean() + "\n";
    }
}
