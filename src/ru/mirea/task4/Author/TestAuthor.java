package ru.mirea.task4.Author;
import java.util.Scanner;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name, email;
        char gender;
        System.out.print("Введите имя автора: ");
        name = input.nextLine();
        System.out.print("Введите адрес электронной почты автора: ");
        email = input.nextLine();
        System.out.print("Введите пол автора: ");
        String s = input.next();
        gender = s.charAt(0);
        Author author = new Author(name, email, gender);
        System.out.print(author.toString());
    }
}