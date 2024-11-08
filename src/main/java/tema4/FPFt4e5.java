package tema4;

import java.util.Random;
import java.util.Scanner;

public class FPFt4e5 {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 5: Realiza un programa que muestre una contraseña generada aleatoriamente 
teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre 
la ‘a’ y la ‘j’ pero sin letras repetidas.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Random random = new Random();

        // Generar una longitud aleatoria entre 5 y 10
        int longitud = random.nextInt(6) + 5; // (0 a 5) + 5 -> rango [5, 10]

        // Cadena con las letras posibles entre 'a' y 'j'
        String letrasDisponibles = "abcdefghij";

        StringBuilder contrasena = new StringBuilder(longitud);

        // Crear un arreglo para marcar las letras usadas
        boolean[] letrasUsadas = new boolean[10]; // Hay 10 letras entre 'a' y 'j'

        // Generar la contraseña
        for (int i = 0; i < longitud; i++) {
            char letra;
            int indice;

            // Asegurarse de que la letra no se repita
            do {
                // Generar un índice aleatorio para seleccionar una letra
                indice = random.nextInt(10);
                letra = letrasDisponibles.charAt(indice);
            } while (letrasUsadas[indice]); // Repetir si la letra ya ha sido usada

            // Añadir la letra a la contraseña
            contrasena.append(letra);
            // Marcar esta letra como utilizada
            letrasUsadas[indice] = true;
        }

        System.out.println("Contraseña generada: " + contrasena);
    }
}