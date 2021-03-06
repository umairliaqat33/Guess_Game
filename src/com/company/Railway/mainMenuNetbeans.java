package com.company.Railway;


import javax.swing.*;

public class mainMenuNetbeans extends javax.swing.JFrame {

    /**
     * Creates new form FreightRates
     */
    public mainMenuNetbeans() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        PakistanRaiwaysLabel = new javax.swing.JLabel();
        SignInLabel = new javax.swing.JLabel();
        searchTrainsPanel = new javax.swing.JPanel();
        searchTrainsLabel = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        fromField = new javax.swing.JTextField();
        ToLabel = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        searchTimingsButton = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        DateLabel = new javax.swing.JLabel();
        trainTimingsButton = new javax.swing.JButton();
        bookedTicketsButton = new javax.swing.JButton();
        cancelledTicketsButton = new javax.swing.JButton();
        freightRatesButton = new javax.swing.JButton();
        bookingsHistoryButton = new javax.swing.JButton();
        becomeMemberButton = new javax.swing.JButton();
        book3DSeatsButton = new javax.swing.JButton();
        pendingTicketsButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        trainTimingsPanel=new JPanel();
        freightRatesPanel=new JPanel();
        becomeMemberPanel=new JPanel();
        pendingTicketsPanel=new JPanel();
        bookedTicketsPanel=new JPanel();
        cancelledTicketsPanel=new JPanel();
        bookingsHistoryPanel=new JPanel();
        book3DSeatsPanel=new JPanel();

        trainTimingsLabel=new JLabel("Train Timings");
        freightRatesLabel=new JLabel("Freight Rates");
        becomeMemberLabel=new JLabel("Become Member");
        pendingTicketsLabel=new JLabel("Pending Tickets");
        bookedTicketsLabel=new JLabel("Booked Tickets");
        cancelledTicketsLabel=new JLabel("Cancelled Tickets");
        bookingsHistoryLabel=new JLabel("Bookings History");
        book3DSeatsLabel=new JLabel("Book Seats 3D Way");

