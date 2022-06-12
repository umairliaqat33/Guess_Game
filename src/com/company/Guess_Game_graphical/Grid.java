package com.company.Guess_Game_graphical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.Timer;

public class Grid {
    Timer timer;
    JFrame gridFrame;
    JLabel bg;
    Icon icon;
    JPanel[] gridPanels;
    JButton[] gridButtons;
    JLabel[] gridLabel;
    JButton reset;
    JButton quit;
    int number;
    int h=0;
    int w=0;
    JButton start;
    Guess_Gam gg=new Guess_Gam();


    public Grid(int n){
        number=n;
        gg=new Guess_Gam(number*number);
        icon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\question.png");
        bg=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\GUESSING+GAME.jpg"));
        gridFrame=new JFrame();
        gridFrame.setContentPane(bg);
        gridPanels=new JPanel[6];
        gridLabel=new JLabel[12];
        gridButtons=new JButton[number*number];
        reset=new JButton("Reset");
        quit=new JButton("Quit");
        start=new JButton("Start");
        timer=new Timer();
    }
    int secondPassed=0;
    int minute;
    TimerTask task=new TimerTask() {
        @Override
        public void run() {         //here we put what we want to do with timer or when we want it to stop most of the time.
            secondPassed++;
            gridLabel[5].setText("0"+minute+":"+secondPassed+"/2:00");
            if(secondPassed>=60){
                minute++;
                secondPassed=0;
                gridLabel[5].setText("0"+minute+":"+secondPassed+"/2:00");
                if(minute>1){
                    gridLabel[5].setText("0"+minute+":"+secondPassed+"/2:00");
                    secondPassed=0;
                    timer.cancel();
                    for (JButton gridButton : gridButtons) {
                        gridButton.setEnabled(false);
                    }
                }
            }
        }
    };
    void start(){
        timer.scheduleAtFixedRate(task,1000,1000);
    }

    int height(){               //this function is used to set height according to grid size
        if(number==3){
            h=number*180;
            return h;
        }else if(number==5){
            h=number*135;
            return h;
        }else {
            h=number*103;
            return h;
        }
    }

    int width(){                //this function is used to set width according to grid size
        if(number==3){
            w=number*200;
            return w;
        }else if(number==5){
            w=number*100;
            return w;
        }else {
            w=number*128;
            return w;
        }
    }

    public void installGridScreen(){
        gridFrame.setLayout(new FlowLayout(FlowLayout.CENTER,200,80));
        gridFrame.setBounds(300,100,width(),height());
        gridFrame.setDefaultCloseOperation(gridFrame.EXIT_ON_CLOSE);
        gridPanels[0]=new JPanel();
        gridPanels[0].setOpaque(false);
        gridPanels[0].setLayout(new GridLayout(5,1));
        setButtons();
        setKeysLabel();
        setAttemptsLabel();
        setTimeLabel();
        setBottomButtons();
        gridFrame.add(gridPanels[0]);
        gridFrame.setResizable(false);
        gridFrame.setVisible(true);

    }


    void setButtons(){
        gridPanels[1]=new JPanel();
        gridPanels[1].setOpaque(false);
//        gridPanels[1].setBounds(40,40,100,100);
        gridPanels[1].setLayout(new GridLayout(number,number,30,5));
        for(int i=0;i<number*number;i++){
            gridButtons[i]=new JButton(icon);
            gridButtons[i].setBorder(BorderFactory.createLineBorder(Color.orange,3));
            gridButtons[i].addActionListener(new Action(i));
            gridButtons[i].setPreferredSize(new Dimension(60,60));
            gridButtons[i].setEnabled(false);
            gridPanels[1].add(gridButtons[i]);
        }
        gridFrame.add(gridPanels[1]);
    }

    void setKeysLabel(){
        gridPanels[2]=new JPanel();
        gridPanels[2].setLayout(new GridLayout(1,1,1,2));
        gridPanels[2].setOpaque(false);
        gridLabel[0]=new JLabel("Keys found: ");
        gridLabel[1]=new JLabel(gg.key_found+"/"+gg.key_percnt);
        gridLabel[1].setText(gg.key_found+"/"+gg.key_percnt);
        gridLabel[0].setForeground(Color.white);
        gridLabel[1].setForeground(Color.white);
        gridPanels[2].add(gridLabel[0]);
        gridPanels[2].add(gridLabel[1]);
        gridPanels[0].add(gridPanels[2]);
    }

