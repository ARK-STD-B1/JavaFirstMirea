package ru.mirea.task2.opt5;
import java.util.Scanner;
import java.util.ArrayList;

public class TestDog
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, age;
        String name;
        System.out.print("Введите кол-во собак собак: ");
        n = input.nextInt();
        ArrayList<Dog> dogs=new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.print("Введите имя "+(i+1)+" собаки: ");
            name = input.next();
            System.out.print("Введите возраст "+(i+1)+" собаки: ");
            age = input.nextInt();
            addDog(dogs, name, age);
        }
        showDogs(dogs);
    }

    public static void addDog(ArrayList<Dog> dogs, String name, int age)
    {
        dogs.add(new Dog(name, age));
    }

    public static void showDogs(ArrayList<Dog> dogs)
    {
        for(int i = 0; i < dogs.size(); i++)
        {
            System.out.print('\n' + "Собака №"+(i+1)+"\n"+dogs.get(i).toString());
        }
    }
}