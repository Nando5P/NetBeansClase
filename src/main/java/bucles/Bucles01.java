/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 1: Muestra los números múltiplos de 5 de 0
 * a 100 utilizando un bucle for
 */
public class Bucles01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 5; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
