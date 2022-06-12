package com.company.Railway;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Railway_Main_Screen {
    JFrame mainFrame;
    JPanel trainTimingsPanel;
    Icon trainTimingsIcon;
    JPanel freightRatePanel;
    Icon freightRateIcon;
    JPanel becomeMemberPanel;
    Icon becomeMemberIcon;
    JPanel pendingTicketsPanel;
    Icon pendingTicketsIcon;
    JPanel bookedTicketsPanel;
    Icon bookedTicketsIcon;
    JPanel cancelledTicketsPanel;
    Icon cancelledTicketsIcon;
    JPanel bookingsHistoryPanel;
    Icon bookingsHistoryIcon;
    JPanel bookSeats3DPanel;
    Icon bookSeats3DIcon;

    JLabel[] mainMenuLabels;

    JLabel bg;
    JPanel upPanel;
    JPanel logoPanel;
    JLabel logo;

    JLabel logoText;
    JLabel signInLabel;
    JPanel searchPanel;
    JLabel search;
    JPanel fieldsPanel;
    JTextField fromStationField;
    JTextField toStationField;
    JTextField travelDateField;
    JButton searchTrainButton;
    JButton[] menuButtons;
    JPanel menuPanel;


    public  Railway_Main_Screen(){
        bg=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\img.png"));
        mainFrame=new JFrame();
        mainFrame.setContentPane(bg);
        upPanel=new JPanel();
        ImageIcon imageIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\Pakistan railway logo.png");
        Image image=imageIcon.getImage();
        Image newImage=image.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        imageIcon=new ImageIcon(newImage);
        logo=new JLabel(imageIcon);
        logoText=new JLabel("Pakistan Railways");
        signInLabel=new JLabel("SignIn");
        logoPanel=new JPanel();
        searchPanel=new JPanel();
        search=new JLabel("Search Trains");
        fromStationField=new JTextField("From Station");
        toStationField=new JTextField("To Station");
        travelDateField=new JTextField("Date");
        fieldsPanel=new JPanel();
        searchTrainButton=new JButton("Search Trains");
        menuButtons=new JButton[8];
        menuPanel=new JPanel();
        trainTimingsPanel=new JPanel();
        trainTimingsIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\calander.png");
        freightRatePanel=new JPanel();
        freightRateIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\freight.png");
        becomeMemberPanel=new JPanel();
        becomeMemberIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\person.png");
        pendingTicketsPanel=new JPanel();
        pendingTicketsIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\pending.png");
        bookedTicketsPanel=new JPanel();
        bookedTicketsIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\booked.png");
        cancelledTicketsPanel=new JPanel();
        cancelledTicketsIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\cancelled.png");
        bookingsHistoryPanel=new JPanel();
        bookingsHistoryIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\history.png");
        bookSeats3DPanel=new JPanel();
        bookSeats3DIcon=new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\ticket.png");
        mainMenuLabels=new JLabel[16];
    }

    public  void setMainFrame(){
        mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainFrame.setBounds(0,0,1610,875);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        setUpPanel();
        setLogoPanel();
        setSearchPanel();
        setMenuPanel();
    }


    void setUpPanel(){
        upPanel.setOpaque(false);
        upPanel.setPreferredSize(new Dimension(1600,100));
        upPanel.add(logo);
        mainFrame.add(upPanel);

    }


    void setLogoPanel(){
        logoPanel.setLayout(new GridLayout(1,2,1200,1));
        logoPanel.setOpaque(false);
        logoText.setForeground(Color.ORANGE);
        logoText.setFont(new Font("Open Sans",Font.BOLD,20));
        signInLabel.setForeground(Color.ORANGE);
        signInLabel.setFont(new Font("Open Sans",Font.BOLD,20));
        logoPanel.add(logoText);
        logoPanel.add(signInLabel);
        upPanel.add(logoPanel);
    }

    void setSearchPanel(){
        Border blackLine;
        blackLine=BorderFactory.createLineBorder(Color.black);
        searchPanel.setOpaque(true);
        searchPanel.setPreferredSize(new Dimension(400,170));
        searchPanel.setBackground(Color.WHITE);
        searchPanel.setBorder(blackLine);
        search.setForeground(Color.decode("#009900"));
        search.setFont(new Font("Open Sans",Font.BOLD,20));
        fieldsPanel.setOpaque(false);
        fieldsPanel.setPreferredSize(new Dimension(300,80));
        fromStationField.setColumns(15);
        toStationField.setColumns(15);
        travelDateField.setColumns(25);
        fieldsPanel.add(fromStationField);
        fieldsPanel.add(toStationField);
        fieldsPanel.add(travelDateField);
        searchTrainButton.setBackground(Color.ORANGE);
        searchTrainButton.setForeground(Color.decode("#009900"));
        searchTrainButton.setBorder(blackLine);
        searchTrainButton.setPreferredSize(new Dimension(150,30));
        searchPanel.add(search);
        searchPanel.add(fieldsPanel);
        searchPanel.add(searchTrainButton);
        mainFrame.add(searchPanel);
    }

    void setMenuPanel(){
        JPanel mainMenuPanel;
        mainMenuPanel=new JPanel(new FlowLayout(FlowLayout.CENTER,0,50));
        mainMenuPanel.setBackground(Color.decode("#eff5f5"));
        mainMenuPanel.setPreferredSize(new Dimension(1400,400));
        mainMenuPanel.setOpaque(true);
        menuPanel.setOpaque(false);
        menuPanel.setPreferredSize(new Dimension(1000,300));
        menuPanel.setLayout(new GridLayout(2,4,100,100));

        trainTimingsPanel.setOpaque(false);
        freightRatePanel.setOpaque(false);
        becomeMemberPanel.setOpaque(false);
        pendingTicketsPanel.setOpaque(false);
        bookedTicketsPanel.setOpaque(false);
        cancelledTicketsPanel.setOpaque(false);
        bookingsHistoryPanel.setOpaque(false);
        bookSeats3DPanel.setOpaque(false);

        mainMenuLabels[0]=new JLabel(trainTimingsIcon);
        mainMenuLabels[1]=new JLabel("Train Timings");
        mainMenuLabels[1].setForeground(Color.decode("#009900"));
        trainTimingsPanel.add(mainMenuLabels[0]);
        trainTimingsPanel.add(mainMenuLabels[1]);


        mainMenuLabels[2]=new JLabel(freightRateIcon);
        mainMenuLabels[3]=new JLabel("Freight Rates");
        mainMenuLabels[3].setForeground(Color.decode("#009900"));
        freightRatePanel.add(mainMenuLabels[2]);
        freightRatePanel.add(mainMenuLabels[3]);


        mainMenuLabels[4]=new JLabel(becomeMemberIcon);
        mainMenuLabels[5]=new JLabel("Become Member");
        mainMenuLabels[5].setForeground(Color.decode("#009900"));
        becomeMemberPanel.add(mainMenuLabels[4]);
        becomeMemberPanel.add(mainMenuLabels[5]);


        mainMenuLabels[6]=new JLabel(pendingTicketsIcon);
        mainMenuLabels[7]=new JLabel("Pending Tickets");
        mainMenuLabels[7].setForeground(Color.decode("#009900"));
        pendingTicketsPanel.add(mainMenuLabels[6]);
        pendingTicketsPanel.add(mainMenuLabels[7]);


        mainMenuLabels[8]=new JLabel(bookedTicketsIcon);
        mainMenuLabels[9]=new JLabel("Booked Tickets");
        mainMenuLabels[9].setForeground(Color.decode("#009900"));
        bookedTicketsPanel.add(mainMenuLabels[8]);
        bookedTicketsPanel.add(mainMenuLabels[9]);


        mainMenuLabels[10]=new JLabel(cancelledTicketsIcon);
        mainMenuLabels[11]=new JLabel("Cancelled Tickets");
        mainMenuLabels[11].setForeground(Color.decode("#009900"));
        cancelledTicketsPanel.add(mainMenuLabels[10]);
        cancelledTicketsPanel.add(mainMenuLabels[11]);


        mainMenuLabels[12]=new JLabel(bookingsHistoryIcon);
        mainMenuLabels[13]=new JLabel("Bookings History");
        mainMenuLabels[13].setForeground(Color.decode("#009900"));
        bookingsHistoryPanel.add(mainMenuLabels[12]);
        bookingsHistoryPanel.add(mainMenuLabels[13]);


        mainMenuLabels[14]=new JLabel(bookSeats3DIcon);
        mainMenuLabels[15]=new JLabel("Book Seats 3D way");
        mainMenuLabels[15].setForeground(Color.decode("#009900"));
        bookSeats3DPanel.add(mainMenuLabels[14]);
        bookSeats3DPanel.add(mainMenuLabels[15]);


        for(int i=0;i<8;i++){
            menuButtons[i]=new JButton();
            menuButtons[i].setBackground(Color.WHITE);
            menuPanel.add(menuButtons[i]);
        }

        menuButtons[0].add(trainTimingsPanel);
        menuButtons[1].add(freightRatePanel);
        menuButtons[2].add(becomeMemberPanel);
        menuButtons[3].add(pendingTicketsPanel);
        menuButtons[4].add(bookedTicketsPanel);
        menuButtons[5].add(cancelledTicketsPanel);
        menuButtons[6].add(bookingsHistoryPanel);
        menuButtons[7].add(bookSeats3DPanel);

        mainMenuPanel.add(menuPanel);
        mainFrame.add(mainMenuPanel);
    }

}
