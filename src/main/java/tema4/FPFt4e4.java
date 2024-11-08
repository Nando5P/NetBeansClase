package tema4;

import java.util.Random;
import java.util.Scanner;

public class FPFt4e4 {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 4: Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las 
* siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la ‘a’ y la ‘j’. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Random random = new Random();

        // Generar una longitud aleatoria entre 5 y 10
        int longitud = random.nextInt(6) + 5; // (0 a 5) + 5 -> rango [5, 10]

        StringBuilder contrasena = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            // Generar un carácter aleatorio entre 'a' y 'j'
            char letra = (char) (random.nextInt(10) + 'a'); // (0 a 9) + 'a'
            contrasena.append(letra);
        }

        System.out.println("Contraseña generada: " + contrasena);
    }
}
