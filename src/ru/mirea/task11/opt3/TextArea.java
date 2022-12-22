package ru.mirea.task11.opt3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea implements ActionListener
{
    JFrame frame = new JFrame("Текстовое поле");
    JTextArea ta = new JTextArea();

    public static void main(String[] args)
    {
        new TextArea();
    }

    public TextArea()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(color());
        menuBar.add(font());

        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JMenu color()
    {
        JMenu color = new JMenu("Цвет");
        JMenuItem red = new JMenuItem("Красный");
        JMenuItem green = new JMenuItem("Зелёный");
        JMenuItem blue = new JMenuItem("Синий");

        color.add(red);
        color.add(green);
        color.add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        return color;
    }

    private JMenu font()
    {
        JMenu font = new JMenu("Шрифт");
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem times = new JMenuItem("Times New Roman");
        JMenuItem code = new JMenuItem("Cascadia Code");

        font.add(arial);
        font.add(times);
        font.add(code);

        arial.addActionListener(this);
        times.addActionListener(this);
        code.addActionListener(this);

        return font;
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        switch (s)
        {
            case "Красный" -> ta.setForeground(Color.RED);
            case "Зелёный" -> ta.setForeground(Color.GREEN);
            case "Синий" -> ta.setForeground(Color.BLUE);

            case "Arial" -> ta.setFont(new Font("Arial", Font.PLAIN, 14));
            case "Times New Roman" -> ta.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            case "Cascadia Code" -> ta.setFont(new Font("Cascadia Code", Font.PLAIN, 14));
        }
    }
}