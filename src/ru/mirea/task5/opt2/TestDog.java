package ru.mirea.task5.opt2;
import java.util.Scanner;

public class TestDog
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String corgi_name, corgi_color, husky_name, husky_color;
        double corgi_weight, husky_weight;
        System.out.println("Создание собаки породы Корги");
        System.out.print("Имя собаки: "); corgi_name=input.next();
        System.out.print("Цвет собаки: "); corgi_color=input.next();
        System.out.print("Вес собаки: "); corgi_weight=input.nextDouble();
        Corgi corgi=new Corgi(corgi_name, corgi_color, corgi_weight);

        System.out.println("Создание собаки породы Хаски");
        System.out.print("Имя собаки: "); husky_name=input.next();
        System.out.print("Цвет собаки: "); husky_color=input.next();
        System.out.print("Вес собаки: "); husky_weight=input.nextDouble();
        Husky husky=new Husky(husky_name, husky_color, husky_weight);

        System.out.print("\nИнформация о созданных собаках\n\n"+corgi.Info()+"\n\n"+husky.Info()+"\n");
    }
}