/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Harshit
 */
public class mai {
   
   
    public String to="";
    public String by="hmharsh3@gmail.com";
    public String msg="";
    public String sub="";
     public String time="";
   
    
    
    
       public void    insert() throws
             
      ClassNotFoundException,SQLException
    {
            Class.forName("com.mysql.jdbc.Driver");
         // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?zeroDateTimeBehavior=convertToNull [root on Default schema]")
           Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
           PreparedStatement  pstmt=con.prepareStatement("{call insmail(?,?,?,?,?)}");
         // pstmt.setString(1,time); 
             pstmt.setString(1,to);  
             pstmt.setString(2,by); 
             pstmt.setString(3,msg);
             pstmt.setString(4,sub);
              pstmt.setString(5,time);
           pstmt.executeUpdate();        
    }
    
    
       
       
          public ResultSet sentmail()throws
             
      ClassNotFoundException,SQLException
    {
    
          Class.forName("com.mysql.jdbc.Driver");
     
          Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
         PreparedStatement prst=con.prepareStatement("{call  getsmail(?)}");
        prst.setString(1,by);  
         ResultSet rs=prst.executeQuery();
          return rs;
    }
            
       
    
    
    
    
}
