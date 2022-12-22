package ru.mirea.task26;

public class CreditPayment extends Payment
{

    public CreditPayment()
    {
        super(new CreditPaymentStrategy());
    }
}