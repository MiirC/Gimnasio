/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteClases;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author MiirC
 */
public class Validaciones 
{
    // Método que permite verificar si los datos ingresados son números
    public void SoloNumeros(KeyEvent evt, JFrame rootPane)
    {
        char validar = evt.getKeyChar();
       
        if(Character.isLetter(validar))
        {
            Toolkit.getDefaultToolkit().beep(); // Emite un sonido
           
            evt.consume();
           
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo números"); // Muestra un mensaje de error
          
        }
        
    }
    
    // Método que permite verificar si los datos ingresados son números
    public void SoloLetras(KeyEvent evt, JFrame rootPane)
    {
        char validar = evt.getKeyChar();
       
        if(Character.isDigit(validar))
        {
            Toolkit.getDefaultToolkit().beep(); // Emite un sonido
           
            evt.consume();
           
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras"); // Muestra un mensaje de error
          
        }
        
    }
    
    
    public void CamposVacios(JFrame rootPane)
    {
        // Recorrer controles en busca de JTextField
       // foreach()
        {
            // Si JTextField está vacío muestra el mensaje
        }
    }
    
}
