
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAGAR
 */
public class ViewEvent extends javax.swing.JFrame {

    /**
     * Creates new form ViewEvent
     */
    
    Orgarnizer og = new Orgarnizer();
    public ViewEvent() {
        initComponents();
        og.fillOrgarnizerJtable(EventsTable,"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        txt_tickets = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_venue = new javax.swing.JTextField();
        txt_agent = new javax.swing.JTextField();
        txt_eventname = new javax.swing.JTextField();
        txt_eventid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        txt_artist = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        EventsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("View Event");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        txt_date.setText(" ");
        jDesktopPane1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 220, 30));

        txt_tickets.setText(" ");
        jDesktopPane1.add(txt_tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 220, 30));

        txt_price.setText(" ");
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 220, 30));

        txt_venue.setText(" ");
        jDesktopPane1.add(txt_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 220, 30));

        txt_agent.setText(" ");
        jDesktopPane1.add(txt_agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 220, 30));

        txt_eventname.setText(" ");
        jDesktopPane1.add(txt_eventname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, 30));

        txt_eventid.setText(" ");
        txt_eventid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eventidActionPerformed(evt);
            }
        });
        jDesktopPane1.add(txt_eventid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 220, 30));

        txt_description.setColumns(20);
        txt_description.setRows(5);
        jScrollPane1.setViewportView(txt_description);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 220, 50));

        txt_artist.setText(" ");
        jDesktopPane1.add(txt_artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 220, 30));

        jPanel1.setBackground(new java.awt.Color(215, 250, 225));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("No. of Tickets");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Date & Time");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Price");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Venue");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Agent");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Event Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Event Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Artist Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(19, 19, 19))
        );

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 380));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vote-512.png"))); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 110, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view-book-5-1110479.png"))); // NOI18N
        jButton2.setText("view");
        jDesktopPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-arrow-icon-vector-260nw-1323173810.png"))); // NOI18N
        jButton3.setText(" ");
        jDesktopPane1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        EventsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "event_name", "artists", "agent", "venue", "price", "tickets", "date", "description"
            }
        ));
        EventsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(EventsTable);

        jDesktopPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 520, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp2881172.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 960, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_eventidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eventidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eventidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txt_eventid.getText().equals("")&&txt_eventname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"choose event you want to book");}
        
       
        else{
         
         Booking b= new Booking();
                b.setVisible(true);
                dispose();
        Booking.txt_username.setText(LoginPage.txt_username.getText());
        Booking.txt_eventid.setText(txt_eventid.getText());
        Booking.txt_eventname.setText(txt_eventname.getText());
        Booking.txt_price.setText(txt_price.getText());
        Booking.txt_datetime.setText(txt_date.getText());
        Booking.txt_avltickets.setText(txt_tickets.getText());
        Booking.txt_des.setText(txt_description.getText());
        Booking.txt_venue.setText(txt_venue.getText());
        Booking.txt_artists.setText(txt_artist.getText());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EventsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsTableMouseClicked
        // TODO add your handling code here:

           try{  DefaultTableModel model = (DefaultTableModel)EventsTable.getModel();
            
            //get the selected row index
            int selectedRowIndex = EventsTable.getSelectedRow();
            
            //set the selected row data into JLabels
            String event_id =  model.getValueAt(selectedRowIndex, 0).toString();
            String event_name =  model.getValueAt(selectedRowIndex, 1).toString();
            String artist = model.getValueAt(selectedRowIndex, 2).toString();
            String agent = model.getValueAt(selectedRowIndex, 3).toString();
            String venue = model.getValueAt(selectedRowIndex, 4).toString();
            String price = model.getValueAt(selectedRowIndex, 5).toString();
            String tickets = model.getValueAt(selectedRowIndex, 6).toString();
            String date = model.getValueAt(selectedRowIndex, 7).toString();
            String description = model.getValueAt(selectedRowIndex, 8).toString();
            
            txt_eventid.setText(event_id);
            txt_eventname.setText(event_name);
            txt_artist.setText(artist);
            txt_agent.setText(agent);
            txt_venue.setText(venue);
            txt_price.setText(price);
            txt_tickets.setText(tickets);
            txt_date.setText(date);
            txt_description.setText(description);
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            JOptionPane.showMessageDialog(null, "not connected");
        }
    }//GEN-LAST:event_EventsTableMouseClicked

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
            java.util.logging.Logger.getLogger(ViewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EventsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_agent;
    private javax.swing.JTextField txt_artist;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextArea txt_description;
    private javax.swing.JTextField txt_eventid;
    private javax.swing.JTextField txt_eventname;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_tickets;
    private javax.swing.JTextField txt_venue;
    // End of variables declaration//GEN-END:variables
}