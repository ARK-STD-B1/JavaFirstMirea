package ru.mirea.task25;

public class DecoratorPatternDemo
{
    public static void main(String[] args)
    {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);

        System.out.println();
        redCircle.draw();
        redCircle.setRedBoarder();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-");
        redRectangle.draw();
        redRectangle.setRedBoarder();
    }
}