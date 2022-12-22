package ru.mirea.task22;

public interface Chair
{
    String getName();
}

class VictorianChair implements Chair
{

    @Override
    public String getName()
    {
        return "Викторианский стул";
    }
}

class MultifunctionalChair implements Chair
{
    @Override
    public String getName()
    {
        return "Многофункциональный стул";
    }
}

class MagicChair implements Chair
{
    @Override
    public String getName()
    {
        return "Магический стул";
    }
}

enum Chairs
{
    victorianChair,
    multifunctionalChair,
    magicChair;
}