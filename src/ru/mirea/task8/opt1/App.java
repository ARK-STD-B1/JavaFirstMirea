package ru.mirea.task8.opt1;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class App extends JPanel
{
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public static void main(String[] args)
    {
        String shapeAmount = JOptionPane.showInputDialog(null,
                "Количество фигур?", "Случайные фигуры...", JOptionPane.PLAIN_MESSAGE);
        int amount = Integer.parseInt(shapeAmount);

        String shapes[] = {"Прямоугольники", "Круги", "Все фигуры"};
        String shape = (String) JOptionPane.showInputDialog(null,
                "Выберите фигуру, которую хотите вывести", "Случайные фигуры...",
                JOptionPane.PLAIN_MESSAGE, null, shapes, shapes[0]);

        JFrame frame = new JFrame();
        frame.add(new App(amount, shape));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public App(int i, String shape)
    {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 400));
        Random random = new Random();

        switch (shape) {
            case "Круги":
                for (int j = 0; j < i; j++) {
                    addCircle();
                }
                break;
            case "Прямоугольники":
                for (int j = 0; j < i; j++) {
                    addRectangle();
                }
                break;
            case "Все фигуры":
                for (int j = 0; j < i; j++)
                {
                    int number = random.nextInt(0, 2);
                    if(number == 1)
                    {
                        addCircle();
                    }
                    else
                    {
                        addRectangle();
                    }
                }
                break;

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setDoubleBuffered(true);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public void addRectangle() {
        Rectangle rect = new Rectangle();
        rect.setPos();
        shapes.add(rect);
    }

    public void addCircle() {
        Circle circle = new Circle();
        circle.setPos();
        shapes.add(circle);
    }
}