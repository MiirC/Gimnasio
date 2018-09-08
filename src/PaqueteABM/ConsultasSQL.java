/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteABM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MiirC
 */
public class ConsultasSQL extends Conexion
{
    public static boolean agregar(Clientes cliente)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO cliente(nombre, apellido, dni, direccion, telefono) values (?,?,?,?,?)";
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getNombre());
            ps.setString(5, cliente.getNombre());
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
    
    public static boolean eliminar(Clientes cliente){
      PreparedStatement ps= null;
      Connection con  = getConexion();
      String sql= "DELETE FROM persona WHERE id= ?";
      try{
          ps= con.prepareStatement(sql);
          ps.setInt(1, cliente.getIdCliente());
          ps.execute();
          return true;         
      }catch(SQLException e)
      {
          System.err.println(e);
          return false;
      }
      finally{
          try{
              con.close();
          }
          catch(SQLException e)
          {
              System.err.println(e);
          }
      }
    
    }

    public static boolean buscar(Clientes cliente){
      PreparedStatement ps= null;
      ResultSet rs = null;
      Connection con  = getConexion(); 
      String sql= "SELECT * FROM persona WHERE DNI= ?";
      try{
          ps= con.prepareStatement(sql);
          //ps.setInt(1, cliente.getDni());
          rs = ps.executeQuery();
          if(rs.next()){
              cliente.setIdCliente(Integer.parseInt(rs.getString("id")));
              cliente.setNombre(rs.getString("nombre"));
              //persona.setApellido(rs.getString("apellido"));
              //persona.setDni(Integer.parseInt(rs.getString("dni")));
              return true;
          }       
          return false;         
      }catch(SQLException e)
      {
          System.err.println(e);
          return false;
      }
      finally{
          try{
              con.close();
          }
          catch(SQLException e)
          {
              System.err.println(e);
          }
      }
    
    }

    

    
}
