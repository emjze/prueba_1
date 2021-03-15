/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciontecnicacentaya;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardo edd
 */
public class EvaluacionTecnicaCentaya  {

 

   
    
    public static void main(String[] args) {
    
     Mensajes miMensaje = new Mensajes("El resultado de la suma es:","El resultado de la resta es:","El resultado de la multiplicacion es","El resultado de la divicion es:");

    
    int num1 ,num2;
    int suma,resta,multiplicacion;
    double divicion;
    String dato;  
    char operacion ;
            
    do{
       
        try{
            
        num1 =Integer.parseInt(JOptionPane.showInputDialog("Captura el primer número"));
        num2 =Integer.parseInt(JOptionPane.showInputDialog("Captura el segundo número"));
          dato = JOptionPane.showInputDialog("Dijite una operacion  \n "  + "\n *" + "\n /" +"\n +"+"\n-" );
        
        operacion= dato.charAt(0);
       
        switch( operacion){
        
            case'+': suma = num1 + num2;
           
            
            JOptionPane.showMessageDialog(null,suma,miMensaje.mensaje_s,JOptionPane.INFORMATION_MESSAGE);
            break;
            
            case'-': resta = num1 - num2;
            JOptionPane.showMessageDialog(null,resta,miMensaje.mensaje_r,JOptionPane.INFORMATION_MESSAGE);
            break;
            
            case'*': multiplicacion = num1 * num2;
            JOptionPane.showMessageDialog(null,multiplicacion,miMensaje.mensaje_m,JOptionPane.INFORMATION_MESSAGE);
            break;
            
            case'/': 
            if(num2==0){
            JOptionPane.showMessageDialog(null,"operacion invalida");
            }else{
            divicion = num1 / num2;
            JOptionPane.showMessageDialog(null,divicion,miMensaje.mensaje_d,JOptionPane.INFORMATION_MESSAGE);
            }
 
            break;

        }// final swtch
       
        }catch(NumberFormatException ex){
           
        JOptionPane.showMessageDialog(null, "Ingrese valores validos");
       
        }
                break;
        
        }while (operacion !=0);
       
    }
}// finla de Evaluacion tecnica