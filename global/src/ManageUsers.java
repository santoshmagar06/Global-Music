
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAGAR
 */
public class ManageUsers extends javax.swing.JInternalFrame {
 Connection con = null;
    ResultSet rs = null;
    
   
    users1 u = new users1();
    public ManageUsers() {
        initComponents();
        u.fillCustomerJtable(CustomerTable,"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_contact = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_postcode = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_fullname = new javax.swing.JTextField();
        txt_customerid = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Customer = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_pass2 = new javax.swing.JTextField();
        txt_pass1 = new javax.swing.JTextField();
        txt_account = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();
        combo_type = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(860, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 43, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Manage User");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Full Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Post Code");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Contact No.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        txt_contact.setText(" ");
        jPanel1.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 200, 30));

        txt_email.setText(" ");
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 200, 30));

        txt_postcode.setText(" ");
        jPanel1.add(txt_postcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 200, 30));

        txt_address.setText(" ");
        jPanel1.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 200, 30));

        txt_fullname.setText(" ");
        jPanel1.add(txt_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 200, 30));

        txt_customerid.setText(" ");
        txt_customerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customeridActionPerformed(evt);
            }
        });
        jPanel1.add(txt_customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, 30));

        txt_username.setText(" ");
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, 30));

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));

        Customer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Customer.setText("Customer Id");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("User Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Customer)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 270));

        txt_pass2.setText(" ");
        jPanel1.add(txt_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 190, 30));

        txt_pass1.setText(" ");
        txt_pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pass1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 190, 30));

        txt_account.setText(" ");
        jPanel1.add(txt_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 190, 30));

        btn_remove.setBackground(new java.awt.Color(204, 255, 204));
        btn_remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/808361_cancel_512x512.png"))); // NOI18N
        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 150, 40));

        combo_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combo_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Individual", "Organization", "Organizer" }));
        jPanel1.add(combo_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 190, 30));

        jPanel3.setBackground(new java.awt.Color(51, 255, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Enter Password");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Re-enter Password");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("User Type");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Account No.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 210, 170));

        btn_update.setBackground(new java.awt.Color(204, 255, 204));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/25118.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 130, 40));

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "fullname", "username", "address", "postcode", "contact", "email", "password", "type", "account"
            }
        ));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 470, 150));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mf_060215_concert_band-1_kevin_lanterman_ copy.jpg"))); // NOI18N
        jLabel14.setText(" ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2016-06-01-27-sunsetfestival.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 630, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_customeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customeridActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pass1ActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:

        String full_name=txt_fullname.getText();
        String username=txt_username.getText();
        String address=txt_address.getText();
        String postcode = txt_postcode.getText();
        String contact=txt_contact.getText();
        String email =txt_email.getText();
        String password1=txt_pass1.getText();
        String password=txt_pass2.getText();
        String type=combo_type.getSelectedItem().toString();
        String account = txt_account.getText();

        u.insertedUpdateDeleteStudent('D', null, full_name, username, address, postcode, contact, email, password, type, account);
        rs= u.viewdata();
        CustomerTable.setModel(DbUtils.resultSetToTableModel(rs));

        txt_customerid.setText("");
        txt_fullname.setText("");
        txt_username.setText("");
        txt_address.setText("");
        txt_postcode.setText("");
        txt_contact.setText("");
        txt_email.setText("");
        txt_pass1.setText("");
        txt_pass2.setText("");
        combo_type.setSelectedItem("");
        txt_account.setText("");

    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String full_name=txt_fullname.getText();
        String username=txt_username.getText();
        String address=txt_address.getText();
        String postcode = txt_postcode.getText();
        String contact=txt_contact.getText();
        String email =txt_email.getText();
        String password1=txt_pass1.getText();
        String password=txt_pass2.getText();
        String type=combo_type.getSelectedItem().toString();
        String account = txt_account.getText();

        u.insertedUpdateDeleteStudent('U', null, full_name, username, address, postcode, contact, email, password, type, account);
        rs= u.viewdata();
        CustomerTable.setModel(DbUtils.resultSetToTableModel(rs));

        txt_customerid.setText("");
        txt_fullname.setText("");
        txt_username.setText("");
        txt_address.setText("");
        txt_postcode.setText("");
        txt_contact.setText("");
        txt_email.setText("");
        txt_pass1.setText("");
        txt_pass2.setText("");
        combo_type.setSelectedItem("");
        txt_account.setText("");

    }//GEN-LAST:event_btn_updateActionPerformed

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        // TODO add your handling code here:
        try{  DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();

            //get the selected row index
            int selectedRowIndex = CustomerTable.getSelectedRow();

            //set the selected row data into JLabels
            String customer_id =  model.getValueAt(selectedRowIndex, 0).toString();
            String full_name =  model.getValueAt(selectedRowIndex, 1).toString();
            String username = model.getValueAt(selectedRowIndex, 2).toString();
            String address = model.getValueAt(selectedRowIndex, 3).toString();
            String postcode = model.getValueAt(selectedRowIndex, 4).toString();
            String contact = model.getValueAt(selectedRowIndex, 5).toString();
            String email = model.getValueAt(selectedRowIndex, 6).toString();
            String password = model.getValueAt(selectedRowIndex, 7).toString();
            String type = model.getValueAt(selectedRowIndex, 8).toString();
            String account= model.getValueAt(selectedRowIndex, 9).toString();

            txt_customerid.setText(customer_id);
            txt_fullname.setText(full_name);
            txt_username.setText(username);
            txt_address.setText(address);
            txt_postcode.setText(postcode);
            txt_contact.setText(contact);
            txt_email.setText(email);
            txt_pass1.setText(password);
            txt_pass2.setText(password);
            combo_type.setSelectedItem(type);
            txt_account.setText(account);

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            JOptionPane.showMessageDialog(null, "not connected");
        }
    }//GEN-LAST:event_CustomerTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Customer;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox combo_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txt_account;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_customerid;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_pass1;
    private javax.swing.JTextField txt_pass2;
    private javax.swing.JTextField txt_postcode;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
