package ru.mirea.task11.opt1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNum
{
    JFrame frame = new JFrame("Угадайте число");
    JPanel panel = new JPanel();
    JTextField tf = new JTextField(10);
    JButton send = new JButton("Отправить");
    JTextArea ta = new JTextArea();
    int UnknownNumber = (int)Math.floor(Math.random() * 20);
    int TrysCount = 0;

    public static void main(String[] args)
    {
        new GuessNum();
    }

    public void Guessing(int i)
    {
        int UserNumber, f = 0;
        UserNumber = i;
        TrysCount++;

        if (UserNumber > UnknownNumber)
        {
            ta.append(Integer.toString(UserNumber) + '\n');
            ta.append("Моё число меньше. (Количество попыток: " + TrysCount + ")\n");
        }
        else if (UserNumber < UnknownNumber)
        {
            ta.append(Integer.toString(UserNumber) + '\n');
            ta.append("Моё число больше. (Количество попыток: " + TrysCount + ")\n");
        }
        else
        {
            ta.append(Integer.toString(UserNumber) + '\n');
            ta.append("Вы угадали! (Количество попыток: " + TrysCount + ")\n");
            f++;
            send.setEnabled(false);
        }

        if(TrysCount == 3 && f == 0)
        {
            ta.append("GameOver!");
            send.setEnabled(false);
        }
    }

    public GuessNum()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        ta.append("Угадайте чилсо от 0 до 20!\n");
        ta.setEditable(false);

        send.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String num = tf.getText();
                int gnum = Integer.parseInt(num);
                Guessing(gnum);
            }
        });

        panel.add(tf);
        panel.add(send);

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}