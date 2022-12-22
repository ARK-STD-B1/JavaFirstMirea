package ru.mirea.task2.opt3;

public class Book
{
    String bookName;
    String author;
    int year;

    Book(String b, String a, int y)
    {
        bookName = b;
        author = a;
        year = y;
    }

    public String toString()
    {
        return "Книга {"
                + "Название книги = '" + bookName + '\''
                + ", Автор = " + author
                + ", Год = " + year
                + '}';
    }
}