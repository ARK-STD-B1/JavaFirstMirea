package ru.mirea.task6.opt1;

public class Yasuo implements Nameable
{
    @Override
    public String getName()
    {
        return "Hello, my name is Yasuo!";
    }

    public static void main(String[] args)
    {
        Yasuo name = new Yasuo();
        System.out.print(name.getName());
    }
}