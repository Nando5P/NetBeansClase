package tema4;

import java.util.Scanner;

public class FPFt4e1k {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1: Decir si la primera posición de la cadena es igual a la última
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String(); // Ejemplo de cadena hexadecimal
        System.out.println("Escribe tu frase: ");
        cadena = teclado.nextLine();
        
        if (!cadena.isEmpty()) {
            boolean sonIguales = cadena.charAt(0) == cadena.charAt(cadena.length() - 1);
            System.out.println("Primera y ultima posicion son iguales? " + sonIguales);
        } else {
            System.out.println("La cadena está vacía.");
        }

    }
}
