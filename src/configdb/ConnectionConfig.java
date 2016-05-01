/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configdb;

/**
 *
 * @author xang-
 */
public interface ConnectionConfig {
    
    public static final String dbName="nuolmaker";
     public static final String Username="root";
      public static final String Password="";
     public static final String ConnectUri="jdbc:mysql://localhost:3306/"+dbName;
 
}
