package ru.mirea.task1.opt3;
import java.util.Scanner;

public class Number3
{
    static int[] myArray;

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив размера: ");
        int n = scan.nextInt();
        myArray = new int[n];
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив: ");
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = input.nextInt();
        }

        num3For();
        num3While();
        num3DoWhile();
    }

    private static void num3For()
    {
        int i;
        int sum = 0;

        for (i = 0; i < myArray.length; i++)
        {
            sum += myArray[i];
        }
        System.out.println("Цикл for: " + sum);
    }

    private static void num3While()
    {
        int i = 0;
        int sum = 0;

        while (i < myArray.length)
        {
            sum += myArray[i];
            i++;
        }
        System.out.println("Цикл while: " + sum);
    }

    private static void num3DoWhile()
    {
        int i = 0;
        int sum = 0;

        do
        {
            sum += myArray[i];
            i++;
        } while (i < myArray.length);
        System.out.println("Цикл do while: " + sum);
    }
}