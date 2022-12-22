package ru.mirea.task3.opt2;
import java.util.Scanner;

public class HumanTester
{
    public static void main(String[] args)
    {
        CreateHuman();
    }

    public static void CreateHuman()
    {
        System.out.println("Создание человека");
        Scanner input = new Scanner(System.in);
        String gender, name, surname;
        int age, weight, height, fingers, toes;
        float sizeHand, sizeLeg;
        System.out.print("\tВведите пол человека (М/Ж): ");
        gender = input.next();
        System.out.print("\tВведите имя человека: ");
        name = input.next();
        System.out.print("\tВведите фамилию человека: ");
        surname = input.next();
        System.out.print("\tВведите возраст человека: ");
        age = InputInt();
        System.out.print("\tВведите вес человека: ");
        weight = InputInt();
        System.out.print("\tВведите рост человека: ");
        height = InputInt();
        Human human = new Human(gender, name, surname, weight, height, age);
        String eyes_color, hair_color;
        System.out.print("\tВведите цвет глаз человека: ");
        eyes_color = input.next();
        human.head.setEyesColor(eyes_color);
        System.out.print("\tВведите цвет волос человека: ");
        hair_color = input.next();
        human.head.setHairColor(hair_color);
        String answer;
        System.out.print("\tУ созданного человека есть шрам на лице? (Да/Нет): ");
        answer = input.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА") || answer.equals("дА"))
        {
            human.head.setHavingScars(true);
        }
        System.out.print("\tВведите количество пальцев на руках: ");
        fingers = InputInt();
        human.hand.setFingers(fingers);
        System.out.print("\tВведите количество пальцев на ногах: ");
        toes = InputInt();
        human.leg.setToes(toes);
        System.out.print("\tВведите размер кисти: ");
        sizeHand = InputInt();
        human.hand.setSizeHand(sizeHand);
        System.out.print("\tВведите размер стопы: ");
        sizeLeg = InputInt();
        human.leg.setSizeLeg(sizeLeg);

        HumanInfo(human);
    }

    public static int InputInt()
    {
        int n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        while (n <= 0)
        {
            System.out.print("Введите положительное число! ");
            n = input.nextInt();
        }
        return n;
    }

    public static void HumanInfo(Human human)
    {
        Scanner input = new Scanner(System.in);
        String answer;
        System.out.print("Желаете вывести информацию о созданном человека? (Да/Нет): ");
        answer = input.next();
        if (answer.equals("Да") || answer.equals("да") || answer.equals("ДА") || answer.equals("дА"))
        {
            System.out.println("Информация о созданном человеке");
            System.out.print(human.toString() + '\n' + human.head.toString() + '\n' + human.hand.toString() + '\n' + human.leg.toString());
            if(human.head.isHavingScars())
            {
                System.out.print("\n\tШрам: присутвует");
            }
            else if (!human.head.isHavingScars())
            {
                System.out.print("\n\tШрам: отсутсвует");
            }
        }
    }
}