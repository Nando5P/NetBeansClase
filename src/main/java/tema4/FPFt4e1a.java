package tema4;

import java.util.Scanner;

public class FPFt4e1a {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 1:Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.
     */

    public static void main(String[] args) {
        
        System.out.println("Introduce texto que con el que quieras trabajar: ");
        String cadena = "Se mostraran las letras en Mayuscula o en Minusculas";
        System.out.println(cadena);
        
        String cadenaM = cadena.toUpperCase();
        String cadenam = cadena.toLowerCase();
        
        System.out.println("Mayusculas: " + cadenaM);
        System.out.println("Minusculas: " + cadenam);
    }
}
