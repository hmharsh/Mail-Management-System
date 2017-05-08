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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Harshit
 */
public class javaclass extends HttpServlet {
      public String clname="";
        public String cluname="";
         public String clpass="";
        
        
           public String clemail="";
       public String clcontact="" ;
        public String clusn="";
         public String clpwd="";
       
       
      
       
     public void insert()throws
             
      ClassNotFoundException,SQLException
    {
        
    
        Class.forName("com.mysql.jdbc.Driver");
       
      // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?zeroDateTimeBehavior=convertToNull [root on Default schema]")
           Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
           PreparedStatement  pstmt=con.prepareStatement("{call prsignup(?,?,?,?,?)}");
           pstmt.setString(1,clname);   
           pstmt.setString(2,cluname);  
           pstmt.setString(3,clcontact);
           pstmt.setString(4,clemail);
           pstmt.setString(5,clpass);         
           pstmt.executeUpdate();
         
    }
  
      public ResultSet check() throws SQLException, ClassNotFoundException
      {
    
      Class.forName("com.mysql.jdbc.Driver");
     
          Connection con=DriverManager.getConnection("jdbc:mysql:///mmsdb","root","123456"); 
         PreparedStatement prst=con.prepareStatement("{call prcheck()}");




          ResultSet rs=prst.executeQuery();
          return rs;
      }
  
}
