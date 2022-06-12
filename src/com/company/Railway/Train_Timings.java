package com.company.Railway;

import javax.swing.*;
import java.awt.*;

public class Train_Timings {
    JFrame trainTimingsFrame;
    JLabel bg;
    JPanel trainTimingsMainPanel;
    JLabel trainTimingsLabel;
    JTextField trainTimingsField;
    JButton trainTimingsButton;

    public Train_Timings(){
        trainTimingsFrame=new JFrame("Train Timings");
        bg=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\Railway wallpaper.jpg"));
        trainTimingsFrame.setContentPane(bg);
        trainTimingsMainPanel=new JPanel();
        trainTimingsLabel=new JLabel("Train Timings");
        trainTimingsField=new JTextField("Destination");
        trainTimingsButton=new JButton("Check Timings");
    }

    public void setTrainTimingsFrame(){
        trainTimingsFrame.setDefaultCloseOperation(trainTimingsFrame.EXIT_ON_CLOSE);
        trainTimingsFrame.setBounds(300,50,800,400);
        trainTimingsFrame.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));
        trainTimingsFrame.setVisible(true);
        setTrainTimingsMainPanel();
    }

    void setTrainTimingsMainPanel(){
        trainTimingsMainPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        trainTimingsMainPanel.setPreferredSize(new Dimension(300,150));
        trainTimingsMainPanel.setBackground(Color.WHITE);
        trainTimingsLabel.setForeground(Color.decode("#009900"));
        trainTimingsLabel.setFont(new Font("Open Sans",Font.BOLD,20));
        trainTimingsField.setColumns(20);
        trainTimingsButton.setForeground(Color.decode("#009900"));
        trainTimingsButton.setBackground(Color.orange);
        trainTimingsButton.setPreferredSize(new Dimension(120,40));
        trainTimingsMainPanel.add(trainTimingsLabel);
        trainTimingsMainPanel.add(trainTimingsField);
        trainTimingsMainPanel.add(trainTimingsButton);
        trainTimingsFrame.add(trainTimingsMainPanel);
    }
}
