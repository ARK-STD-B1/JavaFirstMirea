package ru.mirea.task3.opt1;

import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Circle cir = new Circle();
        System.out.print("Введите радиус окружности: ");
        cir.setRad(input.nextDouble());
        System.out.println("Окружность");
        System.out.println("\tРадиус окружности: " + cir.getRad());
        System.out.println("\tДлина окружности: " + String.format("%.2f", cir.getCirCum()).replace(',', '.'));
        System.out.println("\tПлощадь окружности: " + String.format("%.2f", cir.getAreaOfCircle()).replace(',', '.'));
    }
}