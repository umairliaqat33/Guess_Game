package com.company.Railway;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Freight_Rates {

    JFrame freightFrame;
    JLabel bg;
    JPanel freightPanel;
    JLabel freightRatesLabel;
    JTextField commodityField;
    JTextField fromStationField;
    JTextField toStationField;
    JButton proceedButton;


    public Freight_Rates(){
        bg=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\Railway wallpaper.jpg"));
        freightFrame=new JFrame("Freight Rates");
        freightFrame.setContentPane(bg);
        freightPanel=new JPanel();
        freightRatesLabel=new JLabel("Freight Rates");
        commodityField=new JTextField("Enter Commodity");
        fromStationField=new JTextField("From station");
        toStationField=new JTextField("To station");
        proceedButton=new JButton("Proceed");

    }

    public void installFreightScreen(){
        freightFrame.setDefaultCloseOperation(freightFrame.EXIT_ON_CLOSE);
        freightFrame.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));
        freightFrame.setBounds(350,50,800,400);
        freightFrame.setVisible(true);
        setFreightPanel();
    }

    void setFreightPanel(){
        Border black;
        black=BorderFactory.createLineBorder(Color.BLACK);
//        freightPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        freightPanel.setPreferredSize(new Dimension(300,200));
        freightPanel.setBackground(Color.WHITE);
        freightPanel.setBorder(black);
        freightRatesLabel.setForeground(Color.decode("#009900"));
        freightRatesLabel.setFont(new Font("Open Sans",Font.BOLD,20));
        commodityField.setColumns(20);
        toStationField.setColumns(20);
        fromStationField.setColumns(20);
        proceedButton.setBackground(Color.orange);
        proceedButton.setForeground(Color.decode("#009900"));
        proceedButton.setPreferredSize(new Dimension(100,40));
        proceedButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        freightPanel.add(freightRatesLabel);
        freightPanel.add(commodityField);
        freightPanel.add(fromStationField);
        freightPanel.add(toStationField);
        freightPanel.add(proceedButton);
        freightFrame.add(freightPanel);
    }


}
