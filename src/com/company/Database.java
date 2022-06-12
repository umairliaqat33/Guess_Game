package com.company;

import java.sql.*;

public class Database {

    String q="Insert into student(name, rollno,age,gender)"+"Values(?,?,?,?)";
    String uq="Select name from student";

    public void insertusers(String name,int r,int a, String g)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/railway","root","");
            //Statement stmt=con.createStatement();

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(uq);
            while(rs.next())
            {
                if(rs.getString(1).equals(name))
                {
                    System.out.println("Choose Another USername !");
                }
                System.out.println(rs.getString(1));
            }


            PreparedStatement stmnt=con.prepareStatement(q);
            stmnt.setString(1, name);
            stmnt.setInt(2, r);
            stmnt.setInt(3,a );
            stmnt.setString(4,g);

            stmnt.execute();

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }


    void viewusers()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/railway","root","");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select name from student");

            while(rs.next())
            {

                System.out.println(rs.getString(1));
            }
            con.close();

        }catch(Exception e){ System.out.println(e);}
    }

    void insert(String userName,String password, int age)
    {
        System.out.println("Work entered");

        try
        {
            System.out.println("Work 1.1");
            String rq="Select username from user";
            String q="Insert into users(username, password,age)"+"Values(?,?,?)";

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Work 1.2");
            Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","");
            System.out.println("Work connection");
            Statement rStmnt=connect.createStatement();
            System.out.println("Work 1.1.1");
            ResultSet rst=rStmnt.executeQuery(rq);
            System.out.println("Work 1.1.2");
            while(rst.next())
            {
                System.out.println("Work 1.3");
                if(userName.equals(rst.getString(1)))
                {
                    System.out.println("Work duplicate");
                    //   JOptionPane.showMessageDialog(frame, "Username not available.");
                    break;
                }
                else if(rst.isLast())
                {
                    System.out.println("Work 1.4");
                    PreparedStatement stmnt=connect.prepareStatement(q);
                    stmnt.setString(1, userName);
                    stmnt.setString(2, password);
                    stmnt.setInt(3, age);

                    stmnt.execute();
                    System.out.println("Work execute");
                    // JOptionPane.showMessageDialog(frame, "Registration Successfull");
                    // frame.dispose();
                    //Login lObj=new Login();
                    //lObj.loginCalling();
                }
            }
            System.out.println("Work close");
            connect.close();
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(Game_Over.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            // Logger.getLogger(Game_Over.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
