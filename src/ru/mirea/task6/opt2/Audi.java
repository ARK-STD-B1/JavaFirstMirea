package ru.mirea.task6.opt2;

import ru.mirea.task6.opt1.Nameable;

public class Audi implements Nameable, Priceable
{
    @Override
    public String getName() {
        return "I'm Audi A7 Sportback, Audi brand car";
    }

    @Override
    public String getPrice()
    {
        return "My price starts from 109755,92$";
    }

    public static void main(String[] args)
    {
        Audi name = new Audi();
        Audi price = new Audi();
        System.out.print(name.getName() + '\n' + price.getPrice());
    }
}