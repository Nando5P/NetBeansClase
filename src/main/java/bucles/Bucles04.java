/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 4: Muestra los números del 320 al 160,
 * contando de 20 en 20 hacia atrás utilizando un bucle for.
 */
public class Bucles04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 320; i >= 160; i -= 20) {
            System.out.println(i);
        }
    }
}
