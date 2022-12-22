package ru.mirea.task2.opt2;

import java.util.Scanner;

public class BallTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите тип мяча: ");
        String name = input.nextLine();
        System.out.println("Введите цвет мяча: ");
        String color = input.nextLine();
        System.out.println("Введите вес мяча (кг): ");
        float weight = input.nextFloat();
        Ball square = new Ball(name, color, weight);
        System.out.println(square.toString());
    }
}