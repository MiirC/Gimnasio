/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteABM;

import static PaqueteABM.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MiirC
 */
public class Modificaciones 
{
    public static boolean modificar(Clientes cliente)
    {
        PreparedStatement ps = null;
        Connection con  = getConexion();
        String sql= "UPDATE cliente SET nombre=? WHERE id= ?";
        try
        {
            ps= con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setInt(2, cliente.getIdCliente());
            ps.execute();
            
            return true;         
        }
        catch(SQLException e)
        {
            System.err.println(e);
          
            return false;
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(SQLException e)
            {
                System.err.println(e);
            }
        }
    
    }
    
}
