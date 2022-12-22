package ru.mirea.task27.opt1;
import java.util.ArrayList;
import java.util.HashMap;

public class Task27_1
{
    public static void main(String[] args)
    {
        HashMap<String, String> people = new HashMap<>();

        people.put("Махмудов", "Амир");
        people.put("Ермаченков", "Василий");
        people.put("Чернышов", "Даниил");
        people.put("Ермаков", "Андрей");
        people.put("Дамарад", "Даниил");
        people.put("Кветинский", "Илья");
        people.put("Демиденко", "Данила");
        people.put("Ророноа", "Зоро");
        people.put("Казанцев", "Никита");
        people.put("Лугавой", "Дмитрий");
        System.out.println("Список до коррекции:\n"+people);

        ArrayList<String> toDelete = new ArrayList<>();
        for (String surname:people.keySet())
        {
            String name = people.get(surname);
            for (String surname2:people.keySet())
            {
                String name2 = people.get(surname2);
                if (name2.equals(name) && !surname.equals(surname2))
                {
                    toDelete.add(surname);
                }
            }
        }
        for(String surname:toDelete)
            people.remove(surname);
        System.out.println("Список после коррекции:\n"+people);
        people.clear();
    }
}