package tema4;

import java.util.Scanner;

public class FPFt4e1l {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1: Decir cuántos dígitos numéricos hay en la cadena. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        String cadena = new String(); // Ejemplo de cadena hexadecimal
        System.out.println("Escribe tu frase: ");
        cadena = teclado.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Numedo de digitos: " + contador);
    }

}