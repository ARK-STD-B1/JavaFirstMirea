package ru.mirea.task2.opt5;

public class Dog
{
    String name;
    int age;

    Dog(String n, int a)
    {
        this.name = n;
        this.age = a;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public int toHumanAge(int a)
    {
        return age = a * 7;
    }

    public String toString()
    {
        return "Собака {"
                + "Кличка = '" + name + '\''
                + ", Возраст = " + age
                + ", Возраст собаки в человеческий возраст = " + toHumanAge(age)
                + '}';
    }
}