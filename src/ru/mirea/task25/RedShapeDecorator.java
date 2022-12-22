package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator
{
    public RedShapeDecorator(Shape shape)
    {
        super(shape);
    }

    @Override
    void draw()
    {
        shape.draw();
    }

    void setRedBoarder()
    {
        System.out.println("Фигура окрашена в красный");
    }
}