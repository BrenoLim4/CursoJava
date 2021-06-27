
package br.com.abc.javacore.tJDBC.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoFactory {
    //java.sql = connection, Statment, ResulSet
    //DriverManager
    public static Connection getConexao(){
        String url ="jdbc:mysql://localhost:3306/agencia";
        String user ="root";
        String password="";
        try {
            //Connection connection = DriverManager.getConnection(url,user,password);  
            return DriverManager.getConnection(url,user,password) ;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static void close(Connection connection){
        try {
            if(connection != null)
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void close(Connection connection, Statement stat){
        close(connection);
        try {
            if(stat != null)
                stat.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
