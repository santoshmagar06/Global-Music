
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class OrganizerManagement extends javax.swing.JInternalFrame {

  Connection con = null;
   PreparedStatement ps = null;
   ResultSet rs = null;
   String username;
   Orgarnizer og = new Orgarnizer();
    public OrganizerManagement() {
        initComponents();
        fillBandCombo();
        username= LoginPage.txt_username.getText();
         viewAddedData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
       public boolean verifText(){
    if(txt_concertname.getText().equals("")||band_combo.getSelectedItem().equals("")
   ||txt_venue.getText().equals("")||txt_tickets.getText().equals("")||
            txt_description.getText().equals(""))
    {
    JOptionPane.showMessageDialog(null,"One or more empty feilds");
    return false;}
    else
    return true;}
   public void fillBandCombo(){
       con = MyConnection.getConnection();
       String name = "SELECT * From band";
      
      try {
          ps=con.prepareStatement(name);
          rs = ps.executeQuery();
          while(rs.next()){
              String bn = rs.getString("name");
              band_combo.addItem(bn);}
          }  catch (SQLException ex) {
          Logger.getLogger(ManageEvents.class.getName()).log(Level.SEVERE, null, ex);}
      }
   
    public void viewAddedData(){
    rs=og.OrganizerAddedData(username);
     EventsTable.setModel(DbUtils.resultSetToTableModel(rs));}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_concertid = new javax.swing.JTextField();
        txt_concertname = new javax.swing.JTextField();
        band_combo = new javax.swing.JComboBox();
        txt_agent = new javax.swing.JTextField();
        txt_venue = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_tickets = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        promo_combo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        EventsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(240, 65, 12));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Agent");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Venue");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Price");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("No. of Ticket");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Date & Time");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Band Name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Is Promoted");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Concert Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Concert Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Description");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 390));
        getContentPane().add(txt_concertid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, 30));

        txt_concertname.setText(" ");
        txt_concertname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_concertnameKeyTyped(evt);
            }
        });
        getContentPane().add(txt_concertname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 160, 30));

        band_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        band_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                band_comboActionPerformed(evt);
            }
        });
        getContentPane().add(band_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, 30));

        txt_agent.setText(" ");
        getContentPane().add(txt_agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 160, 30));

        txt_venue.setText(" ");
        getContentPane().add(txt_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 170, 30));

        txt_price.setText(" ");
        txt_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_priceKeyTyped(evt);
            }
        });
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 170, 30));

        txt_tickets.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ticketsKeyTyped(evt);
            }
        });
        getContentPane().add(txt_tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 170, 30));

        txt_date.setText(" ");
        txt_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dateActionPerformed(evt);
            }
        });
        getContentPane().add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 170, 30));

        promo_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        getContentPane().add(promo_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 70, -1));

        txt_description.setColumns(20);
        txt_description.setRows(5);
        jScrollPane1.setViewportView(txt_description);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 170, 50));

        btn_add.setBackground(new java.awt.Color(255, 51, 0));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zzz.PNG"))); // NOI18N
        btn_add.setText(" Add Concert");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 190, -1));

        btn_update.setBackground(new java.awt.Color(255, 51, 0));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/s-time-table.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 190, 40));

        btn_remove.setBackground(new java.awt.Color(255, 51, 0));
        btn_remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xc.PNG"))); // NOI18N
        btn_remove.setText("Remove Event");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 200, 40));

        btn_view.setBackground(new java.awt.Color(255, 51, 0));
        btn_view.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apple-88-512.png"))); // NOI18N
        btn_view.setText("View Concert");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 200, 40));

        EventsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "concert_name", "band", "agent", "venue", "price", "tickets", "date", "description", "is promoted", "orgarnizer"
            }
        ));
        EventsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(EventsTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 530, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/d7yero8-a46174ef-a1bd-4fd1-9d61-64a8f499933f.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 850, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void band_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_band_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_band_comboActionPerformed

    private void txt_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dateActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
       
        String concert_name=txt_concertname.getText();
        String band = band_combo.getSelectedItem().toString();
        String agent = txt_agent.getText();
        String venue=txt_venue.getText();
        int price = Integer.parseInt(txt_price.getText());
        int tickets=Integer.parseInt(txt_tickets.getText());
        String date=txt_date.getText();
        String description=txt_description.getText();
        String is_promoted = promo_combo.getSelectedItem().toString();

        if(verifText()){
            try {

                rs=og.IsExitEventname(concert_name);
                if(rs.next()){
                    String abc=rs.getString("concert_name");
                    if(abc.equalsIgnoreCase(concert_name)){
                        //System.out.print(abc);
                        JOptionPane.showMessageDialog(null,"Please try other concert name the username you entered is already exist");}}
                else{

                    og.insertedUpdateDeleteStudent('i', null, concert_name, band,agent,venue,price,tickets,date, description,is_promoted,username);
                    rs=og.OrganizerAddedData(username);
                    og.OrganizerAddedData(username);
                    EventsTable.setModel(DbUtils.resultSetToTableModel(rs));}
                //after insertion sets the text feilds empty
                txt_concertid.setText("");
                txt_concertname.setText("");
                ;
                txt_agent.setText("");
                txt_venue.setText("");
                txt_price.setText("");
                txt_tickets.setText("");
                txt_date.setText("");
                txt_description.setText("");
            }

            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String concert_name=txt_concertname.getText();
        String band = band_combo.getSelectedItem().toString();
        String agent = txt_agent.getText();
        String venue=txt_venue.getText();
        int price = Integer.parseInt(txt_price.getText());
        int tickets=Integer.parseInt(txt_tickets.getText());
        String date=txt_date.getText();
        String description=txt_description.getText();
        String is_promoted = promo_combo.getSelectedItem().toString();
        if(verifText()){

            og.insertedUpdateDeleteStudent('U', null, concert_name, band, agent, venue, price, tickets, date, description, is_promoted,null);
            rs=og.OrganizerAddedData(username);
            EventsTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        txt_concertid.setText("");
        txt_concertname.setText("");
        band_combo.setSelectedItem("");
        txt_agent.setText("");
        txt_venue.setText("");
        txt_price.setText("");
        txt_tickets.setText("");
        txt_date.setText("");
        txt_description.setText("");
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:
        String concert_name=txt_concertname.getText();
        String band = band_combo.getSelectedItem().toString();
        String agent = txt_agent.getText();
        String venue=txt_venue.getText();
         int price = Integer.parseInt(txt_price.getText());
        int tickets=Integer.parseInt(txt_tickets.getText());
        String date=txt_date.getText();
        String description=txt_description.getText();
        String is_promoted = promo_combo.getSelectedItem().toString();
        if(!concert_name.equals("")){

            og.insertedUpdateDeleteStudent('D', null, concert_name, band,agent,venue,price,tickets,date, description,is_promoted,null);
            rs=og.OrganizerAddedData(username);
            EventsTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        txt_concertid.setText("");
        txt_concertname.setText("");
        band_combo.setSelectedItem("");
        txt_agent.setText("");
        txt_venue.setText("");
        txt_price.setText("");
        txt_tickets.setText("");
        txt_date.setText("");
        txt_description.setText("");
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        // TODO add your handling code here:
        rs = og.OrganizerAddedData(username);
        EventsTable.setModel(DbUtils.resultSetToTableModel(rs));
    }//GEN-LAST:event_btn_viewActionPerformed

    private void EventsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventsTableMouseClicked
        // TODO add your handling code here:

        try{  DefaultTableModel model = (DefaultTableModel)EventsTable.getModel();

            //get the selected row index
            int selectedRowIndex = EventsTable.getSelectedRow();

            //set the selected row data into JLabels
            String concert_id =  model.getValueAt(selectedRowIndex, 0).toString();
            String concert_name =  model.getValueAt(selectedRowIndex, 1).toString();
            String band = model.getValueAt(selectedRowIndex, 2).toString();
            String agent = model.getValueAt(selectedRowIndex, 3).toString();
            String venue = model.getValueAt(selectedRowIndex, 4).toString();
            String price = model.getValueAt(selectedRowIndex, 5).toString();
            String tickets = model.getValueAt(selectedRowIndex, 6).toString();
            String date = model.getValueAt(selectedRowIndex, 7).toString();
            String description = model.getValueAt(selectedRowIndex, 8).toString();
            String promote = model.getValueAt(selectedRowIndex, 9).toString();

            txt_concertid.setText(concert_id);
            txt_concertname.setText(concert_name);
            band_combo.setSelectedItem(band);
            txt_agent.setText(agent);
            txt_venue.setText(venue);
            txt_price.setText(price);
            txt_tickets.setText(tickets);
            txt_date.setText(date);
            txt_description.setText(description);
            promo_combo.setSelectedItem(promote);

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            JOptionPane.showMessageDialog(null, "not connected");
        }
    }//GEN-LAST:event_EventsTableMouseClicked

    private void txt_concertnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_concertnameKeyTyped
          if(Character.isDigit(evt.getKeyChar())){
       evt.consume();}
    }//GEN-LAST:event_txt_concertnameKeyTyped

    private void txt_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_priceKeyTyped
          if(!Character.isDigit(evt.getKeyChar())){
       evt.consume();}
    }//GEN-LAST:event_txt_priceKeyTyped

    private void txt_ticketsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ticketsKeyTyped
           if(!Character.isDigit(evt.getKeyChar())){
       evt.consume();}
    }//GEN-LAST:event_txt_ticketsKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EventsTable;
    private javax.swing.JComboBox band_combo;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox promo_combo;
    private javax.swing.JTextField txt_agent;
    private javax.swing.JTextField txt_concertid;
    private javax.swing.JTextField txt_concertname;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextArea txt_description;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_tickets;
    private javax.swing.JTextField txt_venue;
    // End of variables declaration//GEN-END:variables
}
