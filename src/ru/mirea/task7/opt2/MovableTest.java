package ru.mirea.task7.opt2;

public class MovableTest
{
    public static void main(String[] args)
    {
        MovablePoint mp = new MovablePoint(10,10, 10, 10);
        System.out.println("Начальное положение точки: " + mp.toString());
        mp.moveDown();
        mp.moveLeft();
        mp.moveUp();
        mp.moveLeft();
        mp.moveRight();
        System.out.println("Конечное положение точки: " + mp.toString());
        System.out.println();
        MovableCircle mc = new MovableCircle(20, 10, 10, 10, 5);
        System.out.println("Начальное положение окружности: " + mc.toString());
        mc.moveDown();
        mc.moveLeft();
        mc.moveUp();
        mc.moveLeft();
        mc.moveRight();
        System.out.println("Конечное положение окружности: " + mc.toString());
        System.out.println();
        MovableRectangle mr = new MovableRectangle(10, 20, 20, 20, 10, 10);
        System.out.println("Начальное положение прямоугольника: " + mr.toString());
        mr.moveDown();
        mr.moveLeft();
        mr.moveUp();
        mr.moveLeft();
        mr.moveRight();
        System.out.println("Конечное положение прямоугольника: " + mr.toString());
    }
}