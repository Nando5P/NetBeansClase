package tema4;

import java.util.Scanner;

public class FPFt4e1g {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
*Ejercicio 1: Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
*g. Decir si la cadena es igual a la cadena “hola”.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String();
        System.out.println("Introduce una palabra de 4 letras: ");
        cadena = teclado.nextLine();
        System.out.println("Tu palabra elegida es: " + cadena);
        
        if (cadena.equalsIgnoreCase("hola")) {
            System.out.println("Las dos palabras son iguales");
        } else {
            System.out.println("Las palabras no son iguales");
        }
    }
}
