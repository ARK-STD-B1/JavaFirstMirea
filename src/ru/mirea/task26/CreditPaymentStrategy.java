package ru.mirea.task26;
import java.util.Scanner;

public class CreditPaymentStrategy implements PaymentStrategy
{
    @Override
    public void askData()
    {
        System.out.println("Введите данные кредитной карты");
        Scanner scanner = new Scanner(System.in);
        int number, year, month, cvv;
        System.out.print("Введите номер карты: ");
        number = scanner.nextInt();
        System.out.println("-----Введите срок действия карты-----");
        System.out.print("Месяц: ");
        month = scanner.nextInt();
        System.out.print("Год: ");
        year = scanner.nextInt();
        System.out.println("________________");
        System.out.print("Введите CVV: ");
        cvv = scanner.nextInt();
        System.out.println("Введите \"ПОДТВЕРДИТЬ\", чтобы подтвердить покупку");
        String agreement = scanner.next();
        if (agreement.equals("ПОДТВЕРДИТЬ"))
        {
            System.out.println("Заказ оформлен. Благодарим за покупку!");
        }
        else
        {
            System.out.println("Оплата не подтверждена!");
        }
    }
}