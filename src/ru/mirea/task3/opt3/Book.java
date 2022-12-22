package ru.mirea.task3.opt3;

public class Book
{
    private int year;
    private String name, genre, author, publishing_house;

    public Book()
    {

    }

    public Book(int year, String name, String genre, String author, String publishing_house)
    {
        this.year = year;
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.publishing_house = publishing_house;
    }

    public int BookAge(int current_year)
    {
        return current_year-year;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getPublishing_house()
    {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house)
    {
        this.publishing_house = publishing_house;
    }

    @Override
    public String toString()
    {
        return  "\tНавзвание: " + name + "\n" +
                "\tЖанр: " + genre + "\n" +
                "\tАвтор: " + author + "\n" +
                "\tИздательсво: " + publishing_house + "\n" +
                "\tГод написания: " + year
                ;
    }
}