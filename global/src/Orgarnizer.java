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
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
public class Orgarnizer {
    Connection con= null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public void insertedUpdateDeleteStudent(char Operation,
            Integer id,String concert_name,
                            String band,String agent,String venue,Integer price,Integer tickets,String date,String description,String is_promoted,String username){
    
    con = MyConnection.getConnection();
    
   
        if (Operation =='i')
        {   
            try{
                
                String abc="INSERT INTO Events(concert_name,band,agent,venue,price,tickets,date, description,is_promoted,username)"+"values(?,?,?,?,?,?,?,?,?,?)";
                ps=con.prepareStatement(abc);
                
                ps.setString(1,concert_name);
                ps.setString(2,band);
                ps.setString(3,agent);
                ps.setString(4,venue);
                ps.setInt(5,price);
                ps.setInt(6,tickets);
                ps.setString(7,date);
                ps.setString(8,description);
                ps.setString(9,is_promoted);
                ps.setString(10,username);
                if(ps.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"New Event Added");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}}
        else if(Operation=='U'){
              try{String query="UPDATE  Events Set band=?,agent=?,venue=?,price=?,tickets=?,date=?, description=?,is_promoted=? WHERE concert_name=?"; 
              ps=con.prepareStatement(query);  
              ps.setString(9,concert_name);
                ps.setString(1,band);
                ps.setString(2,agent);
                ps.setString(3,venue);
                ps.setInt(4,price);
                ps.setInt(5,tickets);
                ps.setString(6,date);
                ps.setString(7,description);
                ps.setString(8,is_promoted);
                if(ps.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Updated success");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}
        }
        
        else if(Operation=='D'){
            
            {
              try{String query="DELETE FROM `Events` WHERE concert_name=?"; 
                ps=con.prepareStatement (query);
                ps.setString(1,concert_name);
              
                if(ps.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Deleted Successesfully");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}
        }
        }
            
            }
 public void fillOrgarnizerJtable(JTable table,String valueToSearch){
 Connection con =MyConnection.getConnection();
 try{   
     String query = "SELECT * FROM events WHERE  CONCAT(concert_id,concert_name,band,agent,venue,price,tickets,date,description,is_promoted)LIKE ?";
        ps=con.prepareStatement(query);
        ps.setString(1,"%"+valueToSearch+"%");
        
        rs =ps.executeQuery();
        DefaultTableModel model =(DefaultTableModel)table.getModel();
        Object [] row;
        while(rs.next()){
            row = new Object[10];
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
            
            
            
            model.addRow(row);
        }
        
 }
  catch(SQLException e){
           e.printStackTrace();}
        }
 
 
 
        
 public ResultSet IsExitEventname(String concert_name){
     try{con =MyConnection.getConnection();
            String user = "SELECT * FROM Events WHERE concert_name =?";
            ps = con.prepareStatement(user);
            ps.setString(1,concert_name);
            rs=ps.executeQuery();
      }
        catch(SQLException e){
           e.printStackTrace();}
        return rs;}
 
        
public ResultSet viewdata(){
     try{ con =MyConnection.getConnection();
            String event = "SELECT * FROM Events ORDER BY is_promoted DESC";
            ps = con.prepareStatement(event);
            
            rs=ps.executeQuery();
      }
        catch(SQLException e){
           e.printStackTrace();}
        return rs;}
    
public ResultSet OrganizerAddedData(String username){
     try{ con =MyConnection.getConnection();
            String event = "SELECT * FROM Events WHERE username =?";
            ps = con.prepareStatement(event);
            ps.setString(1,username);
            
            rs=ps.executeQuery();
      }
        catch(SQLException e){
           e.printStackTrace();}
        return rs;}

public void updateAvailebleTickets(String concert_name,int tickets){
      try{con =MyConnection.getConnection();
          String query="UPDATE  Events Set tickets=? WHERE concert_name=?"; 
              ps=con.prepareStatement(query);  
              ps.setString(2,concert_name);
                ps.setInt(1,tickets);
           
                if(ps.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Updated success");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}
        }

}
