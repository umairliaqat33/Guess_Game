package com.company.Guess_Game_graphical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Difficulty_mode {
    JButton[] easy;
    JFrame DiffFrame;
    JLabel bg;

    JLabel userName;


    public Difficulty_mode() {
        DiffFrame = new JFrame("Guess Game Difficulty Mode");
        bg = new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\GUESSING+GAME.jpg"));
        DiffFrame.setContentPane(bg);
        DiffFrame.setDefaultCloseOperation(DiffFrame.EXIT_ON_CLOSE);


        userName = new JLabel("Welcome " + "Username");
        userName.setForeground(Color.WHITE);
        userName.setBounds(210, 150, 200, 30);
        DiffFrame.add(userName);

        easy = new JButton[3];
        easy[0] = new JButton("Easy");
        easy[0].addActionListener(new easy());
        easy[0].setBounds(210, 200, 100, 20);
        easy[0].setBackground(Color.orange);
        DiffFrame.add(easy[0]);

        easy[1] = new JButton("Medium");
        easy[1].addActionListener(new medium());
        easy[1].setBounds(210, 240, 100, 20);
        easy[1].setBackground(Color.orange);
        DiffFrame.add(easy[1]);

        easy[2] = new JButton("Difficult");
        easy[2].addActionListener(new difficult());
        easy[2].setBounds(210, 280, 100, 20);
        easy[2].setBackground(Color.orange);
        DiffFrame.add(easy[2]);


        DiffFrame.setBounds(100, 0, 400, 400);
        DiffFrame.setResizable(false);
        DiffFrame.setSize(500, 500);
        DiffFrame.setLocation(100, 100);
        DiffFrame.getContentPane().setLayout(null);
        DiffFrame.setVisible(true);
    }

    private class easy implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DiffFrame.dispose();
            Grid g = new Grid(3);
            g.installGridScreen();
        }
    }

    private class medium implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DiffFrame.dispose();
            Grid g = new Grid(5);
            g.installGridScreen();
        }
    }

    private class difficult implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DiffFrame.dispose();
            Grid g = new Grid(8);
            g.installGridScreen();
        }
    }
}

