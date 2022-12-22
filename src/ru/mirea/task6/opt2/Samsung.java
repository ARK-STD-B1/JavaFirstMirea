package ru.mirea.task6.opt2;

import ru.mirea.task6.opt1.Nameable;

public class Samsung implements Nameable, Priceable
{
    @Override
    public String getName()
    {
        return "I'm Samsung S22 Ultra, Samsung brand phone";
    }

    @Override
    public String getPrice() {
        return "My price is 2205,09$";
    }

    public static void main(String[] args)
    {
        Samsung name = new Samsung();
        Samsung price = new Samsung();
        System.out.print(name.getName() + '\n' + price.getPrice());
    }
}