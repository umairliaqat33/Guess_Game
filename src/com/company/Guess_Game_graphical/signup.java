//package com.company.Guess_Game_graphical;
//
//
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.sql.*;
//
//import javax.swing.*;
//
//public class signup {
//    private static JFrame frame;
//    private JLabel background;
//    private JLabel mlabel;
//    private JLabel ulabel;
//    private JLabel plabel;
//    private JLabel cplabel;
//    private static JTextField utextfield;
//    private static JPasswordField ptextfield;
//    private static JPasswordField cptextfield;
//    private JLabel glabel;
//    private JLabel Already_r;
//    private static String gender;
//    private static JButton btn;
//    private static JRadioButton r1;
//    private static JRadioButton r2;
//    private JPanel p1,p2,p3,p4,p5,p6,p7;
//
//
//    public signup()
//    {
//        frame=new JFrame("Registration");
//        background=new JLabel(new ImageIcon("C:\\Users\\Mansab\\IdeaProjects\\Guess Game Phase 4\\src\\Game\\image\\login.jpeg"));
//
//        mlabel=new JLabel("REGISTRATION");
//        ulabel=new JLabel("User Name");
//        plabel=new JLabel("Password");
//        cplabel=new JLabel("Confirm Password");
//        utextfield=new JTextField();
//        ptextfield=new JPasswordField();
//        cptextfield=new JPasswordField();
//        Already_r=new JLabel("I have Already registered !");
//        glabel=new JLabel("Gender");
//        btn=new JButton("Done");
//        r1=new JRadioButton("Male");
//        r2=new JRadioButton("Female");
//        p1=new JPanel();
//        p2=new JPanel();
//        p3=new JPanel();
//        p4=new JPanel();
//        p5=new JPanel();
//        p6=new JPanel();
//        p7=new JPanel();
//    }
//
//
//    void install_frame()
//    {
//
//        frame.add(mlabel);
//
//        frame.setContentPane(background);
//        frame.setBounds(550, 140, 610, 380);
//        frame.setLayout(new GridLayout(7,1));
//        //frame.setLayout(null);
//        frame.setResizable(false);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//    void install_mlabel()
//    {
//        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 12));
//        p1.setOpaque(false);
//
//        mlabel.setFont(new Font("Open Sans", Font.BOLD, 35));
//        //logLabel.setFont(logLabel.getFont().deriveFont(32.0f));
//        mlabel.setHorizontalAlignment(JLabel.CENTER);
//        mlabel.setForeground(Color.white);
//        p1.add(mlabel);
//        frame.add(p1);
//    }
//    void install_p2()
//    {
//        p2.setLayout(new FlowLayout(FlowLayout.CENTER, 75, 19));
//        p2.setOpaque(false);
//
//        ulabel.setFont(new Font("Open Sans", Font.BOLD, 18));
//        //logLabel.setFont(logLabel.getFont().deriveFont(32.0f));
//        ulabel.setHorizontalAlignment(JLabel.CENTER);
//        ulabel.setForeground(Color.white);
//        utextfield.setFont(utextfield.getFont().deriveFont(14.0f));
//
//        utextfield.setBackground(Color.GRAY);
//        utextfield.setColumns(10);
//
//        p2.add(ulabel);
//        p2.add(utextfield);
//        frame.add(p2);
//
//    }
//    void install_p3()
//    {
//        p3.setLayout(new FlowLayout(FlowLayout.CENTER, 85, 10));
//        p3.setOpaque(false);
//
//        plabel.setFont(new Font("Open Sans", Font.BOLD, 18));
//        //logLabel.setFont(logLabel.getFont().deriveFont(32.0f));
//        plabel.setHorizontalAlignment(JLabel.CENTER);
//        plabel.setForeground(Color.white);
//
//        ptextfield.setFont(ptextfield.getFont().deriveFont(14.0f));
//        ptextfield.setBackground(Color.GRAY);
//        ptextfield.setColumns(10);
//
//        p3.add(plabel);
//        p3.add(ptextfield);
//        frame.add(p3);
//
//    }
//    void install_p4()
//    {
//        p4.setLayout(new FlowLayout(FlowLayout.CENTER, 16, 0));
//        p4.setOpaque(false);
//
//        cplabel.setFont(new Font("Open Sans", Font.BOLD, 18));
//        //logLabel.setFont(logLabel.getFont().deriveFont(32.0f));
//        cplabel.setHorizontalAlignment(JLabel.CENTER);
//        cplabel.setForeground(Color.white);
//
//        cptextfield.setFont(ptextfield.getFont().deriveFont(14.0f));
//        cptextfield.setBackground(Color.GRAY);
//        cptextfield.setColumns(10);
//
//        p4.add(cplabel);
//        p4.add(cptextfield);
//        frame.add(p4);
//
//    }
//    void install_p5()
//    {
//        p5.setLayout(new FlowLayout(FlowLayout.CENTER,50,1));
//        p5.setOpaque(false);
//
//        glabel.setFont(new Font("Open Sans", Font.BOLD, 18));
//        //logLabel.setFont(logLabel.getFont().deriveFont(32.0f));
//        glabel.setHorizontalAlignment(JLabel.CENTER);
//        glabel.setForeground(Color.white);
//        r1.setOpaque(false);
//        r1.setBackground(Color.black);
//        r1.setForeground(Color.white);
//        r1.addActionListener(new gAction());
//         r2.setOpaque(false);
//        r2.setBackground(Color.black);
//        r2.setForeground(Color.white);
//        r2.addActionListener(new gAction());
//        p5.add(glabel);
//        p5.add(r1);
//        p5.add(r2);
//        frame.add(p5);
//    }
//
//    void install_p6()
//    {
//        p6.setLayout(new FlowLayout(FlowLayout.CENTER,0,1));
//        p6.setOpaque(false);
//
//        btn.setFont(new Font("time new roman", Font.BOLD, 28));
//        btn.addActionListener(new Action());
//        btn.setForeground(Color.white);
//        btn.setBackground(Color.black);
//
//        p6.add(btn);
//        frame.add(p6);
//
//
//
//
//    }
//    void install_p7()
//    {
//        p7.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
//        p7.setOpaque(false);
//
//        Already_r.setFont(new Font("Open Sans", Font.BOLD, 15));
//        //logLabel.setFont(logLabel.getFont().deriveFont(32.0f));
//        Already_r.addMouseListener(new Mouse() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                Already_r.setForeground(Color.darkGray);
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                Already_r.setForeground(Color.white);
//            }
//        });
//        Already_r.setHorizontalAlignment(JLabel.CENTER);
//        Already_r.setForeground(Color.white);
//        p7.add(Already_r);
//        frame.add(p7);
//    }
//
//
//
//
//    void install_componentss()
//    {
//        install_frame();
//        install_mlabel();
//        install_p2();
//        install_p3();
//        install_p4();
//        install_p5();
//        install_p6();
//        install_p7();
//    }
//
//    public static class Action implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            if(ae.getSource()==btn)
//            {
//
//                if(utextfield.getText().trim().isEmpty()||ptextfield.getPassword().length==0||cptextfield.getPassword().length==0)
//                {
//                    JOptionPane.showMessageDialog(frame, "All Field are Required to Filled.","Error", JOptionPane.ERROR_MESSAGE);
//
//                }
//                else {
//                    try {
//                        Class.forName("com.mysql.cj.jdbc.Driver");
//                        String db="jdbc:mysql://localhost:3306/guess_game";
//                        String username="root";
//                        String password="";
//                        String u_name=utextfield.getText();
//                        Connection con= DriverManager.getConnection(db,username,password);
//                        String query="insert into registration(user_name,password,cpassword,gender) values(?,?,?,?)";
//
//                        PreparedStatement pst = con.prepareStatement(query);
//                        pst.setString(1,utextfield.getText());
//                        pst.setString(2, String.valueOf(ptextfield.getPassword()));
//                        pst.setString(3, String.valueOf(cptextfield.getPassword()));
//                        pst.setString(4,gender);
//                        if(checkUsername(u_name)) {
//                            JOptionPane.showMessageDialog(frame, "This Username Already Exist");
//                        }else {
//                            if (String.valueOf(ptextfield.getPassword()).equalsIgnoreCase(String.valueOf(cptextfield.getPassword()))) {
//                                if (r1.isSelected() || r2.isSelected()) {
//
//                                    int count = pst.executeUpdate();
//                                    if (count > 0) {
//                                        JOptionPane.showMessageDialog(frame, "Registration Successfully");
//                                        Login h = new Login();
//                                        h.install_components();
//                                        frame.dispose();
//                                    } else {
//                                        JOptionPane.showMessageDialog(frame, "Registration Failed");
//                                    }
//
//                                } else {
//                                    JOptionPane.showMessageDialog(frame, "Select the gender  ");
//                                }
//                            } else {
//                                JOptionPane.showMessageDialog(frame, "Password Does not Match");
//                            }
//                        }
//                        con.close();
//                    } catch (ClassNotFoundException | SQLException e) {
//                        e.printStackTrace();
//                    }
//
//
//                }
//
//            }
//
//
//        }
//    }
//    public static boolean checkUsername(String u_name)
//    {
//        PreparedStatement ps;
//        ResultSet rs;
//        boolean checkUser = false;
//
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String db="jdbc:mysql://localhost:3306/guess_game";
//            String username="root";
//            String password="";
//
//            Connection con= DriverManager.getConnection(db,username,password);
//            String query = "SELECT * FROM `registration` WHERE `user_name` =?";
//
//            ps = con.prepareStatement(query);
//            ps.setString(1, u_name);
//
//            rs = ps.executeQuery();
//
//            if(rs.next())
//            {
//                checkUser = true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return checkUser;
//    }
//
//    public static class gAction implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent ae){
//            if(r1.isSelected())
//            {
//               gender="Male";
//            }else if(r2.isSelected())
//            {
//                gender="Female";
//            }
//
//        }
//    }
//
//}
