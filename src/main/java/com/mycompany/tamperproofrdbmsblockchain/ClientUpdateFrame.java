
package com.mycompany.tamperproofrdbmsblockchain;

import datastorage.DataOperationFrame;
import datastorage.ViewDataFrame;
import dbclasses.MySQLInformationExtractor;
import dbclasses.MySQLTableUpdater;
import dbclasses.DBConnection;
import dbclasses.MySQLTableCreator;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;



public class ClientUpdateFrame extends javax.swing.JFrame {
  String authkey="";
    
    public ClientUpdateFrame() {
        super("CLIENT UPDATE FRAME");
        initComponents();
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jMenu1.setBorder(new EmptyBorder(0, 15, 0, 15));
        jMenu7.setBorder(new EmptyBorder(0, 15, 0, 15));
        
        Statement st= new DBConnection().getDBConnection();
        LinkedList clientinfo= new MySQLInformationExtractor().getClientInformation(st,"registerinfo",LoginFrame.userid);
         
       
        jTextField1.setText(clientinfo.get(0).toString());
        String dob=clientinfo.get(1).toString();
        String str[]=dob.split("-");
        jComboBox1.setSelectedItem(str[0]);
        jComboBox2.setSelectedItem(str[1]);
        jComboBox3.setSelectedItem(str[2]);
        jTextArea1.setText(clientinfo.get(2).toString());
        jTextField2.setText(clientinfo.get(3).toString());
        jTextField3.setText(clientinfo.get(4).toString());
        jTextField4.setText(clientinfo.get(5).toString());
        jTextField4.setEditable(false);
        jPasswordField1.setText(clientinfo.get(6).toString());
        jPasswordField2.setText(clientinfo.get(6).toString());
        authkey=clientinfo.get(7).toString();
        
        System.out.println(clientinfo);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DOB:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mobile:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("User ID:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Confirm Password:");

        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mon", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jPasswordField2.setText("jPasswordField2");
        jPasswordField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 1, true));
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submit.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 0, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("User Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(278, 278, 278)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(288, 288, 288)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(135, 135, 135)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel9)
                            .addGap(55, 55, 55)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9))
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(660, 30, 680, 910);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image2.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 2000, 1000);

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 45));

        jMenu3.setText("Manage Profile");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem1.setText("Update Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Data Storage");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem2.setText("Store Data");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem3.setText("View Data");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Logout");
        jMenu7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuItem6.setText("Exit");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String name = jTextField1.getText();
        String d = (String) jComboBox1.getSelectedItem();
        String m = (String) jComboBox2.getSelectedItem();
        String y = (String) jComboBox3.getSelectedItem();

        String dob = d + "-" + m + "-" + y;

        String add = jTextArea1.getText();
        String email = jTextField2.getText();
        String mob = jTextField3.getText();

        String uid = jTextField4.getText();
        char ch1[] = jPasswordField1.getPassword();
        String pass1 = String.valueOf(ch1);
        char ch2[] = jPasswordField2.getPassword();
        String pass2 = String.valueOf(ch2);
        
        System.out.println(dob);
               
       
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Name");
        }
        if (!name.matches("^[a-zA-Z ]+$")) {
            JOptionPane.showMessageDialog(null, "Please Enter Name in word only.");
        }
        else if (dob.equals("Date-Mon-Year")) {
            JOptionPane.showMessageDialog(null, "Please Select Your Date of Birth");
        }
       
        else if (add.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Address");
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Email");

        } else if (!email.contains("@")) {
            JOptionPane.showMessageDialog(null, "Please Enter @");
        }else if (!email.contains(".")) {
            JOptionPane.showMessageDialog(null, "Please Enter Email Domain");
        }

        else if (mob.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Mobile Number");
        } 
        else if(!mob.matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(null, "Mobile Number should be in Integer only");
        }
        else if (mob.length() != 10||mob.length()>10) {
            JOptionPane.showMessageDialog(null, "Please Enter 10 Digit Mobile Number");
        }
        
        else if (uid.isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Enter User ID");
        }
        else if (pass1.isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        }
        else if (pass2.isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Please Enter Confirm Password");
        }
        else if (!pass1.equals(pass2))
        {
            JOptionPane.showMessageDialog(null, "Both Password Are Not Same");
        }

                         
        else
        {
                      
            Statement st=new DBConnection().getDBConnection();
                       MySQLTableUpdater ri=new MySQLTableUpdater();
            
                      
            if(ri.updateUserinfo(st,name, dob, add, email, mob, uid, pass1,authkey))
            {
                JOptionPane.showMessageDialog(null,"Data Updated Successfully");
                jTextField1.setText("");
                jTextArea1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jPasswordField1.setText("");
                jPasswordField2.setText("");
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jComboBox3.setSelectedIndex(0);
                
               
            }
            
            else
            JOptionPane.showMessageDialog(null,"Oops There is Some Error");
            
        

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_TAB)
        {
            if (evt.getModifiers() > 0) {
                        jTextArea1.transferFocusBackward();
                    } else {
                        jTextArea1.transferFocus();
                    }
                    evt.consume();
        }
         
       
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
        jTextField1.setBorder(new LineBorder(clr,2));
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jTextField1.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextArea1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusGained
        // TODO add your handling code here:
         Color clr = new Color(51,161,222);
        jTextArea1.setBorder(new LineBorder(clr,2));
    }//GEN-LAST:event_jTextArea1FocusGained

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        // TODO add your handling code here:
        jTextArea1.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextArea1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
        jTextField2.setBorder(new LineBorder(clr,2));
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        jTextField2.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
        jTextField3.setBorder(new LineBorder(clr,2));
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        jTextField2.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
        jTextField4.setBorder(new LineBorder(clr,2));
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        jTextField4.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTextField4FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
        jPasswordField1.setBorder(new LineBorder(clr,2));
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
        jPasswordField1.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
        jPasswordField2.setBorder(new LineBorder(clr,2));
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        // TODO add your handling code here:
        jPasswordField2.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        ClientUpdateFrame cf = new ClientUpdateFrame();
        cf.setVisible(true);
        cf.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        DataOperationFrame df = new DataOperationFrame();
        df.setVisible(true);
        df.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewDataFrame vf = new ViewDataFrame();
        vf.setVisible(true);
        vf.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginFrame mf = new LoginFrame();
        mf.setVisible(true);
        mf.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientUpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClientUpdateFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}