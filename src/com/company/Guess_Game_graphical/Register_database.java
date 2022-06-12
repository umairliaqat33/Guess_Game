package com.company.Guess_Game_graphical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Register_database {
    String qry = "Select Name from user";
    String qry2 = "insert into user(Name,password) values(?,?)";
    JFrame rFrame;
    JLabel username;
    JLabel password;
    JLabel logo;
    JLabel loginLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton registerButton, button;
    JLabel bg, label;

    JPanel p1, p2, p3, p4, p5, p6, p7, panel;

    public Register_database() {
        rFrame = new JFrame("Guess Game");
        bg = new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\GUESSING+GAME.jpg"));
        rFrame.setContentPane(bg);
        logo = new JLabel("Guess Game");
        username = new JLabel("User Name : ");
        password = new JLabel("Password :");
        loginLabel = new JLabel("Already an account?");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        registerButton = new JButton("Register");
        registerButton.addActionListener(new LoginActions());
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        button = new JButton("Log In");
        panel = new JPanel();
        label = new JLabel("Already have account?");
    }

    public void install() {
        rFrame.setLayout(new GridLayout(4, 1));
        rFrame.setBounds(400, 100, 600, 510);
        rFrame.setDefaultCloseOperation(rFrame.EXIT_ON_CLOSE);
        rFrame.setVisible(true);
        install_Logo();
        setUsernamePanel();
        setPasswordPanel();
        setRegisterButton();
        setLoginLabel();
    }

    void install_Logo() {
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.setOpaque(false);
        p1.setPreferredSize(new Dimension(50, 100));
        logo.setFont(new Font("Open Sans", Font.BOLD, 50));
        logo.setForeground(Color.BLACK);
        p1.add(logo);
        rFrame.add(p1);
    }

    void setUsernamePanel() {
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.setOpaque(false);
        username.setForeground(Color.BLACK);
        username.setFont(new Font("Open Sans", Font.PLAIN, 20));
        usernameField.setColumns(10);
        p2.add(username);
        p2.add(usernameField);
        rFrame.add(p2);
    }


    void setPasswordPanel() {
        p4.setLayout(new FlowLayout(FlowLayout.CENTER));
        p4.setOpaque(false);
        password.setForeground(Color.BLACK);
        password.setFont(new Font("Open Sans", Font.PLAIN, 20));
        passwordField.setColumns(20);
        p4.add(password);
        p4.add(passwordField);
        rFrame.add(p4);
    }


    void setRegisterButton() {
        p6.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 0));
        p6.setOpaque(false);
        registerButton.setBackground(Color.orange);
        registerButton.setForeground(Color.BLACK);
        registerButton.setFont(new Font("Open Sans", Font.PLAIN, 15));
        registerButton.setPreferredSize(new Dimension(150, 50));
        registerButton.addActionListener(new LoginActions());
        p6.add(registerButton);
        p6.add(p7);
        rFrame.add(p6);
    }

    void setLoginLabel() {
        p7.setLayout(new FlowLayout(FlowLayout.CENTER));
        p7.setOpaque(false);
        loginLabel.setForeground(Color.BLACK);
        loginLabel.setFont(new Font("Open Sans", Font.PLAIN, 20));
        button.setBackground(Color.orange);
        button.setForeground(Color.BLACK);
        button.setPreferredSize(new Dimension(100, 25));
        button.addActionListener(new LoginButton());
        p7.add(loginLabel);
        p7.add(button);
//        rFrame.add(p7);
    }

    private class LoginButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                rFrame.dispose();
                Login_Database login = new Login_Database();
                login.setLFrame();
            }
        }
    }

    private class LoginActions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int opt=0;
            if(e.getSource()==registerButton){
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","");
                    Statement stmt=connect.createStatement();
                    ResultSet rs=stmt.executeQuery(qry);

                    while(rs.next())
                    {
                        if(rs.getString(1).equals(usernameField.getText()))
                        {
                            opt=10;
                        }
                        else if(rs.getString(1)!=usernameField.getText()){
                            opt = 20;
                        }
                    }
                    if(opt==10){
                        JOptionPane.showMessageDialog(null,"Username exist. Choose another name");
                    }
                    else if(opt==20){
                        JOptionPane.showMessageDialog(null, "Account have been created Created");
                        PreparedStatement stmnt=connect.prepareStatement(qry2);
                        stmnt.setString(1, usernameField.getText());
                        stmnt.setString(2, String.valueOf(passwordField.getPassword()));
                        stmnt.execute();
                        rFrame.dispose();
                        Login_Database login_database=new Login_Database();
                        login_database.setLFrame();
                    }

                    connect.close();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
                //rFrame.dispose();
            }
        }


    }
}
