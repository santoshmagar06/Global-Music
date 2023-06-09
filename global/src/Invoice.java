
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Invoice extends javax.swing.JInternalFrame {
 Connection con = null;
    PreparedStatement ps=null;
    ResultSet rs = null;
    
    Booking_system bs = new Booking_system();
    public Invoice() {
        initComponents();
        bs.fillInvoiceJtable(Invoice_Table, "");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
      public void viewBooking(){
        rs =bs.viewAllBooked();
        Invoice_Table.setModel(DbUtils.resultSetToTableModel(rs));
    }
      
     public Double total(){
         Double total =0.0;
           con=MyConnection.getConnection();
           String username =txt_username.getText();
        try { String query = "SELECT FORMAT(SUM(total), 2) total FROM booking WHERE username = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              total = Double.parseDouble(rs.getString(1));
             
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
    
        return total;}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_customerid = new javax.swing.JLabel();
        status_combo = new javax.swing.JComboBox();
        lbl_total = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        search_username = new javax.swing.JTextField();
        txt_username = new javax.swing.JLabel();
        btn_generateinvoice = new javax.swing.JButton();
        jbll = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_year = new javax.swing.JTextField();
        txt_month = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        lbl_concertid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Invoice_Table = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_customerid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_customerid.setText(":");
        getContentPane().add(txt_customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 30));

        status_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        status_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "paid", "unpaid", " " }));
        getContentPane().add(status_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 80, 30));

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total.setText(":");
        getContentPane().add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 70, 20));

        jPanel1.setBackground(new java.awt.Color(83, 39, 131));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Enter Username ");

        search_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_usernameKeyReleased(evt);
            }
        });

        txt_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_username.setText(":");
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usernameKeyReleased(evt);
            }
        });

        btn_generateinvoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_generateinvoice.setText("Generate Invoice");
        btn_generateinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateinvoiceActionPerformed(evt);
            }
        });

        jbll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbll.setText("Year");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Month");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Concert Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Customer Id");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Status");

        jlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel.setText("Total");

        Invoice_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "booking_id", "customer_id", "concert_id", "username", "concert_name", "venue", "tickets", "date", "total", "description", "status"
            }
        ));
        Invoice_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Invoice_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Invoice_Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbll, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addComponent(txt_year))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_month, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(269, 269, 269))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(btn_generateinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_concertid, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(search_username, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(search_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlabel)
                                    .addComponent(jbll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                    .addComponent(lbl_concertid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_generateinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generateinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateinvoiceActionPerformed
      int customer_id =Integer.parseInt(txt_customerid.getText());
      int concert_id = Integer.parseInt(lbl_concertid.getText());
      String date = txt_year.getText();
      String month = txt_month.getText();
      Double total = Double.parseDouble(lbl_total.getText());
      String status = status_combo.getSelectedItem().toString();
        try{ con = MyConnection.getConnection();
            String generate = "INSERT INTO Invoice(customer_id,year,month,total_amount,status)"+"values(?,?,?,?,?)";
            ps = con.prepareStatement(generate);
            ps.setInt(1, customer_id);
            ps.setString(2,date );
            ps.setString(3, month);
            ps.setDouble(4, total);
            ps.setString(5, status);
            if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null, "Invoice Generated Succesfully");
                    try{
                String query = "UPDATE booking SET status=? WHERE customer_id=? AND concert_id=?";
                ps=con.prepareStatement(query);
                ps.setString(1,status);
                ps.setInt(2,customer_id);
                ps.setInt(3,concert_id);
               if(ps.executeUpdate()>0)
               {JOptionPane.showMessageDialog(null,"update successfully");}
                 
                
                
            }
            catch(SQLException ex)
            {JOptionPane.showMessageDialog(null,ex);}
        }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            JOptionPane.showMessageDialog(null, "not connected");
        }
    }//GEN-LAST:event_btn_generateinvoiceActionPerformed

    private void Invoice_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Invoice_TableMouseClicked
            try{  DefaultTableModel model = (DefaultTableModel)Invoice_Table.getModel();
            //get the selected row index
            int selectedRowIndex = Invoice_Table.getSelectedRow();
            //set the selected row data into JLabels
            String customer_id = model.getValueAt(selectedRowIndex, 1).toString();
            String concert_id = model.getValueAt(selectedRowIndex, 2).toString();
            String username =   model.getValueAt(selectedRowIndex, 3).toString();
            String total = model.getValueAt(selectedRowIndex, 8).toString();
            String status = model.getValueAt(selectedRowIndex, 10).toString();
            //sets table value the textfiels while ckicking on the row of table;
            txt_customerid.setText(customer_id);
            lbl_concertid.setText(concert_id);
            txt_username.setText(username);
            status_combo.setSelectedItem(status);
            lbl_total.setText(total);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            JOptionPane.showMessageDialog(null, "not connected");
        }

                             
    }//GEN-LAST:event_Invoice_TableMouseClicked

    private void search_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_usernameKeyReleased
        Invoice_Table.setModel(new DefaultTableModel(null,new Object[]{"booking_id","customer_id","concert_id","username","concert_name","venue","date","tickets","total","description","status"}));     
        bs.fillInvoiceJtable(Invoice_Table, search_username.getText());
    }//GEN-LAST:event_search_usernameKeyReleased

    private void txt_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyReleased
       if(txt_username.getText().length()==0){
       lbl_total.setText("");}
       else
           lbl_total.setText(String.valueOf(total()));
        
    }//GEN-LAST:event_txt_usernameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Invoice_Table;
    private javax.swing.JButton btn_generateinvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbll;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel lbl_concertid;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTextField search_username;
    private javax.swing.JComboBox status_combo;
    private javax.swing.JLabel txt_customerid;
    private javax.swing.JTextField txt_month;
    private javax.swing.JLabel txt_username;
    private javax.swing.JTextField txt_year;
    // End of variables declaration//GEN-END:variables
}
