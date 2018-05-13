/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Abhishek
 */
public class Factory {
    static Connection con;
    public static Connection createConnection() 
    {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
           
            
        }
        catch(ClassNotFoundException |SQLException e)
        {
            
            System.out.println(e);
        }
        return con;
    }
    
    
}
