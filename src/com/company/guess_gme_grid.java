package com.company;

import javax.swing.*;
import java.awt.*;

public class guess_gme_grid {
    JFrame mFrame;
    JButton[] mButton;

    guess_gme_grid(){

    }
    guess_gme_grid(int number){
        mFrame=new JFrame("Grid Form");
        mButton=new JButton[number*number];
        JLabel bg;
        bg =new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\image_2022_04_29T18_28_10_128Z.png"));
        mFrame.setContentPane(bg);      //setting background
        mFrame.setBounds(300,200,400,400);
        for(int i=0;i<number*number;i++){
            mButton[i]=new JButton(""+(i+1));
            mFrame.add(mButton[i]);
        }
        mFrame.getContentPane().setBackground(Color.CYAN);              //setting background color
        mButton[1].setBackground(Color.yellow);
        mButton[1].doClick(10);
        mFrame.setLayout(new GridLayout(number,number,20,20));
        mFrame.setVisible(true);
    }
}
