package ru.mirea.task22;

public class Factory
{
    public Chair createChair(Chairs type)
    {
        Chair chair=null;

        switch (type)
        {
            case victorianChair -> chair = new VictorianChair();
            case multifunctionalChair -> chair = new MultifunctionalChair();
            case magicChair -> chair = new MagicChair();
        }
        return chair;
    }
}
