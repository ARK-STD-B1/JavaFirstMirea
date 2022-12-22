package ru.mirea.task12;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.getID() - s2.getID();
    }
}