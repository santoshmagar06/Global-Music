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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class MyConnection {
    public static Connection getConnection(){
    Connection con = null;
    try{
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/globalmusic","root","");
    }
    catch(Exception ex){
        System.out.print(ex.getMessage());
    }
    return con;}
}
    

