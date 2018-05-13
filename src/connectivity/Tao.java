
package connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tao {
    static Connection con;
    PreparedStatement ps;
    public int insert (Dao d)
    { 
        int n =0;
        try{
            con = Factory.createConnection();
            ps =con.prepareStatement("insert into tesst values(?,?,?)");
            ps.setInt(1,0);
            ps.setString(2, d.getName());
            ps.setString(3, d.getPassword());
            n = ps.executeUpdate();
            con.close();
            return n;
        }
        catch(SQLException e)
        {
            Logger.getLogger(Tao.class.getName()).log(Level.SEVERE, null, e);
            return n;
        }
    }
    public int delete(Dao a) 
    { 
        int n = 0;
    try{
        con = (com.mysql.jdbc.Connection) Factory.createConnection();
            
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("delete from tesst where Name = ?");
            ps.setString(1, a.getName());
            n = ps.executeUpdate();
            con.close();
            return n;
    }
    catch (SQLException ex) {
            Logger.getLogger(Tao.class.getName()).log(Level.SEVERE, null, ex);
            return n;
        }
        
    }
    public int update(Dao a)
    { 
        int n = 0;
    try{
        con = (com.mysql.jdbc.Connection) Factory.createConnection();
            
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("update  tesst set name = ?,password = ? where name = ?");
            ps.setString(3, a.getName());
            ps.setString(2,a.getPassword());
            ps.setString(1,a.getSecname());
            n = ps.executeUpdate();
            con.close();
            return n;
            
    }
    catch (SQLException ex) {
            Logger.getLogger(Tao.class.getName()).log(Level.SEVERE, null, ex);
            return n;
        }
    
        
    }
     public void ShowData() 
    { 
        ResultSet rs;
        
    try{
        con = (com.mysql.jdbc.Connection) Factory.createConnection();
            
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement("select * from tesst");
            
            rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.print(rs.getInt("id")+"\t");
                System.out.print(rs.getString("name")+"\t");
                System.out.print(rs.getString("password")+"\t");
            }
            con.close();
    }
    catch (SQLException ex) {
            Logger.getLogger(Tao.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        
    }
    public static void main(String[] args) {
        {
            Tao t = new Tao();
            Scanner sc = new Scanner(System.in);
             System.out.println("press 1 for insert ");
          System.out.println("press 2 for delete ");
          System.out.println("press 3 for update");
          System.out.println("press 4 for show table");
        int s = sc.nextInt() ;
        
        switch(s){
            case 1:
            {
                 System.out.println("enter name");
               String name = sc.next();
               System.out.println("Enter password ");
               String password = sc.next();
               Dao a = new Dao(password,name);
                 System.out.println(t.insert(a));
                 break;
            }
            case 2:
            {
                System.out.println("enter name");
               String name = sc.nextLine();
               Dao a = new Dao(name);
                System.out.println(t.delete(a));
                break;
            }
            case 3:
            {
                System.out.println("enter name");
               String name = sc.next();
               System.out.println("enter new name");
               String secname = sc.next();
               System.out.println("enter password");
               String password = sc.next();
               Dao a = new Dao(password,name,secname);
                System.out.println(t.update(a));
                sc.nextLine();
            }
            case 4:
            {
                
                t.ShowData();
                break;
            }
                
                
            default:
                {
                    System.out.print("invalid input");
                }
        }
        }
    }
}
