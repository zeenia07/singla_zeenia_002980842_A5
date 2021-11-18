/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

/**
 *
 * @author Dell
 */
public class ManageRestaurantManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantManagerPanel
     */
    public ManageRestaurantManagerPanel() {
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

        btnDeleteCust = new javax.swing.JButton();
        btnViewCust = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblCMobile = new javax.swing.JLabel();
        lblCPwd = new javax.swing.JLabel();
        lblCName = new javax.swing.JLabel();
        btnModifyCust = new javax.swing.JButton();
        txtCMobile = new javax.swing.JTextField();
        txtCPwd = new javax.swing.JTextField();
        txtCName = new javax.swing.JTextField();
        lblCAddress = new javax.swing.JLabel();
        lblCUserName = new javax.swing.JLabel();
        txtCAddress = new javax.swing.JTextField();
        txtCUserName = new javax.swing.JTextField();
        lblCID = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();
        btnAddCust = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 51));

        btnDeleteCust.setText("Delete");
        btnDeleteCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustActionPerformed(evt);
            }
        });

        btnViewCust.setText("View");
        btnViewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(102, 255, 255));
        lblTitle.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Restaurant Managers");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Manager ID", "Name", "User Name", "Password", "Mobile Number", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCMobile.setText("Mobile Number: ");

        lblCPwd.setText("Password:");

        lblCName.setText("Name:");

        btnModifyCust.setText("Modify");
        btnModifyCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCustActionPerformed(evt);
            }
        });

        lblCAddress.setText("Address: ");

        lblCUserName.setText("User Name:");

        lblCID.setText("Manager ID:");

        btnAddCust.setText("Create");
        btnAddCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(312, 312, 312)
                                    .addComponent(btnAddCust)
                                    .addGap(31, 31, 31)
                                    .addComponent(btnModifyCust)
                                    .addGap(28, 28, 28)
                                    .addComponent(btnDeleteCust))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(236, 236, 236)
                                    .addComponent(lblCAddress)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCUserName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCMobile)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblCPwd)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCID)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCID, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewCust, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewCust)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCID)
                    .addComponent(txtCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCName)
                    .addComponent(txtCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCUserName)
                    .addComponent(txtCUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPwd)
                    .addComponent(txtCPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCMobile)
                    .addComponent(txtCMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCAddress)
                    .addComponent(txtCAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCust)
                    .addComponent(btnModifyCust)
                    .addComponent(btnDeleteCust))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCustActionPerformed

    private void btnViewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCustActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModifyCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyCustActionPerformed

    private void btnAddCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCustActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCust;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCust;
    private javax.swing.JButton btnModifyCust;
    private javax.swing.JButton btnViewCust;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCAddress;
    private javax.swing.JLabel lblCID;
    private javax.swing.JLabel lblCMobile;
    private javax.swing.JLabel lblCName;
    private javax.swing.JLabel lblCPwd;
    private javax.swing.JLabel lblCUserName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCAddress;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtCMobile;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtCPwd;
    private javax.swing.JTextField txtCUserName;
    // End of variables declaration//GEN-END:variables
}
