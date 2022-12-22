package ru.mirea.task3.opt3;
import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        CreateBook();
    }

    public static void CreateBook()
    {
        int year;
        String name, genre, author, publishing_house;
        Scanner input = new Scanner(System.in);
        System.out.println("Создание книги");
        System.out.print("\tВведите название книги: ");
        name = input.next();
        System.out.print("\tВведите жанр книги: ");
        genre = input.next();
        System.out.print("\tВведите автора книги: ");
        input.nextLine();
        author = input.nextLine();
        System.out.print("\tВведите издательство книги: ");
        publishing_house = input.nextLine();
        System.out.print("\tВведите год написания книги: ");
        year = InputInt();
        Book book = new Book(year, name, genre, author, publishing_house);
        BookInfo(book);
    }

    public static int InputInt()
    {
        int n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        while (n <= 0)
        {
            System.out.print("Введите положительное число! ");
            n = input.nextInt();
        }

        return n;
    }

    public static void BookInfo(Book book)
    {
        Scanner scanner=new Scanner(System.in);
        String answer;
        System.out.print("Желаете вывести информацию о книге? (Да/Нет): ");
        answer = scanner.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА") || answer.equals("дА")){
            System.out.println("Информация о книге");
            System.out.print(book.toString());
        }
    }
}