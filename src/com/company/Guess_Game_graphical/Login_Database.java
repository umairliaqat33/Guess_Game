package com.company.Guess_Game_graphical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login_Database {
    String q = "Select * from user where Name=? and Password=?";
    //String q2="insert into information(Name,password)"+"values(?,?)";
    JFrame LFrame;
    JLabel bg;
    JPanel p1, p2, p3, p4;
    JLabel logo, usernameLabel, passwordLabel;
    Font font, font2;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    JPanel p5;
    JLabel loginLabel;
    JButton registerButton;

    public Login_Database() {
        LFrame = new JFrame("Game Login");
        bg = new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\GUESSING+GAME.jpg"));
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        registerButton = new JButton("Register");
        loginLabel = new JLabel("Don't have account?");
        logo = new JLabel("Guess Game");
        usernameLabel = new JLabel("User Name :");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        passwordLabel = new JLabel("Password :");
        loginButton = new JButton("Login");
    }

    public void setLFrame() {

        LFrame.setContentPane(bg);
        LFrame.setBounds(550, 140, 400, 400);
        LFrame.setLayout(new GridLayout(5, 1));
        LFrame.setResizable(false);
        LFrame.setVisible(true);
        LFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLogo();
        setUsername();
        setPassword();
        install_btn();
        setRegisterButton();
    }

    void setLogo() {
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        p1.setOpaque(false);
        logo.setFont(new Font("Open Sans", Font.BOLD, 44));
        logo.setHorizontalAlignment(JLabel.CENTER);
        logo.setForeground(Color.WHITE);
        p1.add(logo);
        LFrame.add(p1);
    }

    void setUsername() {
        p2.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 40));
        p2.setOpaque(false);
        usernameLabel.setFont(new Font("Open Sans", Font.BOLD, 14));
        usernameLabel.setHorizontalAlignment(JLabel.CENTER);
        usernameLabel.setForeground(Color.WHITE);
        usernameField.setFont(usernameField.getFont().deriveFont(14.0f));
        usernameField.setColumns(10);
        p2.add(usernameLabel);
        p2.add(usernameField);
        LFrame.add(p2);

    }

    void setPassword() {
        p3.setLayout(new FlowLayout(FlowLayout.CENTER, 33, 20));
        p3.setOpaque(false);
        passwordLabel.setFont(new Font("Open Sans", Font.BOLD, 14));
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);
        passwordLabel.setForeground(Color.WHITE);
        passwordField.setFont(passwordField.getFont().deriveFont(14.0f));
        passwordField.setColumns(10);
        p3.add(passwordLabel);
        p3.add(passwordField);
        LFrame.add(p3);

    }

    void install_btn() {
        p4.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        p4.setOpaque(false);
        loginButton.addActionListener(new myaction());
        loginButton.setForeground(Color.white);
        loginButton.setPreferredSize(new Dimension(120, 40));
        loginButton.setBackground(Color.ORANGE);
        loginButton.setFont(new Font("Open Sans", Font.BOLD, 28));
        loginButton.setBorder(BorderFactory.createLineBorder(Color.white, 3));
        p4.add(loginButton);
        LFrame.add(p4);
    }

    void setRegisterButton() {
        p5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        p5.add(loginLabel);
        p5.add(registerButton);
        p5.setBackground(Color.BLACK);
        loginLabel.setForeground(Color.WHITE);
        //b5.setBackground(Color.BLACK);
        //b5.setForeground(Color.WHITE);
        registerButton.setPreferredSize(new Dimension(90, 27));
        registerButton.setBackground(Color.ORANGE);
        registerButton.setFont(new Font("Open Sans", Font.BOLD, 20));
        registerButton.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        registerButton.addActionListener(new RegisterButton());
        LFrame.add(p5);

    }

    private class RegisterButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent act) {
            if (act.getSource() == registerButton) {
                LFrame.dispose();
                Register_database register_database = new Register_database();
                register_database.install();
            }
        }
    }

    private class myaction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == loginButton) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");

                    PreparedStatement pst = con.prepareStatement(q);
                    pst.setString(1, usernameField.getText());
                    pst.setString(2, passwordField.getPassword().toString());
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Username and password matched");
                        Difficulty_mode dm = new Difficulty_mode();
                        con.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "Username and password don't matched");
                        usernameField.setText("");
                        passwordField.setText("");
                    }
                    LFrame.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }else{
                Login_Database login_database = new Login_Database();
                login_database.setLFrame();
            }
        }
    }
}