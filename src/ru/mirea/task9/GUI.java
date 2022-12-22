package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI
{
    JFrame jf = new JFrame("Football match");
    JPanel jp = new JPanel();
    JButton jbz = new JButton("FC Barcelona");
    JButton jbs = new JButton("FC Real Madrid");
    JLabel jlr = new JLabel();
    int countz = 0;
    int counts = 0;

    JPanel jps = new JPanel();
    JLabel jls = new JLabel();
    JLabel jlw = new JLabel();
    int f = 0;

    public GUI()
    {
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setSize(400, 100);
        jf.setLocationRelativeTo(null);
        jf.add(jp, BorderLayout.CENTER);
        jf.add(jps, BorderLayout.SOUTH);
        jp.add(jbz);
        jp.add(jlr);
        jp.add(jbs);
        jps.add(jls);
        jps.add(jlw);
        jlr.setText("Result: " + countz + 'X' + counts);
        jbz.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                countz++;
                jlr.setText("Result: " + countz + 'X' + counts);
                jls.setText("Last Scorer: " + jbz.getText());
                if (countz == 10 && f == 0)
                {
                    f++;
                    jlw.setText("Winner: " + jbz.getText());
                    jbz.setEnabled(false);
                    jbs.setEnabled(false);
                }
            }
        });
        jbs.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                counts++;
                jlr.setText("Result: " + countz + 'X' + counts);
                jls.setText("Last Scorer: " + jbs.getText());
                if (counts == 10 && f == 0)
                {
                    f++;
                    jlw.setText("Winner: " + jbs.getText());
                    jbz.setEnabled(false);
                    jbs.setEnabled(false);
                }
            }
        });
    }

    public static void main(String[] args)
    {
        new GUI();
    }
}