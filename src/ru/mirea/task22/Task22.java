package ru.mirea.task22;

class Client
{
    public void Sit(Chair chair)
    {
        System.out.println("Клиент сел на " + chair);
    }
}

public class Task22
{

    public static void main(String[] args)
    {
        Factory factory = new Factory();
        Chair chair = factory.createChair(Chairs.multifunctionalChair);
        Client client = new Client();
        client.Sit(chair);
    }
}