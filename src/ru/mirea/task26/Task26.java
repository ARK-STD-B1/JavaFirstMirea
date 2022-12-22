package ru.mirea.task26;
import java.util.Scanner;

public class Task26
{
    public static void main(String[] args)
    {
        int menu;
        System.out.println("Оформление заказа");
        System.out.println("Выберете способ оплаты");
        System.out.println("1 - Электронный кошелек");
        System.out.println("2 - Кредитная карта");
        System.out.println("0 - Выход");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Введите число от 0 до 2: ");
            if (scanner.hasNextInt())
            {
                menu = scanner.nextInt();
                if (menu >= 0 && menu <= 2)
                {
                    if (menu == 0)
                    {
                        System.out.println("Выход...");
                    }
                    switch (menu)
                    {
                        case 1 ->
                        {
                            Payment epayment = new EPayment();
                            epayment.askData();
                        }
                        case 2 ->
                        {
                            Payment creditpayment = new CreditPayment();
                            creditpayment.askData();
                        }
                        default -> {}
                    }
                }
                else
                {
                    System.out.print("Число вне допустимого диапазона значений. Повторите ввод.");
                }
            }
            else
            {
                System.out.print("Неверный ввод, повторите: ");
                scanner.next();
            }
        }
    }
}