package tema4;

import java.util.Scanner;

public class FPFt4e1i {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1: Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena 
* es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de 
* la A a F.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadenaHex = new String(); // Ejemplo de cadena hexadecimal
        System.out.println("Escribe tu numero exadecimal: ");
        cadenaHex = teclado.nextLine();
        int numeroDecimal = Integer.parseInt(cadenaHex, 16);

        System.out.println("Tu numero es: " + cadenaHex);
        System.out.println("El número decimal es: " + numeroDecimal);

    }
}
