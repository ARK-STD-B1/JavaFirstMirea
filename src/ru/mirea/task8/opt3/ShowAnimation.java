package ru.mirea.task8.opt3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class ShowAnimation extends JFrame
{
    public ShowAnimation(String title)
    {
        super(title);
    }

    public static void main(String[] args)
    {
        JFrame frame = new ShowAnimation("Показываем анимацию");

        String dir = "C:\\Users\\user\\Desktop\\Учёба\\2 курс\\Java\\Animation";
        String[] files = new File(dir).list();
        int num = files.length <= 10 ? files.length : 10;
        Image[] images = new Image[num];
        for (int i = 0; i < num; i++)
        {
            images[i] = Toolkit.getDefaultToolkit().createImage(dir + "\\" + files[i]);
        }

        Runnable run = new Runnable()
        {
            @Override
            public void run()
            {
                JPanel gui = new JPanel(new BorderLayout());
                JLabel anim = new JLabel(new ImageIcon(images[0]));
                gui.add(anim, BorderLayout.CENTER);

                ActionListener animate = new ActionListener()
                {
                    private int index = 0;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (index < images.length-1) {
                            index++;
                        } else {
                            index = 0;
                        }
                        anim.setIcon(new ImageIcon(images[index]));
                    }
                };
                final Timer timer = new Timer(100,animate);

                final JToggleButton b = new JToggleButton("Start/Stop");
                ActionListener startStop = new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (b.isSelected()) {
                            timer.start();
                        } else {
                            timer.stop();
                        }
                    }
                };
                b.addActionListener(startStop);
                gui.add(b, BorderLayout.PAGE_END);

                frame.add(gui);
                frame.setSize(256, 256);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(run);
    }
}