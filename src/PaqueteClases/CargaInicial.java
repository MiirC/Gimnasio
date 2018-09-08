/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteClases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MiirC
 */
public class CargaInicial 
{
    
    // Método que permite obtener el formato día/mes/año de la fecha actual del sistema
    public String FechaActual()
    {
        Date fechaActual = new Date();
        
        String formato = new SimpleDateFormat("dd/MM/yyyy").format(fechaActual);
        
        return formato;
    }
    
}
