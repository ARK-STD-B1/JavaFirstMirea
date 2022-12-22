package ru.mirea.task14.opt2;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GameWithQueue
{
    static void InputCards(Queue<Integer> cards)
    {
        for (int i = 0; i < 5; i++)
        {
            cards.offer((int)(Math.random()*10));
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Первая колода карт: ");
        Queue<Integer> cards1 = new PriorityQueue<>();
        InputCards(cards1);
        System.out.println(cards1);
        System.out.print("Вторая колода карт: ");
        Queue<Integer> cards2 = new LinkedList<>();
        InputCards(cards2);
        System.out.println(cards2);

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++)
        {
            count++;
            if (cards1.element() > cards2.element() || ((cards1.element() == 0) && (cards2.element() == 9)))
            {
                cards1.offer(cards1.element());
                cards1.offer(cards2.element());
            }
            else if (cards1.element() < cards2.element() || ((cards1.element() == 9) && (cards2.element() == 0)))
            {
                cards2.offer(cards2.element());
                cards2.offer(cards1.element());
            }
            cards1.remove();
            cards2.remove();

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