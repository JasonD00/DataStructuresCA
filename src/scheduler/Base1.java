/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scheduler;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;
import scheduler.Patient;
import scheduler.PatientManager;

/**
 *
 * @author Jason
 */
public class Base1 extends javax.swing.JFrame {

    /**
     * Creates new form Base1
     */
    public Base1() {
        initComponents();
        loadA();
      PatientListP.setVisible(false);
       RegisterP.setVisible(false);
        SchedulingP.setVisible(false);
         AdminP.setVisible(false);
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
        jList1 = new javax.swing.JList<>();
        Home = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ViewP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentT = new javax.swing.JTable();
        Stylebar = new javax.swing.JPanel();
        Stylebar1 = new javax.swing.JPanel();
        ScheduleB = new javax.swing.JButton();
        AdminB = new javax.swing.JButton();
        PatientRegB = new javax.swing.JButton();
        PatientListB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RegisterP = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Stylebar4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        returnRegisterP = new javax.swing.JLabel();
        Stylebar5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        AdminP = new javax.swing.JPanel();
        SchedulingP = new javax.swing.JPanel();
        PatientListP = new javax.swing.JPanel();
        Stylebar2 = new javax.swing.JPanel();
        Stylebar3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Home.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 20, 20));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Home.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 10, 20));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Home.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, 20));

        AppointmentT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Priority", "Room"
            }
        ));
        jScrollPane1.setViewportView(AppointmentT);

        javax.swing.GroupLayout ViewPLayout = new javax.swing.GroupLayout(ViewP);
        ViewP.setLayout(ViewPLayout);
        ViewPLayout.setHorizontalGroup(
            ViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ViewPLayout.setVerticalGroup(
            ViewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        Home.add(ViewP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 310, 200));

        Stylebar.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout StylebarLayout = new javax.swing.GroupLayout(Stylebar);
        Stylebar.setLayout(StylebarLayout);
        StylebarLayout.setHorizontalGroup(
            StylebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        StylebarLayout.setVerticalGroup(
            StylebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Home.add(Stylebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        Stylebar1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout Stylebar1Layout = new javax.swing.GroupLayout(Stylebar1);
        Stylebar1.setLayout(Stylebar1Layout);
        Stylebar1Layout.setHorizontalGroup(
            Stylebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        Stylebar1Layout.setVerticalGroup(
            Stylebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Home.add(Stylebar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        ScheduleB.setText("Scheduling");
        ScheduleB.setToolTipText("View The Shedule");
        ScheduleB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScheduleBMouseClicked(evt);
            }
        });
        Home.add(ScheduleB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 140, -1));

        AdminB.setText("Admin Controls");
        AdminB.setToolTipText("Administrator Controls");
        AdminB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminBMouseClicked(evt);
            }
        });
        AdminB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBActionPerformed(evt);
            }
        });
        Home.add(AdminB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 140, -1));

        PatientRegB.setText("Patient/Registration");
        PatientRegB.setToolTipText("Register New Patients Here");
        PatientRegB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientRegBMouseClicked(evt);
            }
        });
        Home.add(PatientRegB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 140, -1));

        PatientListB.setText("Patient List");
        PatientListB.setToolTipText("View Patients Here");
        PatientListB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientListBMouseClicked(evt);
            }
        });
        Home.add(PatientListB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scheduler/HelpD.jpg"))); // NOI18N
        Home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RegisterP.setBackground(new java.awt.Color(255, 255, 255));
        RegisterP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        RegisterP.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, 20));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        RegisterP.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 20, 20));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Priority:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Room:");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("jTextField1");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("jTextField2");

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("jTextField3");

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setText("jTextField4");

        jList2.setBackground(new java.awt.Color(204, 204, 204));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        RegisterP.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 800, 440));

        Stylebar4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Register New Patients");

        returnRegisterP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scheduler/left-arrow.png"))); // NOI18N
        returnRegisterP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnRegisterPMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Stylebar4Layout = new javax.swing.GroupLayout(Stylebar4);
        Stylebar4.setLayout(Stylebar4Layout);
        Stylebar4Layout.setHorizontalGroup(
            Stylebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stylebar4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnRegisterP)
                .addGap(342, 342, 342)
                .addComponent(jLabel6)
                .addContainerGap(401, Short.MAX_VALUE))
        );
        Stylebar4Layout.setVerticalGroup(
            Stylebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stylebar4Layout.createSequentialGroup()
                .addGroup(Stylebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnRegisterP)
                    .addComponent(jLabel6))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        RegisterP.add(Stylebar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        Stylebar5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout Stylebar5Layout = new javax.swing.GroupLayout(Stylebar5);
        Stylebar5.setLayout(Stylebar5Layout);
        Stylebar5Layout.setHorizontalGroup(
            Stylebar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        Stylebar5Layout.setVerticalGroup(
            Stylebar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        RegisterP.add(Stylebar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scheduler/HelpD.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        RegisterP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        AdminP.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout AdminPLayout = new javax.swing.GroupLayout(AdminP);
        AdminP.setLayout(AdminPLayout);
        AdminPLayout.setHorizontalGroup(
            AdminPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        AdminPLayout.setVerticalGroup(
            AdminPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SchedulingPLayout = new javax.swing.GroupLayout(SchedulingP);
        SchedulingP.setLayout(SchedulingPLayout);
        SchedulingPLayout.setHorizontalGroup(
            SchedulingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        SchedulingPLayout.setVerticalGroup(
            SchedulingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        PatientListP.setBackground(new java.awt.Color(255, 204, 204));
        PatientListP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stylebar2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout Stylebar2Layout = new javax.swing.GroupLayout(Stylebar2);
        Stylebar2.setLayout(Stylebar2Layout);
        Stylebar2Layout.setHorizontalGroup(
            Stylebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        Stylebar2Layout.setVerticalGroup(
            Stylebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        PatientListP.add(Stylebar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        Stylebar3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout Stylebar3Layout = new javax.swing.GroupLayout(Stylebar3);
        Stylebar3.setLayout(Stylebar3Layout);
        Stylebar3Layout.setHorizontalGroup(
            Stylebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        Stylebar3Layout.setVerticalGroup(
            Stylebar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        PatientListP.add(Stylebar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        PatientListP.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 800, 440));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scheduler/HelpD.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        PatientListP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RegisterP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AdminP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SchedulingP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PatientListP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RegisterP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AdminP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SchedulingP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PatientListP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminBActionPerformed

    private void PatientRegBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientRegBMouseClicked
    RegisterP.setVisible(true);
     Home.setVisible(false);
      
    
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientRegBMouseClicked

    private void PatientListBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientListBMouseClicked
        PatientListP.setVisible(true);
        Home.setVisible(false);
          
      
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientListBMouseClicked

    private void ScheduleBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScheduleBMouseClicked
        SchedulingP.setVisible(true);
         Home.setVisible(false);
         
        // TODO add your handling code here:
    }//GEN-LAST:event_ScheduleBMouseClicked

    private void AdminBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBMouseClicked
        AdminP.setVisible(true);
         Home.setVisible(false);
         
         
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminBMouseClicked

    private void returnRegisterPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnRegisterPMouseClicked
        
 RegisterP.setVisible(false);
     Home.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_returnRegisterPMouseClicked

    //Load data from LL into the Jtable on home
    private void loadA() {
        Object [] result = PatientManager.loadD(); //grabbing the patient list from dat
        
        //check here if result 0 is our linked list 
        if (result[0] instanceof LinkedList) {
            LinkedList<Patient>  patientList = (LinkedList<Patient>) result[0];
            
            //for adding to the table and make sure it can be populated with new updated data 
            DefaultTableModel model = (DefaultTableModel) AppointmentT.getModel();
            model.setRowCount(0); //clear any existing data
            
            //adding data from the patient list
            for (Patient p : patientList) {
                Object[] row = {p.getName(), p.getAge(), p.getPriority(), p.getRoom()};
                model.addRow(row);
            }
            
            
        } else {
            System.out.println("Error");
        }
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        LinkedList<Patient> patientList = new LinkedList<>();
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>();
        Queue<String> noShowQueue = new LinkedList<>();
        Stack<Patient> undoStack = new Stack<>();
        
       patientList.add(new Patient("John Dee", 25, "Urgent", false ));
       patientList.add(new Patient("Josh Boyne", 22, "Minor", true ));
       patientList.add(new Patient("Sam Lee", 67, "Urgent", true ));
       patientList.add(new Patient("Ryan Sher", 20, "Minor", false ));
       patientList.add(new Patient("Ciara Park", 45, "Urgent", false ));
       
       patientQueue.addAll(patientList); // adding patients ot the priority queue
       
        //Saving data to the dat file
       PatientManager.saveD(patientList, patientQueue, noShowQueue, undoStack);
       System.out.println(" success");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminB;
    private javax.swing.JPanel AdminP;
    private javax.swing.JTable AppointmentT;
    private javax.swing.JPanel Home;
    private javax.swing.JButton PatientListB;
    private javax.swing.JPanel PatientListP;
    private javax.swing.JButton PatientRegB;
    private javax.swing.JPanel RegisterP;
    private javax.swing.JButton ScheduleB;
    private javax.swing.JPanel SchedulingP;
    private javax.swing.JPanel Stylebar;
    private javax.swing.JPanel Stylebar1;
    private javax.swing.JPanel Stylebar2;
    private javax.swing.JPanel Stylebar3;
    private javax.swing.JPanel Stylebar4;
    private javax.swing.JPanel Stylebar5;
    private javax.swing.JPanel ViewP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel returnRegisterP;
    // End of variables declaration//GEN-END:variables
}
