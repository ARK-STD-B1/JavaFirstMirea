package ru.mirea.task8.opt2;
import javax.swing.*;

public class ShowImage extends JFrame
{
    public ShowImage(String title)
    {
        super(title);
    }

    public static void main(String[] args)
    {
        JFrame frame = new ShowImage("Показываем картинку");
        ImageIcon icon = new ImageIcon(args[0]);
        JPanel panel = new JPanel();
        panel.add(new JLabel(icon));
        frame.add(panel);
        frame.setSize(icon.getIconWidth(), icon.getIconHeight());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