    void setAttemptsLabel(){
        gridPanels[3]=new JPanel();
        gridPanels[3].setLayout(new GridLayout(1,2,10,0));
        gridPanels[3].setOpaque(false);
        gridLabel[2]=new JLabel("Attempts remaining: ");
        gridLabel[3]=new JLabel(gg.attempt_percnt+"/"+gg.total_attempts);
        gridLabel[2].setForeground(Color.white);
        gridLabel[3].setForeground(Color.white);
        gridPanels[3].add(gridLabel[2]);
        gridPanels[3].add(gridLabel[3]);
        gridPanels[0].add(gridPanels[3]);
    }


    void setTimeLabel(){
        gridPanels[4]=new JPanel();
        gridPanels[4].setLayout(new GridLayout(1,2,10,0));
        gridPanels[4].setOpaque(false);
        gridLabel[4]=new JLabel("Time Remaining: ");
        gridLabel[5]=new JLabel("00:00/2:00");
        gridLabel[4].setForeground(Color.white);
        gridLabel[5].setForeground(Color.white);
        gridPanels[4].add(gridLabel[4]);
        gridPanels[4].add(gridLabel[5]);
        gridPanels[0].add(gridPanels[4]);
    }

    void setBottomButtons(){
        gridPanels[5]=new JPanel();
        gridPanels[5].setLayout(new GridLayout(1,2,10,0));
        gridPanels[5].setOpaque(false);
        reset=new JButton("Reset");
        reset.addActionListener(new ResetAction());
        quit=new JButton("Quit");
        quit.addActionListener(new QuitAction());
        start.setBackground(Color.decode("#FFA500"));
        start.addActionListener(new TimerAction());
        gridPanels[5].add(reset);
        gridPanels[5].add(start);
        gridPanels[5].add(quit);
        gridPanels[0].add(gridPanels[5]);
    }

    public class Action implements ActionListener{
        String qry = "Select Name from user";
        String qry2 = "insert into user(Name,password) values(?,?)";
        int buttonNumber;           // in this variable we will b getting index of button pressed
        public Action(int b){
            buttonNumber=b;
        }           //used to get index of button
        @Override
        public void actionPerformed(ActionEvent e) {
            if(gg.attempt_percnt!=0 && gg.key_found!=gg.key_percnt&&minute!=2){             //same condition from code applied here to make button disable

                gridButtons[buttonNumber].setEnabled(false);
                gridLabel[1].setText(gg.key_found+"/"+gg.key_percnt);
                gridLabel[3].setText(gg.attempt_percnt+"/"+gg.total_attempts);
                gridButtons[buttonNumber].setBorder(BorderFactory.createLineBorder(gg.start_game(buttonNumber),3));
            }else{
//                gg.attempt_percnt=0;
                timer.cancel();                 //cancelling timer
                for (JButton gridButton : gridButtons) {
                    gridButton.setEnabled(false);
                }
                gridLabel[1].setText(gg.key_found+"/"+gg.key_percnt);
                gridLabel[3].setText(gg.attempt_percnt+"/"+gg.total_attempts);
                gridFrame.dispose();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","");
                    Statement stmt=connect.createStatement();
                    ResultSet rs=stmt.executeQuery(qry);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
                Game_Over game_over=new Game_Over();
                game_over.install();
            }
        }
    }
    public class TimerAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            start();
            start.setEnabled(false);        // after we have pressed start once it will disable
            for(int i=0;i<gridButtons.length;i++){
                gridButtons[i].setEnabled(true);
            }
        }
    }

    public class ResetAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            gridFrame.dispose();
            Difficulty_mode f=new Difficulty_mode();

        }
    }

    public class QuitAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            gridFrame.dispose();
            Game_Over game_over=new Game_Over();
            game_over.install();
        }
    }
}
