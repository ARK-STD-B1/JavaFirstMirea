package ru.mirea.task3.opt2;

public class Human
{
    private int age, weight, height;
    private String gender;
    private String name, surname;
    public Head head = new Head();
    public Hand hand = new Hand();
    public Leg leg = new Leg();

    public Human(String gender, String name, String surname, int weight, int height, int age)
    {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return  "\tПол: " + gender + "\n" +
                "\tИмя: " + name + "\n" +
                "\tФамилия: " + surname + "\n" +
                "\tВозраст: " + age + "\n" +
                "\tВес: " + weight + "\n" +
                "\tРост: " + height
                ;
    }
}