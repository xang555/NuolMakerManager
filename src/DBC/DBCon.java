package DBC;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class DBCon
{
    public static Connection getConnection()
    {
        try 
        {
            String url="jdbc:mysql://localhost/nuolmaker";
            String user="root";
            String pass="onepiece";
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);
            return DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    //    e.printStackTrace(); 
        return null;
        
    }
}