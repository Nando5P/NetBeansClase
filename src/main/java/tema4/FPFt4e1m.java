package tema4;

import java.util.Scanner;

public class FPFt4e1m {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1: Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String(); // Ejemplo de cadena hexadecimal
        System.out.println("Escribe tu frase: ");
        cadena = teclado.nextLine();

        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();

        String cadenaInverida = new StringBuilder(cadenaLimpia).reverse().toString();

        if (cadenaLimpia.equals(cadenaInverida)) {
            System.out.println("La cadena ES un PALINDROMO");
        } else {
            System.out.println("La cadena NO es un PALINDROMO");
        }
    }

}
