package ru.mirea.task2.opt4;

import java.util.Scanner;

public class DogTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Dog dog = new Dog("Rex", 3);
        System.out.print("Введите кличку собаки: ");
        String name = input.nextLine();
        dog.setName(name);
        System.out.println("Вы ввели: " + dog.getName());
        System.out.print("Введите возраст собаки: ");
        int age = input.nextInt();
        dog.setAge(age);
        System.out.println("Вы ввели: " + dog.getAge());
        System.out.println('\n' + dog.toString());
    }
}