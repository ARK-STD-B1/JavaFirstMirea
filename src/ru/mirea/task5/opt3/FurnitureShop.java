package ru.mirea.task5.opt3;

public class FurnitureShop
{
    public static void main(String[] args)
    {
        Sofa sofa = new Sofa(15000, "Синий");
        Table table = new Table(30000, "Коричневый");
        System.out.println("\nИнформация о товарах в магазине");
        System.out.print("\n"+sofa.Info()+"\n\n"+table.Info()+"\n");
    }
}