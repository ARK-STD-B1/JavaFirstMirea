package ru.mirea.task4.Balls;
import java.util.Scanner;

public class TestBall
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Ball ball = new Ball();
        double x, y, x1, y1;
        System.out.print("Введите начальные координаты мяча по x: ");
        x = input.nextDouble();
        System.out.print("y: ");
        y = input.nextDouble();
        ball.setXY(x, y);
        System.out.println(ball.toString());
        System.out.print("Введите координаты, на которые должен сдвинуться мяч по x: ");
        x1 = input.nextDouble();
        System.out.print("y: ");
        y1 = input.nextDouble();
        ball.move(x1, y1);
        System.out.print(ball.toString());
    }
}