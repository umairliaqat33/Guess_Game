package com.company.Guess_Game_graphical;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

import static java.awt.Color.GRAY;

public class leaderboard {
    JFrame f;

    //creating object of second JFrame
     DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    Connection connection;//Creating object of Connection class
    Statement statement;//Creating object of Statement class



    leaderboard(){


        f = new JFrame("Database Results");

        f.setBounds(550, 140, 610, 380);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setting the properties of JTable and DefaultTableModel
        defaultTableModel = new DefaultTableModel();
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(300, 100));
        table.setFillsViewportHeight(true);
        f.add(new JScrollPane(table));
        defaultTableModel.addColumn("Rank");
        defaultTableModel.addColumn("Username");
        defaultTableModel.addColumn("Gender");






        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");//Crating connection with database
            statement = connection.createStatement();//crating statement object
            String query = "select * from user ";//Storing MySQL query in A string variable
            ResultSet rs = statement.executeQuery(query);//executing query and storing result in ResultSet


            while (rs.next()) {

                //Retrieving details from the database and storing it in the String variables
//                String rank = rs.getString("id");
                String name = rs.getString("Name");
                String gender = rs.getString("Password");

                defaultTableModel.addRow(new Object[]{ name, gender});//Adding row in Table
                f.setVisible(true);//Setting the visibility of second Frame
                f.validate();

            }




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }




    public static void main(String[] args) {

        leaderboard l=new leaderboard();
    }
}