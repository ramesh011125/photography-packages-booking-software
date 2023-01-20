/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class dbconnect {
    public static Connection connect()
    {
    Connection conn=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_db","root","");
       }
       catch (Exception e){
           System.out.println(e);
       }
       return conn;
    }
   
}
