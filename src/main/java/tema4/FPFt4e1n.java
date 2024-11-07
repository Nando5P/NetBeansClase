package tema4;

import java.util.Scanner;

public class FPFt4e1n {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1: Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones 
intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = new String(); // Ejemplo de cadena hexadecimal
        System.out.println("Escribe tu frase: ");
        cadena = teclado.nextLine();

        if (cadena.length() < 2) {
            System.out.println("La cadena resultante es: " + cadena);
        } else {
            String cadenaMod = cadena.charAt(cadena.length() - 1)
                    + cadena.substring(1, cadena.length() - 1)
                    + cadena.charAt(0);
            System.out.println("La cadena resultante es: " + cadenaMod);
        }
    }

}
