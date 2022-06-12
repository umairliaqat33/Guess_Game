package com.company.Railway;

//import com.company.Guess_Game_graphical.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Railway_Login {
    JFrame LFrame;
    JLabel Username;
    JLabel Password;
    JLabel logo;
    JLabel registerLabel;
    JTextField userNameField;
    JPasswordField passwordField;
    JButton LoginButton;
    JLabel bg;

    JPanel p1,p2,p3,p4,p5;

    public Railway_Login() {

        LFrame = new JFrame("Guess Game Login");
        bg = new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\railway2.jpg"));
//        LFrame.getContentPane().setBackground(Color.pink);
        logo = new JLabel("Login");
        Username = new JLabel("User Name: ");
        Password = new JLabel("Password");
        registerLabel = new JLabel("Don't have an account? Game_Over");
        userNameField = new JTextField();
        passwordField = new JPasswordField();
        LoginButton = new JButton("Login");
        LoginButton.addActionListener(new Railway_Login.Railway_LoginActions());
//        bg = new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\guessGame.png"));
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
    }

    public  void installRailwayLogin(){
        LFrame.setContentPane(bg);
//        LFrame.add(logo);
        LFrame.setBounds(200,200,630,375);
        LFrame.setLayout(new GridLayout(5,1));
        LFrame.setVisible(true);
        LFrame.setResizable(false);
        LFrame.setDefaultCloseOperation(LFrame.EXIT_ON_CLOSE);
        install_Logo();
        setUsernamePanel();
        setPasswordPanel();
        setLoginButton();
        setRegisterLabel();
    }

    public void install_Logo(){
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        logo.setFont(new Font("Open Sans", Font.BOLD, 50));
        logo.setForeground(Color.black);
        p1.setOpaque(false);
        p1.add(logo);
        LFrame.add(p1);

    }

    public void setUsernamePanel(){
        p2.setLayout(new FlowLayout(FlowLayout.CENTER,70,0 ));
        Username.setFont(new Font("Open Sans", Font.BOLD, 20));
        Username.setForeground(Color.black);
        userNameField.setColumns(10);
        p2.setOpaque(false);
        p2.add(Username);
        p2.add(userNameField);
        LFrame.add(p2);
    }

    public void setPasswordPanel(){
        p3.setLayout(new FlowLayout(FlowLayout.CENTER,70,0));
        Password.setFont(new Font("Open Sans", Font.BOLD, 20));
        Password.setForeground(Color.black);
        passwordField.setColumns(10);
        p3.setOpaque(false);
        p3.add(Password);
        p3.add(passwordField);
        LFrame.add(p3);
    }

    public void setLoginButton(){
        LoginButton.setBorder(BorderFactory.createLineBorder(Color.white,3));
        LoginButton.setBackground(Color.orange);
        LoginButton.setForeground(Color.white);
        LoginButton.setFont(new Font("Open Sans", Font.BOLD, 20));
        LoginButton.setPreferredSize(new Dimension(80,40));
        p4.setOpaque(false);
        p4.add(LoginButton);
        LFrame.add(p4);
    }

    public void setRegisterLabel(){
        p5.setLayout(new FlowLayout(FlowLayout.CENTER));
        registerLabel.setForeground(Color.white);
        registerLabel.setFont(new Font("Open Sans", Font.BOLD, 15));
        p5.add(registerLabel);
        p5.setOpaque(false);
        LFrame.add(p5);

    }


    private class Railway_LoginActions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==LoginButton){
                LFrame.dispose();
            }
        }
    }
}
