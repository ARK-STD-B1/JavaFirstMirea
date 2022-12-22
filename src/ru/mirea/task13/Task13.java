package ru.mirea.task13;
import java.util.*;
import java.lang.reflect.Array;

public class Task13
{
    static void ArrayList()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            arrayList.add((int)(Math.random()*100));
        }
        System.out.println("Исходная коллекция: " + arrayList.toString());
        System.out.println("Длина коллекции = " + arrayList.size());
        System.out.println("Элемент под индексом 1 = " + arrayList.get(1));
        arrayList.set(8,10);
        System.out.println("Замена элемента под индексом 8 на значение 10: " + arrayList.toString());
        arrayList.remove(5);
        System.out.println("Удаление элемента под индексом 5: " + arrayList.toString());
        arrayList.sort(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1 - o2;
            }
        });
        System.out.println("Отсортированная коллекция: " + arrayList.toString());
    }

    static void LinkedList()
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++)
        {
            linkedList.push((int)(Math.random()*100));
        }
        System.out.println("Исходная коллекция: " + linkedList.toString());
        System.out.println("Длина коллекции = " + linkedList.size());
        System.out.println("Элемент под индексом 2 = " + linkedList.get(2));
        linkedList.set(8,10);
        System.out.println("Замена элемента под индексом 8 на значение 10: " + linkedList.toString());
        linkedList.remove(5);
        System.out.println("Удаление элемента под индексом 5: " + linkedList.toString());
        linkedList.remove(linkedList.removeFirst());
        linkedList.remove(linkedList.removeLast());
        System.out.println("Удаление первого и последнего элемента: " + linkedList.toString());
        linkedList.sort(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1 - o2;
            }
        });
        System.out.println("Отсортированная коллекция: " + linkedList.toString());
    }

    static class MyList<T>
    {
        private final int size;
        private int actual_size = 0;
        private final T[] array;

        public MyList(Class<T> c, int size)
        {
            array = (T[]) Array.newInstance(c, size);
            this.size = size;
        }

        public void add(T item)
        {
            int i = 0;
            while (i < size && array[i] != null)
            {
                ++i;
            }
            if (size == i)
            {
                System.out.println("Не достаточно места");
                return;
            }
            actual_size = i+1;
            array[i] = item;
        }

        public T get(int i)
        {
            return array[i];
        }

        public void set(int i, T item)
        {
            array[i] = item;
        }

        public void remove(T item)
        {
            int i = 0;
            while (i < size && array[i] != item)
            {
                ++i;
            }

            if (size == i)
            {
                System.out.println("Нет такого числа со значением(" + item + ")");
                return;
            }
            if (size - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, size - 1 - i);
            array[size - 1] = null;
            actual_size--;
        }

        public int size()
        {
            return actual_size;
        }

        @Override
        public String toString() {
            String out = "[" + array[0];
            for(int i = 1; i < size(); i++)
            {
                out += ", " + array[i];
            }
            out += "]";
            return out;
        }
    }

    public static void main(String[] args)
    {
        ArrayList();
        System.out.println();
        LinkedList();
        System.out.println();
        MyList<Integer> myList = new MyList<>(Integer.class, 10);
        for (int i = 0; i < 10; i++)
        {
            myList.add((int)(Math.random()*100));
        }
        System.out.println("Исходная коллекция: " + myList.toString());
        System.out.println("Длина коллекции = " + myList.size());
        System.out.println("Элемент под индексом 4 = " + myList.get(4));
        myList.set(8, 5);
        System.out.println("Замена элемента под индексом 8 на значение 5: " + myList.toString());
        myList.remove(5);
        System.out.println("Удаление элемента со значением 5: " + myList.toString());
    }
}