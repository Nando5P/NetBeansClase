package tema4;

import java.util.Scanner;

public class FPFt4e1c {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
*Ejercicio 1: Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente: 
*c. Decir si la cadena tiene más de 10 posiciones. 
*/
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String();
        System.out.println("Introduce texto que con el que quieras trabajar: ");
        cadena = teclado.nextLine();
        System.out.println("Tu frase elegida es: " + cadena);

      int longitud = cadena.length();
        if (longitud >=10) {
            System.out.println("El texto tiene mas de 10 caracteres.");
            
        } else {
            System.out.println("Hay menos de 10 caracteres.");
        }
    }
}
