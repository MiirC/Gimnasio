/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteClases;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

/**
 *
 * @author MiirC
 */
public class MetodosVarios 
{
    public void Aceptar()
    {
        
    }
    
    // Método que permite cancelar la acción y retomar a la pestaña de Consultas
    public void Cancelar()
    {
        // Limpia JTextField
        
        //Pone el foco en la pestaña Consultas
        
    }
    
    public void Limpiar(JFormattedTextField[] Texto)
    {
       for(int i = 0; i<Texto.length ;i++)
       {
          Texto[i].setText("");
       }
           
    }
    
    
    // Método que permite salir del programa y cierra la ventana
    public void Salir(JFrame rootPane)
    {
        rootPane.
    }
    
}