        trainTimingsIconLabel=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\calander.png"));
        freightRatesIconLabel=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\freight.png"));
        becomeMemberIconLabel=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\person.png"));
        pendingTicketsIconLabel=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\pending.png"));
        bookedTicketsIconLabel=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\booked.png"));
        cancelledTicketsIconLabel=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\cancelled.png"));
        bookingsHistoryIconLabel=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\history.png"));
        book3DSeatsIconLabel=new JLabel(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Guess_Game\\src\\com\\company\\images\\ticket.png"));

        trainTimingsPanel.add(trainTimingsIconLabel);
        trainTimingsPanel.add(trainTimingsLabel);
        trainTimingsPanel.setOpaque(false);

        freightRatesPanel.add(freightRatesIconLabel);
        freightRatesPanel.add(freightRatesLabel);
        freightRatesPanel.setOpaque(false);

        becomeMemberPanel.add(becomeMemberIconLabel);
        becomeMemberPanel.add(becomeMemberLabel);
        becomeMemberPanel.setOpaque(false);


        pendingTicketsPanel.add(pendingTicketsIconLabel);
        pendingTicketsPanel.add(pendingTicketsLabel);
        pendingTicketsPanel.setOpaque(false);

       bookedTicketsPanel.add(bookedTicketsIconLabel);
       bookedTicketsPanel.add(bookedTicketsLabel);
       bookedTicketsPanel.setOpaque(false);

        cancelledTicketsPanel.add(cancelledTicketsIconLabel);
        cancelledTicketsPanel.add(cancelledTicketsLabel);
        cancelledTicketsPanel.setOpaque(false);

        bookingsHistoryPanel.add(bookingsHistoryIconLabel);
        bookingsHistoryPanel.add(bookingsHistoryLabel);
        bookingsHistoryPanel.setOpaque(false);

        book3DSeatsPanel.add(book3DSeatsIconLabel);
        book3DSeatsPanel.add(book3DSeatsLabel);
        book3DSeatsPanel.setOpaque(false);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PakistanRaiwaysLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        PakistanRaiwaysLabel.setForeground(new java.awt.Color(255, 153, 0));
        PakistanRaiwaysLabel.setText("Pakistan Railways");
        getContentPane().add(PakistanRaiwaysLabel);
        PakistanRaiwaysLabel.setBounds(132, 22, 166, 33);

        SignInLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        SignInLabel.setForeground(new java.awt.Color(255, 153, 0));
        SignInLabel.setText("SignIn");
        getContentPane().add(SignInLabel);
        SignInLabel.setBounds(751, 22, 56, 33);


        searchTrainsPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchTrainsPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        searchTrainsLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        searchTrainsLabel.setForeground(new java.awt.Color(0, 153, 0));
        searchTrainsLabel.setText("Search Trains");

        fromLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        fromLabel.setForeground(new java.awt.Color(0, 153, 0));
        fromLabel.setText("From:");

        fromField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromFieldActionPerformed(evt);
            }
        });

        ToLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        ToLabel.setForeground(new java.awt.Color(0, 153, 0));
        ToLabel.setText("To:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        searchTimingsButton.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        searchTimingsButton.setForeground(new java.awt.Color(0, 153, 0));
        searchTimingsButton.setText("Search Timings");

        DateLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(0, 153, 0));
        DateLabel.setText("Date:");

        javax.swing.GroupLayout searchTrainsPanelLayout = new javax.swing.GroupLayout(searchTrainsPanel);
        searchTrainsPanel.setLayout(searchTrainsPanelLayout);
        searchTrainsPanelLayout.setHorizontalGroup(
                searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchTrainsPanelLayout.createSequentialGroup()
                                .addGroup(searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(searchTrainsPanelLayout.createSequentialGroup()
                                                .addGroup(searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(searchTrainsPanelLayout.createSequentialGroup()
                                                                .addGap(75, 75, 75)
                                                                .addGroup(searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ToLabel)
                                                                        .addComponent(DateLabel)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchTrainsPanelLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(fromLabel)))
                                                .addGap(28, 28, 28)
                                                .addGroup(searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(searchTrainsPanelLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(searchTimingsButton))
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(fromField)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))))
                                        .addGroup(searchTrainsPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(searchTrainsLabel)))
                                .addContainerGap(84, Short.MAX_VALUE))
        );
        searchTrainsPanelLayout.setVerticalGroup(
                searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchTrainsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchTrainsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fromLabel)
                                        .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ToLabel)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(searchTrainsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTimingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
        );

        getContentPane().add(searchTrainsPanel);
        searchTrainsPanel.setBounds(240, 113, 390, 193);

        trainTimingsButton.setBackground(new java.awt.Color(255, 255, 255));
        trainTimingsButton.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        trainTimingsButton.setForeground(new java.awt.Color(0, 153, 0));
//        trainTimingsButton.setText("Train Timings");
        getContentPane().add(trainTimingsButton);
        trainTimingsButton.setBounds(98, 362, 123, 104);
        trainTimingsButton.add(trainTimingsPanel);


        bookedTicketsButton.setBackground(new java.awt.Color(255, 255, 255));
        bookedTicketsButton.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        bookedTicketsButton.setForeground(new java.awt.Color(0, 153, 0));
//        bookedTicketsButton.setText("Booked Tickets");
        getContentPane().add(bookedTicketsButton);
        bookedTicketsButton.setBounds(98, 498, 123, 107);
        bookedTicketsButton.add(bookedTicketsPanel);

        cancelledTicketsButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelledTicketsButton.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cancelledTicketsButton.setForeground(new java.awt.Color(0, 153, 0));
//        cancelledTicketsButton.setText("Cancelled Tickets");
        getContentPane().add(cancelledTicketsButton);
        cancelledTicketsButton.setBounds(267, 498, 133, 107);
        cancelledTicketsButton.add(cancelledTicketsPanel);

        freightRatesButton.setBackground(new java.awt.Color(255, 255, 255));
        freightRatesButton.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        freightRatesButton.setForeground(new java.awt.Color(0, 153, 0));
