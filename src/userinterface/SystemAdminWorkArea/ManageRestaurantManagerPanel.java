/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ManageRestaurantManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCustomerDetails
     */
    JPanel userProcessContainer;
    EcoSystem system;
    
    public ManageRestaurantManagerPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurants = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lbPassword = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtRestaurantName = new javax.swing.JTextField();
        lbRestaurant = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lbPassword1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 51));

        tblRestaurants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant Name", "Manager Name", "Username", "Phone Number", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblRestaurants);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnSubmit.setText("Update");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lbPassword.setText("Phone Number :");

        lbName.setText("Manager Name :");

        lbUsername.setText("Username :");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbRestaurant.setText("Restaurant Name :");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        lbPassword1.setText("Address :");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(102, 255, 255));
        lblTitle.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Restaurant Managers");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbRestaurant)
                            .addComponent(lbUsername)
                            .addComponent(lbName)
                            .addComponent(lbPassword)
                            .addComponent(lbPassword1))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName)
                                .addComponent(txtUsername)
                                .addComponent(txtPhoneNumber)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(btnSubmit)))
                            .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnView))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRestaurant))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword1))
                .addGap(28, 28, 28)
                .addComponent(btnSubmit)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                systemAdminWorkAreaJPanel.populateTree();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblRestaurants.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblRestaurants.getModel();
        String name = txtName.getText();
        String restaurantName = txtRestaurantName.getText();
        String userName = txtUsername.getText();
        long phoneNumber = Long.parseLong(txtPhoneNumber.getText());
        String address = txtAddress.getText();
        
        ArrayList<Restaurant> restos = system.getRestaurantDirectory().returnAllRestaurants();
        for(Restaurant r: restos)
        {
            if(r.getManagerName().equals(name))
            {
               r.returnUserAcc().setUsername(txtUsername.getText());
               r.setManagerName(txtName.getText());
               r.setRestaurantName(restaurantName);
               r.setPhoneNumber(Long.parseLong(txtPhoneNumber.getText()));
               r.setAddress(txtAddress.getText());
               break;
            }
            
        }
        system.setRestaurantDirectory(restos);
        JOptionPane.showMessageDialog(this, "Updated the details successfully");
        txtName.setText("");txtUsername.setText("");txtRestaurantName.setText("");
        txtAddress.setText("");txtPhoneNumber.setText("");
        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
          int selectedRowIndex = tblRestaurants.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to View");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblRestaurants.getModel();
        Restaurant selectedRestaurant = (Restaurant)model.getValueAt(selectedRowIndex, 0);
        txtName.setText("");
        txtName.setText(selectedRestaurant.getManagerName());
        txtUsername.setText("");
        txtUsername.setText(selectedRestaurant.returnUserAcc().getUsername());
        txtRestaurantName.setText("");
        txtRestaurantName.setText(selectedRestaurant.getRestaurantName());
        txtAddress.setText("");
        txtAddress.setText(selectedRestaurant.getAddress());
        txtPhoneNumber.setText("");
        txtPhoneNumber.setText(String.valueOf(selectedRestaurant.getPhoneNumber()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblRestaurants.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblRestaurants.getModel();
        Restaurant selectedRestaurant = (Restaurant)model.getValueAt(selectedRowIndex, 0);
        // First delete the customer from employee
        this.system.getEmployeeDirectory().deleteEmployee(selectedRestaurant.getManagerName());
        // And thne delete the userAccount
        this.system.getUserAccountDirectory().deleteUserAccount(
                this.system.getRestaurantDirectory().returnAllRestaurants().
                        get(selectedRowIndex).returnUserAcc()
        );
        // finally delete the user from customer directory
        this.system.getRestaurantDirectory().removeRestaurant(selectedRestaurant);
        
        JOptionPane.showMessageDialog(this, "Deleted the restaurant Successfully");
        for(Customer ck : this.system.getCustomerDirectory().returnCustomerDetails()){
            System.out.println(ck.getName());
        }
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPassword1;
    private javax.swing.JLabel lbRestaurant;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblRestaurants;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTable(){
        System.out.println("Inside method to populate Restaurant details table");
        DefaultTableModel model = (DefaultTableModel) tblRestaurants.getModel();
        model.setRowCount(0);

        for(Restaurant rest : this.system.getRestaurantDirectory().returnAllRestaurants()){
            System.out.println(rest);
            Object[] row = new Object[5];
            row[0] = rest;
            row[1] = rest.getManagerName();
            row[2] = rest.returnUserAcc().getUsername();
            row[3] = String.valueOf(rest.getPhoneNumber());
            row[4] = rest.getAddress();
            model.addRow(row);
        }
    }

}
