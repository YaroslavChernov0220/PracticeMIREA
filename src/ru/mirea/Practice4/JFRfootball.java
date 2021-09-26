package ru.mirea.Practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JFRfootball extends JFrame{
    JButton RealMadrid = new JButton("Real Madrid");
    JButton ACMilan = new JButton("AC Milan");

    JLabel Score = new JLabel();
    JLabel WinFT = new JLabel();
    JLabel LastGoal = new JLabel();

    int MilanGoal = 0, MadridGoal = 0;

    public JFRfootball() {
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(5, 3));
        add(RealMadrid);
        setSize(1600,700);

        newScore();
        newWinFT();

        ACMilan.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++MilanGoal;
                newWinFT();
                newScore();
                newLastGoal("AC Milan");
            }
        });

        RealMadrid.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MadridGoal++;
                newWinFT();
                newScore();
                newLastGoal("Real Madrid");
            }
        });

        Font fnt = new Font("Arial Black",Font.BOLD,15);
        Font fnt22 = new Font("Arial Black",Font.BOLD,15);
        add(WinFT);
        WinFT.setVerticalAlignment(JLabel.CENTER);
        WinFT.setHorizontalAlignment(JLabel.CENTER);
        WinFT.setFont(fnt22);
        add(ACMilan);
        add(Score);
        Score.setVerticalAlignment(JLabel.CENTER);
        Score.setHorizontalAlignment(JLabel.CENTER);
        Score.setFont(fnt);
        add(LastGoal);
        LastGoal.setVerticalAlignment(JLabel.CENTER);
        LastGoal.setHorizontalAlignment(JLabel.CENTER);
        LastGoal.setFont(fnt22);
    }

    public void newWinFT() {
        if (MilanGoal > MadridGoal)
            WinFT.setText("Winner - AC Milan");
        else if (MilanGoal < MadridGoal)
            WinFT.setText("Winner - Real Madrid");
        else
            WinFT.setText("Draw");
    }

    public void newLastGoal(String comand) {
        LastGoal.setText("Last goal " + comand);
    }

    public void newScore() {
        Score.setText( MadridGoal + "X" + MilanGoal);
    }

    public static void main(String[] args) {
        new JFRfootball().setVisible(true);
    }
}
