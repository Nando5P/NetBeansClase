package tema4;

import java.util.Scanner;

public class FPFt4e1j {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1: Si se encuentra con en su interior con “prueva” sustituir por “prueba”
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String(); // Ejemplo de cadena hexadecimal
        System.out.println("Escribe tu frase: ");
        cadena = teclado.nextLine();
        
        cadena = cadena.replace("prueva", "prueba");
        
        System.out.println("Cadena corregida: " + cadena);

    }
}