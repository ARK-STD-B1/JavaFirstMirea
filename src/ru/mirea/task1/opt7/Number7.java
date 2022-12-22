package ru.mirea.task1.opt7;
import java.util.Scanner;

public class Number7
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.print("Введите число, факториал которого считать: ");
        number=scanner.nextInt();
        System.out.println("Результат = " + factorial(number));
    }

    public static int factorial(int number)
    {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
