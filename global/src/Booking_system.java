/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAGAR
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Booking_system {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public void insertUpdateDeleteBooking(char Operation,Integer booking_id,Integer customer_id,
            Integer concert_id,String username,String concert_name,String venue,String date,String tickets,String total,String description,String status){
        con = MyConnection.getConnection();
        if(Operation=='i')
        {
            try{
                String query = "INSERT into booking(customer_id,concert_id,username,concert_name,venue,date,tickets,total,description,status)"+"values(?,?,?,?,?,?,?,?,?,?)";
                 ps=con.prepareStatement(query);
                ps.setInt(1,customer_id);
                ps.setInt(2,concert_id);
                ps.setString(3,username);
                ps.setString(4,concert_name);
                ps.setString(5,venue);
                ps.setString(6,date);
                ps.setString(7,tickets);
                ps.setString(8,total);
                ps.setString(9, description);
                ps.setString(10, status);
               if(ps.executeUpdate()>0)
               {JOptionPane.showMessageDialog(null,"you booked total no. of"+" "+tickets+" "+" tickets");}
                 
                
                
            }
            catch(SQLException ex)
            {JOptionPane.showMessageDialog(null,ex);}
        }
        
        else if(Operation =='U')
        {
              
            try{
                String query = "UPDATE booking SET tickets=?,status=? WHERE customer_id=? AND concert_id=?";
                ps=con.prepareStatement(query);
                ps.setString(1,tickets);
                ps.setString(2,status);
                ps.setInt(3,customer_id);
                ps.setInt(4,concert_id);
               if(ps.executeUpdate()>0)
               {JOptionPane.showMessageDialog(null,"update successfully");}
                 
                
                
            }
            catch(SQLException ex)
            {JOptionPane.showMessageDialog(null,ex);}
        }
        
    
    else if(Operation =='D')
        {
              
            try{
                String query = "DELETE from booking WHERE booking_id=?";
                 ps=con.prepareStatement(query);
                 ps.setInt(1,booking_id);
                  if(ps.executeUpdate()>0)
               {JOptionPane.showMessageDialog(null,"deleted successfully");}
           }
                 
            catch(SQLException ex)
            {JOptionPane.showMessageDialog(null,ex);}
        }
        }
    public ResultSet viewUserBooked(String username){
     try{ con =MyConnection.getConnection();
            String event = "SELECT * FROM booking WHERE username =?";
            ps = con.prepareStatement(event);
            ps.setString(1,username);
            
            rs=ps.executeQuery();
      }
        catch(SQLException e){
           e.printStackTrace();}
        return rs;}
    
    public ResultSet viewAllBooked(){
     try{ con =MyConnection.getConnection();
            String event = "SELECT * FROM booking";
            ps = con.prepareStatement(event);
            rs=ps.executeQuery();
      }
        catch(SQLException e){
           e.printStackTrace();}
        return rs;}

 public void fillInvoiceJtable(JTable table,String valueToSearch){
 Connection con =MyConnection.getConnection();
 try{   
     String query = "SELECT * FROM booking WHERE  CONCAT(username,customer_id)LIKE ?";
        ps=con.prepareStatement(query);
        ps.setString(1,"%"+valueToSearch+"%");
        
        rs =ps.executeQuery();
        DefaultTableModel model =(DefaultTableModel)table.getModel();
        Object [] row;
        while(rs.next()){
            row = new Object[11];
            row[0]=rs.getInt(1);
            row[1]=rs.getString(2);
            row[2]=rs.getString(3);
            row[3]=rs.getString(4);
            row[4]=rs.getString(5);
            row[5]=rs.getString(6);
            row[6]=rs.getString(7);
            row[7]=rs.getString(8);
            row[8]=rs.getString(9);
            row[9]=rs.getString(10);
            row[10]=rs.getString(11);
            
            
            
            model.addRow(row);
        }
        
 }
  catch(SQLException e){
           e.printStackTrace();}
        }

    void insertUpdateDeleteBooking(char c, Object object, int customer_id, int concert_id, Object object0, Object object1, Object object2, Object object3, String tickets, Object object4, Object object5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
