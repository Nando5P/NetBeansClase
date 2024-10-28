/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 15: Escribe un programa que dados dos números, uno real (base) y un entero positivo 
(exponente), saque por pantalla todas las potencias con base el numero dado y exponentes 
entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por
ejemplo, si introducimos el 2 y el 5, se deberán mostrar 21, 22, 23, 24 y 25.
 *
 */
public class Bucles15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int base, exponente;
        int resultado = 1;

        System.out.println("Introduce la base: ");
        base = teclado.nextInt();

        System.out.println("Introduce el exponente: ");
        exponente = teclado.nextInt();

        if ((exponente <= 0)) {
            System.out.println("Error, el exponente debe ser un entero positivo.");
        } else {
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
                System.out.println("El resultado de elevar " + base + " al exponente " + i + " es: " + resultado);
                
            }
        }
       
    }
}
