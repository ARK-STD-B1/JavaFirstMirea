package ru.mirea.task14.opt1;
import java.util.Scanner;
import java.util.Stack;

public class GameWithStack
{
    static void InputCards(Stack<Integer> cards)
    {
        for (int i = 0; i < 5; i++)
        {
            cards.add((int)(Math.random()*10));
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Первая колода карт: ");
        Stack<Integer> cards1 = new Stack<>();
        InputCards(cards1);
        System.out.println(cards1);
        System.out.print("Вторая колода карт: ");
        Stack<Integer> cards2 = new Stack<>();
        InputCards(cards2);
        System.out.println(cards2);

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (cards1.get(0) > cards2.get(0) || ((cards1.get(0) == 0) && (cards2.get(0) == 9)))
            {
                cards1.push(cards1.get(0));
                cards1.push(cards2.get(0));
            }
            else if (cards1.get(0) < cards2.get(0) || ((cards1.get(0) == 9) && (cards2.get(0) == 0)))
            {
                cards2.push(cards2.get(0));
                cards2.push(cards1.get(0));
            }
            cards1.remove(0);
            cards2.remove(0);

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