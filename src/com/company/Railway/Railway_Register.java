package com.company.Railway;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Railway_Register {

    JFrame registerFrame;
    JLabel bg;
    JLabel logoLabel;
    JLabel nameLabel;
    JTextField nameField;
    JLabel emailLabel;
    JTextField emailField;
    JLabel passwordLabel;
    JPasswordField passwordField;
    JLabel phoneLabel;
    JTextField phoneField;
    JLabel CNICLabel;
    JTextField CNICField;
    JButton registerButton;
    JLabel loginLabel;
    JPanel[] registerPanels;

    public Railway_Register(){
        registerFrame = new JFrame();
        bg=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\railway_register.jpg"));
        registerFrame.setContentPane(bg);
        logoLabel=new JLabel("Game_Over");
        nameLabel=new JLabel("Full Name: ");
        nameField=new JTextField();
        emailLabel=new JLabel("Email: ");
        emailField=new JTextField();
        passwordLabel=new JLabel("Password: ");
        passwordField=new JPasswordField();
        phoneLabel=new JLabel("Phone number: ");
        CNICLabel=new JLabel("CNIC");
        CNICField=new JTextField();
        phoneField=new JTextField();
        registerButton=new JButton("Game_Over");
        registerButton.addActionListener(new Railway_Register.Railway_RegisterActions());
        loginLabel=new JLabel("Already have an account? Login");
        registerPanels=new JPanel[10];
    }

    public void installRegisterRailwayScreen(){

        registerFrame.setLayout(new GridLayout(9,1));
        registerFrame.setBounds(300,100,600,700);
        registerFrame.setVisible(true);
        registerFrame.setResizable(false);
        registerFrame.setDefaultCloseOperation(registerFrame.EXIT_ON_CLOSE);
        setLogoLabel();
        setName();
        setEmail();
        setPhone();
        setCNIC();
//        setPassword();
        setRegisterButton();
    }

    void setLogoLabel(){
        registerPanels[0]=new JPanel();
        registerPanels[0].setLayout(new FlowLayout(FlowLayout.CENTER));
        registerPanels[0].setOpaque(false);
        logoLabel.setForeground(Color.ORANGE);
        logoLabel.setFont(new Font("Open Sans",Font.BOLD,50));
        registerPanels[0].add(logoLabel);
        registerFrame.add(registerPanels[0]);
    }

    void setName(){
        registerPanels[1]=new JPanel();
        registerPanels[1].setOpaque(false);
        registerPanels[1].setLayout(new FlowLayout(FlowLayout.CENTER));
        registerPanels[2]=new JPanel();
        registerPanels[2].setOpaque(false);
        registerPanels[2].setLayout(new FlowLayout(FlowLayout.CENTER));
        nameLabel.setFont(new Font("Open Sans",Font.BOLD,20));
        nameLabel.setForeground(Color.orange);
        nameField.setColumns(20);
        registerPanels[2].add(nameLabel);
        registerPanels[2].add(nameField);
        registerPanels[1].add(registerPanels[2]);
        registerFrame.add(registerPanels[1]);
    }

    void setEmail(){
        registerPanels[3]=new JPanel();
        registerPanels[3].setOpaque(false);
        registerPanels[3].setLayout(new FlowLayout(FlowLayout.CENTER));
        emailLabel.setForeground(Color.ORANGE);
        emailLabel.setFont(new Font("Open Sans",Font.BOLD,20));
        emailField.setColumns(20);
        registerPanels[3].add(emailLabel);
        registerPanels[3].add(emailField);
        registerPanels[1].add(registerPanels[3]);
    }

    void setPhone(){
        registerPanels[5]=new JPanel();
        registerPanels[5].setOpaque(false);
        registerPanels[5].setLayout(new FlowLayout(FlowLayout.CENTER));
        registerPanels[4]=new JPanel();
        registerPanels[4].setOpaque(false);
        registerPanels[4].setLayout(new FlowLayout(FlowLayout.CENTER));
        phoneLabel.setForeground(Color.ORANGE);
        phoneLabel.setFont(new Font("Open Sans",Font.BOLD,20));
        phoneField.setColumns(20);
        registerPanels[4].add(phoneLabel);
        registerPanels[4].add(phoneField);
        registerPanels[5].add(registerPanels[4]);
        registerFrame.add(registerPanels[5]);
    }

    void setCNIC(){
        registerPanels[6]=new JPanel();
        registerPanels[6].setOpaque(false);
        registerPanels[6].setLayout(new FlowLayout(FlowLayout.CENTER));
        CNICLabel.setForeground(Color.ORANGE);
        CNICLabel.setFont(new Font("Open Sans",Font.BOLD,20));
        CNICField.setColumns(20);
        registerPanels[6].add(CNICLabel);
        registerPanels[6].add(CNICField);
        registerPanels[5].add(registerPanels[6]);
    }

    void setPassword(){
        registerPanels[7]=new JPanel();
        registerPanels[7].setOpaque(false);
        registerPanels[7].setLayout(new FlowLayout(FlowLayout.CENTER));
        registerPanels[8]=new JPanel();
        registerPanels[8].setOpaque(false);
        registerPanels[8].setLayout(new FlowLayout(FlowLayout.CENTER));
        passwordLabel.setForeground(Color.ORANGE);
        passwordLabel.setFont(new Font("Open Sans",Font.BOLD,20));
        passwordField.setColumns(20);
        registerPanels[8].add(phoneLabel);
        registerPanels[8].add(phoneField);
        registerPanels[7].add(registerPanels[8]);
        registerFrame.add(registerPanels[7]);
    }

    public void setRegisterButton(){
        registerPanels[9]=new JPanel();
        registerPanels[9].setOpaque(false);
        registerPanels[9].setLayout(new FlowLayout(FlowLayout.CENTER));
        registerButton.setBorder(BorderFactory.createLineBorder(Color.white,3));
        registerButton.setBackground(Color.orange);
        registerButton.setForeground(Color.white);
        registerButton.setFont(new Font("Open Sans", Font.BOLD, 20));
        registerButton.setPreferredSize(new Dimension(150,40));
        registerPanels[9].setOpaque(false);
        registerPanels[9].add(registerButton);
        registerFrame.add(registerPanels[9]);
    }

    private class Railway_RegisterActions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==registerButton){
                registerFrame.dispose();
            }
        }
    }
}

