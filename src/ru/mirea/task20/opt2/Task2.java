package ru.mirea.task20.opt2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2
{
    static void T2()
    {
        System.out.println("Второе упражнение");
        System.out.println("------------------------------------");
        System.out.println("Фамилия разработчика: Махмудов");
        Date start_time = new Date();
        start_time.setDate(15);
        start_time.setMonth(11);
        start_time.setHours(21);
        start_time.setMinutes(40);
        int mounth = new Date().getMonth()+1;
        System.out.println("Задание получено: " + start_time.getDate() + "." + start_time.getMonth() + " " + start_time.getHours() + ":" + start_time.getMinutes());
        System.out.println("Задание сдано:    " + new Date().getDate() + "." + mounth + " " + new Date().getHours() + ":" + new Date().getMinutes());
        System.out.println("------------------------------------");
    }

    public static void main(String[] args)
    {
        T2();
    }
}