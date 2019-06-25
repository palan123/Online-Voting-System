/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    
    static String url="jdbc:mysql://localhost:3306/Voter";
    static String user="Shubham";
    static String password="Bestrong@25";
    
    
    public static Connection connectDb()
    {
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
}
