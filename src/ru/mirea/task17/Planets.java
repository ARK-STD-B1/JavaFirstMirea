package ru.mirea.task17;
import java.util.Scanner;

public class Planets
{
    enum Planet
    {
        Mercury(3.3*Math.pow(10,23), 2.4*Math.pow(10,6)),
        Venus(4.9*Math.pow(10,24), 6.1*Math.pow(10,6)),
        Earth(6*Math.pow(10,24), 6.4*Math.pow(10,6)),
        Mars(3.4*Math.pow(10,23),3.4*Math.pow(10,6)),
        Jupiter(1.9*Math.pow(10,27),71*Math.pow(10,6)),
        Saturn(5.7*Math.pow(10,26),60*Math.pow(10,6)),
        Uranus(8.7*Math.pow(10,25),26*Math.pow(10,6)),
        Neptune(Math.pow(10,26),25*Math.pow(10,6));
        public final double mass;
        public final double radius;
        Planet (double mass, double radius)
        {
            this.mass = mass;
            this.radius = radius;
        }

        public String getInfo()
        {
            return "Масса в кг = " + mass + "\nРадиус в м = " + radius + "\nСила притяжения = " + 6.67*Math.pow(10, -11)*(this.mass/Math.pow(this.mass,2));
        }
    }

    public static int InputMenu()
    {
        int menu;
        System.out.println("Получить информацию о планете");
        System.out.println("1 - Меркурий");
        System.out.println("2 - Венера");
        System.out.println("3 - Земля");
        System.out.println("4 - Марс");
        System.out.println("5 - Юпитер");
        System.out.println("6 - Сатурн");
        System.out.println("7 - Уран");
        System.out.println("8 - Нептун");
        System.out.println("0 - Выход");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Введите число от 0 до 8: ");
            if (scanner.hasNextInt())
            {
                menu = scanner.nextInt();
                if (menu >= 0 && menu <= 8)
                    return menu;
                else
                {
                    System.out.println("Число вне допустимого диапазона значений. Повторите ввод.");
                }
            }
            else
            {
                System.out.println("Неверный ввод, повторите.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args)
    {
        int menu;
        while (true)
        {
            menu = InputMenu();
            if (menu == 0)
            {
                System.out.println("Задание не выбрано\nВыход из программы...");
                break;
            }
            switch (menu)
            {
                case 1 -> System.out.println("Меркурий:\n" + Planet.Mercury.getInfo());
                case 2 -> System.out.println("Венера:\n" + Planet.Venus.getInfo());
                case 3 -> System.out.println("Земля:\n" + Planet.Earth.getInfo());
                case 4 -> System.out.println("Марс:\n" + Planet.Mars.getInfo());
                case 5 -> System.out.println("Юпитер:\n" + Planet.Jupiter.getInfo());
                case 6 -> System.out.println("Сатурн:\n" + Planet.Saturn.getInfo());
                case 7 -> System.out.println("Уран:\n" + Planet.Uranus.getInfo());
                case 8 -> System.out.println("Нептун:\n" + Planet.Neptune.getInfo());
                default -> System.out.println("Задание не выбрано\nВыход из программы...");
            }
        }
    }
}