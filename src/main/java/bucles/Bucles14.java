/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 14: Escribe un programa que pida una base
 * y un exponente (entero positivo) y que calcule la potencia.
 *
 */
public class Bucles14 {

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
                
            }
        }
        System.out.println("El resultado de elevar " + base + " al exponente " + exponente + " es: " + resultado);
    }
}
