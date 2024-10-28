package tema4;

import java.util.Scanner;

public class FPFt4e1f {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
*Ejercicio 1: Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
*f. Crear una cadena formada por las 5 ultimas posiciones de la cadena.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String();
        System.out.println("Introduce texto que con el que quieras trabajar: ");
        cadena = teclado.nextLine();
        System.out.println("Tu frase elegida es: " + cadena);

        String cadena2 = cadena.substring(cadena.length() - 5);

        System.out.println(cadena2);

    }
}
