/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteABM;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.sun.istack.internal.logging.Logger;

/**
 *
 * @author MiirC
 */
public class Conexion 
{
    private static final String BD ="bd_Olimpo";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD + "?useSSL=false";
    private static Connection con = null;
    
    
    public static Connection getConexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USUARIO,CONTRASENIA);
        }
        catch(SQLException e)
        {
            System.err.println(e);
        }
        catch(ClassNotFoundException ex)
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
