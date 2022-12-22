package ru.mirea.task10;
import java.util.Scanner;

public class task13
{
    public static void recursion()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0)
        {
            System.out.println(n);
            int m = in.nextInt();
            if (m > 0)
            {
                recursion();
            }
        }
    }

    public static void main(String[] args)
    {
        recursion();
    }
}