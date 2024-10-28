package tema4;

import java.util.Scanner;

public class FPFt4e1d {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
*Ejercicio 1: Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
*d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.  
*/
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String();
        System.out.println("Introduce texto que con el que quieras trabajar: ");
        cadena = teclado.nextLine();
        System.out.println("Tu frase elegida es: " + cadena);

      String cadena2 = cadena.substring(3,cadena.length());
      
       if ((cadena2.contains("x")) || cadena2.contains("X")) {
            System.out.println("Contiene alguna X");
            
        } else {System.out.println("No hay X en el texto");
        }
      
      
    }
}
