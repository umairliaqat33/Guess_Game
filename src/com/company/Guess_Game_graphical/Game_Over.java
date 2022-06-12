package com.company.Guess_Game_graphical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game_Over {
    JFrame gFrame;
    JButton exit;
    JLabel bg;

    JPanel exitPanel;

    JLabel exitLabel;
    public Game_Over() {
        gFrame=new JFrame("Game Over");
        bg=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\GUESSING+GAME.jpg"));
        gFrame.setContentPane(bg);
        exit=new JButton("Exit");
        exit.addActionListener(new exitAction());
        exitLabel=new JLabel("Game Over");
        exitPanel=new JPanel();
    }

    public void install() {
        gFrame.setVisible(true);
        gFrame.setLayout(new GridLayout(2,1));
        gFrame.setBounds(400,100,400,400);
        gFrame.setDefaultCloseOperation(gFrame.EXIT_ON_CLOSE);
        gFrame.setResizable(false);
        exitPart();
    }

    void exitPart(){
        exitPanel.setOpaque(false);
        exitPanel.setLayout(new FlowLayout(FlowLayout.CENTER,100,40));
        exitLabel.setFont(new Font("Open Sans",Font.BOLD,40));
        exitLabel.setForeground(Color.orange);
        exit.setBackground(Color.orange);
        exit.setBorder(BorderFactory.createLineBorder(Color.black));
        exit.setForeground(Color.white);
        exit.setFont(new Font("Open Sans",Font.BOLD,30));
        exit.setPreferredSize(new Dimension(80,40));
        exitPanel.add(exitLabel);
        exitPanel.add(exit);
        gFrame.add(exitPanel);
    }

    private class exitAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            gFrame.dispose();
        }
    }
}
