/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBC;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author xang-
 */
public class connectnuolmakerdb {
    
    
 public Connection getconnection(){
     
     Connection con=null;
     try {
         con=(Connection) 
                 DriverManager.getConnection(configdb.ConnectionConfig.ConnectUri, configdb.ConnectionConfig.Username, configdb.ConnectionConfig.Password);
    
     return con;
     } catch (SQLException ex) {
         ex.printStackTrace();
         return null;
     }
  
 }//get connection db nuolmaker
    
     
    
}//class connection db
