package DBC;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class TestConnection{
    public static void main(String[]args)
    {
        try{
          //  Connection c=DBCon.getConnection()
           Connection c=DBCon.getConnection();
           if(c!=null)
                   {
               JOptionPane.showMessageDialog(null, "pass");
               
           }
           else{
               JOptionPane.showMessageDialog(null,"Fail");
           }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}