package ru.mirea.task11.opt2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseBorder
{
    public static void main(String[] args)
    {
        new MouseBorder();
    }

    private MouseBorder()
    {
        JFrame frame = new JFrame("Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        Container container = frame.getContentPane();

        JLabel north = new JLabel("NORTH" );
        north.setForeground(Color.BLUE);
        north.setHorizontalAlignment(JLabel.CENTER);
        north.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        mouseList(north);

        JLabel east = new JLabel("EAST");
        east.setForeground(Color.RED);
        east.setHorizontalAlignment(JLabel.CENTER);
        east.setBorder(BorderFactory.createLineBorder(Color.RED));
        mouseList(east);

        JLabel south = new JLabel("SOUTH");
        south.setForeground(Color.ORANGE);
        south.setHorizontalAlignment(JLabel.CENTER);
        south.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        mouseList(south);

        JLabel west = new JLabel("WEST" );
        west.setForeground(Color.YELLOW);
        west.setHorizontalAlignment(JLabel.CENTER);
        west.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        mouseList(west);

        JLabel center = new JLabel("CENTER" );
        center.setHorizontalAlignment(JLabel.CENTER);
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        mouseList(center);

        container.add(north, BorderLayout.NORTH);
        container.add(east, BorderLayout.EAST);
        container.add(south, BorderLayout.SOUTH);
        container.add(west, BorderLayout.WEST);
        container.add(center);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void mouseList(JLabel jl)
    {
        String s = jl.getText();
        jl.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                switch (s)
                {
                    case "NORTH" -> JOptionPane.showMessageDialog(jl, "Добро пожаловать в NORTH");
                    case "EAST" -> JOptionPane.showMessageDialog(jl, "Добро пожаловать в EAST");
                    case "SOUTH" -> JOptionPane.showMessageDialog(jl, "Добро пожаловать в SOUTH");
                    case "WEST" -> JOptionPane.showMessageDialog(jl, "Добро пожаловать в WEST");
                    case "CENTER" -> JOptionPane.showMessageDialog(jl, "Добро пожаловать в CENTER");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}