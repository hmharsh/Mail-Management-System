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
public class contact {
    public String id="";
   public String name="harshit";
    public String email="";
    public String group="";
public String newgrpnam="";
public String check="1";
 public String name2="harshit";

       public ResultSet getall()throws
             
      ClassNotFoundException,SQLException
    {
          Class.forName("com.mysql.jdbc.Driver");
     
          Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
         PreparedStatement prst=con.prepareStatement("{call getall()}");
         // prst.setString(1,id);   
          ResultSet rs=prst.executeQuery();
          return rs;

    }
    
       
       
       
      
       
         public ResultSet   getgrpnam()throws
             
      ClassNotFoundException,SQLException
    {
          Class.forName("com.mysql.jdbc.Driver");
     
          Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
         PreparedStatement prst=con.prepareStatement("{call getgrpnam()}");
          ResultSet rs=prst.executeQuery();
          return rs;

    }
         
        
           public ResultSet    getoneset()throws
             
      ClassNotFoundException,SQLException
    {
          Class.forName("com.mysql.jdbc.Driver");
     
          Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
         PreparedStatement prst=con.prepareStatement("{call  getal()}");
         
          ResultSet rs=prst.executeQuery();
          return rs;

    }
         
                    
      public void    insertgrp() throws
             
      ClassNotFoundException,SQLException
    {
          Class.forName("com.mysql.jdbc.Driver");
       
      // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?zeroDateTimeBehavior=convertToNull [root on Default schema]")
           Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
           PreparedStatement  pstmt=con.prepareStatement("{call insertgrp(?)}");
           pstmt.setString(1,newgrpnam);        
           pstmt.executeUpdate();
         
 
         
    }
      
      
         public void    update() throws
             
      ClassNotFoundException,SQLException
    {
          Class.forName("com.mysql.jdbc.Driver");
       
      // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?zeroDateTimeBehavior=convertToNull [root on Default schema]")
           Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
           PreparedStatement  pstmt=con.prepareStatement("{call updatecon(?,?,?,?)}");
           pstmt.setString(1,id);   
           pstmt.setString(2,name);  
           pstmt.setString(3,email);
           pstmt.setString(4,group);
                  
           pstmt.executeUpdate();
         
    }
  
   public void insert()throws
             
      ClassNotFoundException,SQLException
    {
        
    
        Class.forName("com.mysql.jdbc.Driver");
       
      // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?zeroDateTimeBehavior=convertToNull [root on Default schema]")
           Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
           PreparedStatement  pstmt=con.prepareStatement("{call prcontact(?,?,?,?)}");
           pstmt.setString(1,id);   
           pstmt.setString(2,name);  
           pstmt.setString(3,email);
           pstmt.setString(4,group);
                  
           pstmt.executeUpdate();
         
    }
  

}




