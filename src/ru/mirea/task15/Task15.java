package ru.mirea.task15;
import java.io.*;
import java.util.Scanner;

public class Task15
{
    public static int Menu()
    {
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания:");
        System.out.println("1 - Реализовать запись в файл введённой с клавиатуры информации");
        System.out.println("2 - Реализовать вывод информации из файла на экран");
        System.out.println("3 - Заменить информацию в файле на информацию, введённую с клавиатуры.");
        System.out.println("4 - Добавить в конец исходного файла текст, введённый с клавиатуры.");
        System.out.println("0 - Выход из программы");
        while (true)
        {
            System.out.print("Введите число от 0 до 4: ");
            if (scanner.hasNextInt())
            {
                menu = scanner.nextInt();
                if (menu >= 0 && menu <= 4)
                {
                    return menu;
                }
                else
                {
                    System.out.println("Число вне допустимого диапазона значений. Повторите ввод.");
                    scanner.next();
                }
            }
            else
            {
                System.out.println("Неверный ввод.");
                scanner.next();
            }
        }
    }

    static void writerToF(String ptf, boolean tf)
    {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter(ptf, tf))
        {
            String info = scanner.nextLine();
            while (!info.equals("exit"))
            {
                writer.write(info + "\n");
                info = scanner.nextLine();
            }
            writer.flush();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException
    {
        String pathToFile = "src/ru/mirea/task15/Test.txt";
        int menu;
        while (true)
        {
            menu = Menu();
            if (menu == 0)
            {
                System.out.println("Выход из программы.");
                break;
            }
            switch (menu)
            {
                case 1 ->
                {
                    System.out.println("Введите информацию, которую хотите записать, для остановки записи введите (exit):");
                    writerToF(pathToFile, true);
                    System.out.println();
                }
                case 2 ->
                {
                    try (FileReader reader = new FileReader(pathToFile)) {
                        System.out.println("Информация, находящаяся в файле:");
                        int c;
                        while ((c = reader.read()) != -1) {
                            System.out.print((char) c);
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println();
                }
                case 3 ->
                {
                    System.out.println("Введите новую информацию, которую хотите записать, для остановки записи введите (exit):");
                    writerToF(pathToFile, false);
                    System.out.println();
                }
                case 4 ->
                {
                    System.out.println("Введите информацию, которую хотите записать в конец файла, для остановки записи введите (exit):");
                    writerToF(pathToFile, true);
                    System.out.println();
                }
                default -> System.out.println("Задание не выбрано.");
            }
        }
    }
}