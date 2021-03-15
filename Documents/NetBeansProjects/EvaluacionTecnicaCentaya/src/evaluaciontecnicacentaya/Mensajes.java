/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciontecnicacentaya;

/**
 *
 * @author eduardo edd
 */
public class Mensajes {

String mensaje_s;
String mensaje_r;
String mensaje_m;
String mensaje_d;
String mensaje_e;
String mensaje_error_suma;

//constructor 
public Mensajes(String mensaje_s, String mensaje_r,String mensaje_m,String mensaje_d ){

    this.mensaje_s = mensaje_s;
    this.mensaje_r = mensaje_r;
    this.mensaje_r = mensaje_r;
    this.mensaje_d = mensaje_d;
    
    
}    
public Mensajes(String mensaje_e, String mensaje_erro_suma ){

    this.mensaje_e = mensaje_e; 
    this.mensaje_error_suma=mensaje_erro_suma;
}   



}// finalde Mensaje
