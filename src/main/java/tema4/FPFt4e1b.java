package tema4;

import java.util.Scanner;

public class FPFt4e1b {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
*Ejercicio 1: Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
*b. Decir si en la cadena aparece el carácter ‘x’. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String();
        System.out.println("Introduce texto que con el que quieras trabajar: ");
        cadena = teclado.nextLine();
        System.out.println("Tu frase elegida es: " + cadena);

        if ((cadena.contains("x")) || cadena.contains("X")) {
            System.out.println("Contiene alguna X");
            
        } else {System.out.println("No hay X en el texto");
        }
    }
}
