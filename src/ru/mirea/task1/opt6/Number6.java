package ru.mirea.task1.opt6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Number6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, f;

        System.out.print("Введите размер массива: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Выберите вариант заполнения массива");
        System.out.print("1 - метод `random()` класса `Math`\n2 - класс `Random`\n");
        f = input.nextInt();
        switch (f)
        {
            case 1:
                fillArrayMath(arr);
                System.out.print("Массив: ");
                printArray(arr);
                Arrays.sort(arr);
                System.out.print("\nОтсортированный массив: ");
                printArray(arr);
                break;
            case 2:
                fillArrayRandom(arr);
                System.out.print("Массив: ");
                printArray(arr);
                Arrays.sort(arr);
                System.out.print("\nОтсортированный массив: ");
                printArray(arr);
                break;
            default:
                System.out.println("Вариант заполнения массива не выбран");
                break;
        }
    }

    public static void fillArrayMath(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void fillArrayRandom(int[] arr)
    {
        Random random = new Random();
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = random.nextInt(100);
        }
    }

    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}