package ru.mirea.task10;


public class task10
{
    public static int recursion(int n, int i)
    {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }

    public static void main(String[] args)
    {
        System.out.println(recursion(256, 0));
    }
}