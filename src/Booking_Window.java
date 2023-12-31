import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anu
 */
public class Booking_Window extends javax.swing.JFrame {
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
    /**
     * Creates new form Booking_Window
     */
    public Booking_Window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        phone_no = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cash = new javax.swing.JRadioButton();
        card = new javax.swing.JRadioButton();
        table_type = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        table_no = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        date = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        month = new javax.swing.JSpinner();
        year = new javax.swing.JSpinner();
        from = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        cheque = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        booking_no = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        members = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        status = new javax.swing.JTable();
        check = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookings = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        retrieve = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TABLE BOOKING / CANCELLATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(353, 88, 392, 31);

        back.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(10, 96, 65, 25);

        exit.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(1016, 96, 57, 25);

        log_out.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        log_out.setText("LOG OUT");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });
        getContentPane().add(log_out);
        log_out.setBounds(913, 96, 85, 25);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("NAME");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("BOOK TABLE");

        name.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        book.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        book.setText("BOOK");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("PHONE NO.");

        phone_no.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("TABLE TYPE");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("PAYMENT");

        buttonGroup2.add(cash);
        cash.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cash.setText("CASH");

        buttonGroup2.add(card);
        card.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        card.setText("CARD");

        table_type.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        table_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORDINARY", "DATE", "BUSINESS", "EXECUTIVE", "PERSONAL HALL" }));
        table_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_typeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("TABLE NO.");

        table_no.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("TIME");

        date.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        date.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("DATE");

        month.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        month.setModel(new javax.swing.SpinnerListModel(new String[] {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"}));

        year.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        year.setModel(new javax.swing.SpinnerNumberModel(2019, 2019, null, 1));

        from.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("TO");

        to.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        buttonGroup2.add(cheque);
        cheque.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cheque.setText("CHEQUE");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setText("PRICE");

        booking_no.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel16.setText("BOOKING NO.");

        price.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        members.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel17.setText("MEMBERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addComponent(jLabel8)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(to)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(table_no)
                                .addComponent(booking_no)
                                .addComponent(price))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cash)
                                .addGap(18, 18, 18)
                                .addComponent(card)
                                .addGap(18, 18, 18)
                                .addComponent(cheque))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(phone_no)
                            .addComponent(table_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(members))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(book))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(members, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(table_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(booking_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card)
                    .addComponent(cheque)
                    .addComponent(cash)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(book)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BOOK", jPanel2);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("ENTER BOOKING NO.");

        cb.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("CANCEL BOOKING");

        ok.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ok)
                .addGap(140, 140, 140))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(cb)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ok)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CANCEL", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(708, 139, 348, 521);

        jLabel18.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Hazrat Paradise");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(407, 11, 256, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("STATUS");

        status.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        status.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TABLE NO.", "TYPE", "NO. OF SEATS", "STATUS/BOOKING NO.", "DATE", "FROM", "TO", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(status);

        check.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        check.setText("CHECK STATUS");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("BOOKINGS");

        bookings.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        bookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING NO.", "NAME", "PHONE NO.", "TABLE NO.", "DATE", "FROM", "TO", "PAYMENT"
            }
        ));
        jScrollPane3.setViewportView(bookings);

        retrieve.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        retrieve.setText("RETRIEVE DATA");
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(check))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(retrieve)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(retrieve)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 139, 680, 520);

        jLabel19.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Where food meets passion");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(448, 47, 173, 23);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturant_project/csm_restaurant-img_ffc47488b1.jpg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, -40, 1090, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        DefaultTableModel model=(DefaultTableModel) status.getModel();
        int rows=model.getRowCount();
        if(rows>0)
        for(int i=0;i<rows;i++)
        model.removeRow(0);

        try{
            Class.forName("java.sql.Driver");

            con=DriverManager.getConnection
            ("jdbc:mysql://localhost/resturant","root","3767");           
            stmt=con.createStatement();            

            String query="SELECT*FROM STATUS;";
            rs=stmt.executeQuery(query);

            while(rs.next()) {
                String t=rs.getString("t_no");
                String ty=rs.getString("type");
                String s=rs.getString("seats");
                String st=rs.getString("status");
                String d=rs.getString("date");
                String f=rs.getString("fr");
                String t_=rs.getString("t");
                String p=rs.getString("price");

                model.addRow(new Object[] {t,ty,s,st,d,f,t_,p});
            }
        }     
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Can't connect to the database");
        }
    }//GEN-LAST:event_checkActionPerformed

    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed
        DefaultTableModel model=(DefaultTableModel) bookings.getModel();
        int rows=model.getRowCount();
        if(rows>0)
        for(int i=0;i<rows;i++)
        model.removeRow(0);

        try{
           stmt=con.createStatement();            

            String query="SELECT*FROM BOOKINGS;";
            rs=stmt.executeQuery(query);

            while(rs.next()) {
                String b=rs.getString("b_no");
                String n=rs.getString("name");
                String p_no=rs.getString("p_no");
                String t=rs.getString("t_no");
                String d=rs.getString("date");
                String f=rs.getString("from");
                String t_=rs.getString("to");
                String p=rs.getString("payment");

                model.addRow(new Object[] {b,n,p_no,t,d,f,t_,p});
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Can't connect to the database");
        }
    }//GEN-LAST:event_retrieveActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
                   try{
               stmt=con.createStatement();
               
                 String na=name.getText();
                 String ph=phone_no.getText();
                 String ty=(String)table_type.getSelectedItem();

                 
                 int da=(Integer)date.getValue();
                 String mo=(String)month.getValue();
                 int ye=(Integer)year.getValue();
                 String d=mo+" "+da+","+ye;
                 
                 String f=from.getText();
                 String t=to.getText();
                 String ta=table_no.getText();
                 String bo=booking_no.getText();
                 
                
                 
                 String pa;
                 { if (cash.isSelected())
                     pa="CASH";
                 else if (card.isSelected())
                     pa="CARD";
                 else
                     pa="CHEQUE";
                 }
                 
                 String query="INSERT INTO BOOKINGS VALUES('"+bo+"','"+na+"','"+ph+"','"+ta+"','"+d+"','"+f+"','"+t+"','"+pa+"');";
                 String q="UPDATE STATUS SET STATUS='"+bo+"',DATE='"+d+"',FR='"+f+"',T='"+t+"'"
                      +" WHERE t_no='"+ta+"';";
               
                 stmt.executeUpdate(query);
                 stmt.executeUpdate(q);
                 
               JOptionPane.showMessageDialog(null,"Table Booked Successfully");
           }
     catch(Exception e)  {
     JOptionPane.showMessageDialog(null,"Please check if all fields are correct");
     }
    }//GEN-LAST:event_bookActionPerformed

    private void table_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_typeActionPerformed
     String ty=(String)table_type.getSelectedItem();
      int p=1000;
      String m="";
                 if(ty.equals("DATE")){
                     p=2000;
                     m="2";}
                 if(ty.equals("BUSINESS"))
                     p=3000;
                 if(ty.equals("EXECUTIVE"))
                     p=5000;
                 if(ty.equals("PERSONAL HALL"))
                     p=8000;
                 price.setText(""+p);
                 members.setText(""+m);
    }//GEN-LAST:event_table_typeActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
     
           try{
               stmt=con.createStatement();
               
               String c=cb.getText();
               
                             
               String q="DELETE FROM BOOKINGS WHERE B_NO="+c+";";
               String r="UPDATE STATUS SET STATUS='AVAILABLE',DATE='------------',FR='------------',T='------------'"
                      +" WHERE status='"+c+"';";
               
               stmt.executeUpdate(r);
               stmt.executeUpdate(q);
               JOptionPane.showMessageDialog(null,"Booking Cancelled Successfully");
             
           }
     catch(Exception e)  {
     JOptionPane.showMessageDialog(null,"Invalid Booking No.");
     }
    }//GEN-LAST:event_okActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
this.setVisible(false);
Main_Window m=new Main_Window();
m.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
this.setVisible(false);
Login_Window l=new Login_Window();
l.setVisible(true);
    }//GEN-LAST:event_log_outActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Booking_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton book;
    private javax.swing.JTextField booking_no;
    private javax.swing.JTable bookings;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton card;
    private javax.swing.JRadioButton cash;
    private javax.swing.JTextField cb;
    private javax.swing.JButton check;
    private javax.swing.JRadioButton cheque;
    private javax.swing.JSpinner date;
    private javax.swing.JButton exit;
    private javax.swing.JTextField from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton log_out;
    private javax.swing.JTextField members;
    private javax.swing.JSpinner month;
    private javax.swing.JTextField name;
    private javax.swing.JButton ok;
    private javax.swing.JTextField phone_no;
    private javax.swing.JTextField price;
    private javax.swing.JButton retrieve;
    private javax.swing.JTable status;
    private javax.swing.JTextField table_no;
    private javax.swing.JComboBox<String> table_type;
    private javax.swing.JTextField to;
    private javax.swing.JSpinner year;
    // End of variables declaration//GEN-END:variables
}
