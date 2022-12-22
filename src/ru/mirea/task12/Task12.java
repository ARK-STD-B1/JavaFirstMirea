package ru.mirea.task12;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.arraycopy;

class Student
{
    public int finalPoints;

    Student()
    {
        finalPoints = (int)(Math.random()*100);
    }

    public int getID()
    {
        return finalPoints;
    }

    @Override
    public String toString()
    {
        return "Student {" +
                "FinalPoints=" + finalPoints +
                '}';
    }
}

public class Task12
{
    static void insertionSort(Student[] array)
    {
        for (int left = 0; left < array.length; left++)
        {
            Student student = array[left];
            int i = left - 1;
            for (; i >= 0; i--)
            {
                if (student.finalPoints < array[i].finalPoints)
                {
                    array[i + 1] = array[i];
                }
                else
                {
                    break;
                }
            }
            array[i + 1] = student;
        }
    }

    static void quickSort(Student[] array)
    {
        Comparator<Student> comp = Collections.reverseOrder(new SortingStudentsByGPA());
        Arrays.sort(array, comp);
    }

    static Student[] join(Student[] a, Student[] b)
    {
        Student[] c = new Student[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        return c;
    }

    static void mergeSort(Student[] a, int n)
    {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++)
        {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++)
        {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    static void merge(Student[] a, Student[] l, Student[] r, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
        {
            if (l[i].finalPoints <= r[j].finalPoints)
            {
                a[k++] = l[i++];
            }
            else
            {
                a[k++] = r[j++];
            }
        }
        while (i < left)
        {
            a[k++] = l[i++];
        }
        while (j < right)
        {
            a[k++] = r[j++];
        }
    }

    static int Menu()
    {
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер сортировки:\n1 - Cортировка вставками\n2 - Быстрая сортировка\n3 - Сортировка слиянием");
        while(true)
        {
            System.out.print("Введите число от 0 до 3: ");
            if (scanner.hasNextInt())
            {
                menu=scanner.nextInt();
                if (menu>=0 && menu<=3)
                {
                    return menu;
                }
                else
                {
                    System.out.println("Вы ввели не допустимое число. Повторите ввод.");
                    scanner.next();
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
        while (true)
        {
            Student[] iDnumber = new Student[10];
            Student[] iDnumber1 = new Student[10];
            for (int i = 0; i < iDnumber.length; i++)
            {
                iDnumber[i] = new Student();
                iDnumber1[i] = new Student();
            }

            int menu;
            menu = Menu();
            if (menu == 0)
            {
                System.out.println("Выход из программы.");
                break;
            }
            switch (menu) {
                case 1: {
                    System.out.println("\nВыбрана сортировка вставками");
                    System.out.println("Иcходный массив: ");
                    System.out.println(Arrays.toString(iDnumber));
                    insertionSort(iDnumber);
                    System.out.println("Отсортированный массив: ");
                    System.out.println(Arrays.toString(iDnumber));
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("\nВыбрана быстрая сортировка");
                    System.out.println("Иcходный массив: ");
                    System.out.println(Arrays.toString(iDnumber));
                    quickSort(iDnumber);
                    System.out.println("Отсортированный массив: ");
                    System.out.println(Arrays.toString(iDnumber));
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("\nВыбрана сортировка слиянием");
                    System.out.println("Первый иcходный массив: ");
                    System.out.println(Arrays.toString(iDnumber));
                    System.out.println("Второй иcходный массив: ");
                    System.out.println(Arrays.toString(iDnumber1));
                    System.out.println("Отсортированный массив: ");
                    Student[] arrC = join(iDnumber, iDnumber1);
                    mergeSort(arrC, arrC.length);
                    System.out.println(Arrays.toString(arrC));
                    System.out.println();
                    break;
                }
                default: {
                    System.out.println("Задание не выбрано");
                    break;
                }
            }
        }
    }
}