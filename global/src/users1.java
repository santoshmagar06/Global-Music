/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAGAR
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class users1 {
    Connection con= null;
     PreparedStatement ps=null;
     ResultSet rs = null;
    
    public void insertedUpdateDeleteStudent(char Operation,
            Integer id,String full_name,
          String username,String address,String postcode,
          String contact,String email,String password,String type,String account){
    
            con = MyConnection.getConnection();
   
   
        if (Operation =='i')
        {   
            
            try{
                
                String abc="INSERT INTO Customers(full_name,username,address,post_code,contact,email,password,type,account_no)"+"values(?,?,?,?,?,?,?,?,?)";
                ps=con.prepareStatement(abc);
              
                ps.setString(1,full_name);
                ps.setString(2,username);
                ps.setString(3,address);
                ps.setString(4,postcode);
                ps.setString(5,contact);
                ps.setString(6,email);
                ps.setString(7,password);
                ps.setString(8,type);
                ps.setString(9,account);
                if(ps.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Registered success");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}}
        else if(Operation=='U'){
              try{String query="update  Customers Set full_name=?,address=?,post_code=?,contact=?,email=?,password=?,type=?,account_no=? where username=?";
                    ps = con.prepareStatement(query);
               ps.setString(1,full_name);
                ps.setString(9,username);
                ps.setString(2,address);
                ps.setString(3,postcode);
                ps.setString(4,contact);
                ps.setString(5,email);
                ps.setString(6,password);
                ps.setString(7,type);
                ps.setString(8,account);
                if(ps.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Updated success");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}
        }
        
        else if(Operation=='D'){
                int YESOrNo = JOptionPane.showConfirmDialog(null,"if there is booked tickets that also deleted","Delete User",JOptionPane.OK_CANCEL_OPTION);
            {
              try{String query="DELETE FROM `customers` WHERE username=?"; 
                ps=con.prepareStatement (query);
                ps.setString(1,username);
              
                if(ps.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Deleted Successesfully");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}
        }
        }
     
            
    }
  public ResultSet loginCheck(String user,String pass){
      con = MyConnection.getConnection();
      String a = "SELECT type from Customers where username = ? and password=?";
      try{ps= con.prepareStatement(a);
           ps.setString(1, user);
           ps.setString(2,pass);
           rs=ps.executeQuery();
      }
      catch(SQLException e){
           e.printStackTrace();}
      return rs;
    }
 

 public ResultSet viewdata(){
     try{ con =MyConnection.getConnection();
            String abc = "SELECT * FROM customers ";
            ps = con.prepareStatement(abc);
            
            rs=ps.executeQuery();
      }
        catch(SQLException e){
           e.printStackTrace();}
        return rs;}
 
 
 public void fillCustomerJtable(JTable table,String valueToSearch){
 con =MyConnection.getConnection();
 try{   
     String query = "SELECT * FROM customers  WHERE  CONCAT(customer_id,full_name,username,address,post_code,contact,email,password,type,account_no)LIKE ?";
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
 
}
