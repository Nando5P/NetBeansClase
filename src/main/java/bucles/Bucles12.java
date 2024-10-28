/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 12: Escribe un programa que muestre los n
 * primeros términos de la serie de Fibonacci. El primer término de la serie de
 * Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8,
 * 13, 21, 34, 55, 89, 144… El número n se debe introducir por teclado.
 */
public class Bucles12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a;
        int ant = 0, ant2 = 1, num;

        System.out.print("Introduce la cantidad de numeros de la serie de Fibonacci que quieras saber: ");
        a = teclado.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println(ant);

            num = ant + ant2;

            ant = ant2;
            ant2 = num;
        }
    }
}