//        freightRatesButton.setText("Freight Rates");
        getContentPane().add(freightRatesButton);
        freightRatesButton.setBounds(267, 362, 133, 104);
        freightRatesButton.add(freightRatesPanel);

        bookingsHistoryButton.setBackground(new java.awt.Color(255, 255, 255));
        bookingsHistoryButton.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        bookingsHistoryButton.setForeground(new java.awt.Color(0, 153, 0));
//        bookingsHistoryButton.setText("Bookings History");
        bookingsHistoryButton.setToolTipText("");
        getContentPane().add(bookingsHistoryButton);
        bookingsHistoryButton.setBounds(446, 498, 135, 107);
        bookingsHistoryButton.add(bookingsHistoryPanel);


        becomeMemberButton.setBackground(new java.awt.Color(255, 255, 255));
        becomeMemberButton.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        becomeMemberButton.setForeground(new java.awt.Color(0, 153, 0));
//        becomeMemberButton.setText("Become Member");
        getContentPane().add(becomeMemberButton);
        becomeMemberButton.setBounds(446, 362, 135, 104);
        becomeMemberButton.add(becomeMemberPanel);


        book3DSeatsButton.setBackground(new java.awt.Color(255, 255, 255));
        book3DSeatsButton.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        book3DSeatsButton.setForeground(new java.awt.Color(0, 153, 0));
//        book3DSeatsButton.setText("Book Seats 3D Way");
        getContentPane().add(book3DSeatsButton);
        book3DSeatsButton.setBounds(630, 498, 140, 107);
        book3DSeatsButton.add(book3DSeatsPanel);


        pendingTicketsButton.setBackground(new java.awt.Color(255, 255, 255));
        pendingTicketsButton.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        pendingTicketsButton.setForeground(new java.awt.Color(0, 153, 0));
//        pendingTicketsButton.setText("Pending Tickets");
        getContentPane().add(pendingTicketsButton);
        pendingTicketsButton.setBounds(630, 362, 140, 104);
        pendingTicketsButton.add(pendingTicketsPanel);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Railway_Netbeans\\src\\main\\java\\images\\Pakistan Railway logo.png")); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel8.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 10, 70, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Railway_Netbeans\\src\\main\\java\\images\\img.png")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 840, 650);

        setBounds(400, 50, 851, 686);
        setResizable(false);
    }// </editor-fold>

    private void fromFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainMenuNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenuNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenuNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenuNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenuNetbeans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton searchTimingsButton;
    private javax.swing.JButton trainTimingsButton;
    private javax.swing.JButton freightRatesButton;
    private javax.swing.JButton becomeMemberButton;
    private javax.swing.JButton pendingTicketsButton;
    private javax.swing.JButton bookedTicketsButton;
    private javax.swing.JButton cancelledTicketsButton;
    private javax.swing.JButton bookingsHistoryButton;
    private javax.swing.JButton book3DSeatsButton;
    private javax.swing.JLabel PakistanRaiwaysLabel;
    private javax.swing.JLabel SignInLabel;
    private javax.swing.JLabel searchTrainsLabel;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel ToLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel searchTrainsPanel;
    private javax.swing.JTextField fromField;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private JPanel trainTimingsPanel;
    private JPanel freightRatesPanel;
    private JPanel becomeMemberPanel;
    private JPanel pendingTicketsPanel;
    private JPanel bookedTicketsPanel;
    private JPanel cancelledTicketsPanel;
    private JPanel bookingsHistoryPanel;
    private JPanel book3DSeatsPanel;

    private JLabel trainTimingsLabel;
    private JLabel freightRatesLabel;
    private JLabel becomeMemberLabel;
    private JLabel pendingTicketsLabel;
    private JLabel bookedTicketsLabel;
    private JLabel cancelledTicketsLabel;
    private JLabel bookingsHistoryLabel;
    private JLabel book3DSeatsLabel;


    private JLabel trainTimingsIconLabel;
    private JLabel freightRatesIconLabel;
    private JLabel becomeMemberIconLabel;
    private JLabel pendingTicketsIconLabel;
    private JLabel bookedTicketsIconLabel;
    private JLabel cancelledTicketsIconLabel;
    private JLabel bookingsHistoryIconLabel;
    private JLabel book3DSeatsIconLabel;


    // End of variables declaration
}


