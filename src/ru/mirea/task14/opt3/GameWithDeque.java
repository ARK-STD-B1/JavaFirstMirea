package ru.mirea.task14.opt3;
import java.util.ArrayDeque;
import java.util.Deque;

public class GameWithDeque
{
    static void InputCards(Deque<Integer> cards)
    {
        for (int i = 0; i < 5; i++)
        {
            cards.add((int)(Math.random()*10));
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Первая колода карт: ");
        Deque<Integer> cards1 = new ArrayDeque<>();
        InputCards(cards1);
        System.out.println(cards1);
        System.out.print("Вторая колода карт: ");
        ArrayDeque<Integer> cards2 = new ArrayDeque<>();
        InputCards(cards2);
        System.out.println(cards2);

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++)
        {
            count++;
            if (cards1.element() > cards2.element() || ((cards1.element() == 0) && (cards2.element() == 9)))
            {
                cards1.addLast(cards1.element());
                cards1.addLast(cards2.element());
            }
            else if (cards1.element() < cards2.element() || ((cards1.element() == 9) && (cards2.element() == 0)))
            {
                cards2.addLast(cards2.element());
                cards2.addLast(cards1.element());
            }
            cards1.removeFirst();
            cards2.removeFirst();

            if (cards1.size() == 0)
            {
                System.out.println("Second " + count);
                res = true;
                break;
            }
            else if (cards2.size() == 0)
            {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}