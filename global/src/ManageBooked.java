
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class ManageBooked extends javax.swing.JInternalFrame {
    Connection con = null;
    PreparedStatement ps=null;
    ResultSet rs = null;
    Booking_system bs = new Booking_system();
    
    public ManageBooked() {
        initComponents();
        viewBooking();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     public void viewBooking(){
        rs =bs.viewAllBooked();
        Booking_Table.setModel(DbUtils.resultSetToTableModel(rs));}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Booking_Table = new javax.swing.JTable();
        txt_bookingid = new javax.swing.JTextField();
        txt_concertid = new javax.swing.JTextField();
        txt_customerid = new javax.swing.JTextField();
        txt_notickets = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Booking_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "booking_id", "customer_id", "concert_id", "username", "concert_name", "venue", "tickets", "date", "total", "description", "status"
            }
        ));
        Booking_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Booking_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Booking_Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 460, 130));
        getContentPane().add(txt_bookingid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 160, 30));
        getContentPane().add(txt_concertid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 160, 30));
        getContentPane().add(txt_customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 160, 30));
        getContentPane().add(txt_notickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 160, 30));
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 160, 30));

        jPanel1.setBackground(new java.awt.Color(255, 0, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Booking Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Concert Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Customer Id");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("No. of Ticket");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Total Amount");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 270));

        btn_update.setBackground(new java.awt.Color(240, 85, 58));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/25118.png"))); // NOI18N
        btn_update.setText(" Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 160, 40));

        btn_cancel.setBackground(new java.awt.Color(240, 94, 45));
        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xc.PNG"))); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Faeland-Tour-1170x650.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Booking_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Booking_TableMouseClicked
        try{  DefaultTableModel model = (DefaultTableModel)Booking_Table.getModel();

            //get the selected row index
            int selectedRowIndex = Booking_Table.getSelectedRow();

            //set the selected row data into JLabels
            String booking_id =  model.getValueAt(selectedRowIndex, 0).toString();
            String concert_id =  model.getValueAt(selectedRowIndex, 2).toString();
            String customer_id = model.getValueAt(selectedRowIndex, 1).toString();
            String notickets = model.getValueAt(selectedRowIndex, 7).toString();
            String total = model.getValueAt(selectedRowIndex, 8).toString();

            txt_concertid.setText(concert_id);
            txt_bookingid.setText(booking_id);
            txt_customerid.setText(customer_id);
            txt_notickets.setText(notickets);
            txt_total.setText(total);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            JOptionPane.showMessageDialog(null, "not connected");
        }

    }//GEN-LAST:event_Booking_TableMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        con =MyConnection.getConnection();
        int concert_id =Integer.parseInt(txt_concertid.getText());
        int customer_id =Integer.parseInt(txt_customerid.getText());
         //String status =b.paidOrUnpaid();
        String tickets =txt_notickets.getText();
        bs.insertUpdateDeleteBooking('U', null, customer_id, concert_id, null, null, null, null, tickets, null,null);
        viewBooking();
        txt_concertid.setText("");
        txt_bookingid.setText("");
        txt_customerid.setText("");
        txt_notickets.setText("");
        txt_total.setText("");
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        int booking_id =Integer.parseInt(txt_bookingid.getText());
        
        //int concert_id =Integer.parseInt(txt_concertid.getText());
        bs.insertUpdateDeleteBooking('D', booking_id,null,null, null, null, null, null, null, null, null,null);
        viewBooking();
        txt_concertid.setText("");
        txt_bookingid.setText("");
        txt_customerid.setText("");
        txt_notickets.setText("");
        txt_total.setText("");
    }//GEN-LAST:event_btn_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Booking_Table;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_bookingid;
    private javax.swing.JTextField txt_concertid;
    private javax.swing.JTextField txt_customerid;
    private javax.swing.JTextField txt_notickets;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}