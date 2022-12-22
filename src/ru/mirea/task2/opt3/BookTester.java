package ru.mirea.task2.opt3;

import java.util.Scanner;

public class BookTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String name = input.nextLine();
        System.out.print("Введите автора книги: ");
        String author = input.nextLine();
        System.out.print("Введите год написания книги: ");
        int year = input.nextInt();
        Book square = new Book(name, author, year);
        System.out.println('\n' + square.toString());
    }
}
