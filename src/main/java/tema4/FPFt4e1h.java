package tema4;

import java.util.Scanner;

public class FPFt4e1h {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
*Ejercicio 1: Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
*h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena 
es un número, esto es, contiene solo dígitos decimales (del 0 a 9).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String();
        System.out.println("Introduce texto que con el que quieras trabajar: ");
        cadena = teclado.nextLine();
        System.out.println("Tu frase elegida es: " + cadena);

        int numero = Integer.parseInt(cadena);
        System.out.println("Numero resultante: " + numero);

    }
}
