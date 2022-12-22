package ru.mirea.task10;

public class task14
{
    public static String recursion(int n)
    {
        if (n < 10)
        {
            return Integer.toString(n);
        }
        else
        {
            return recursion(n / 10) + " " + n % 10;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(recursion(256));
    }
}