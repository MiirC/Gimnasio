/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteABM;

/**
 *
 * @author MiirC
 */
public class Clientes 
{
    private int idCliente;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private int telefono;

    public int getIdCliente() 
    {
        return idCliente;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setIdCliente(int idCliente_) 
    {
        idCliente = idCliente_;
    }

    public void setNombre(String nombre_) 
    {
        nombre = nombre_;
    }

    
    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido_) 
    {
        apellido = apellido_;
    }
    
    public int getDni() 
    {
        return dni;
    }

    public void setDni(int dni_) 
    {
        dni = dni_;
    }
    
    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion_) 
    {
        direccion = direccion_;
    }
    
    public int getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(int telefono_) 
    {
        telefono = telefono_;
    }
}
