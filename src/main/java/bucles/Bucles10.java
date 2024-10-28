/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 10: Escribe un programa que calcule la
 * media de un conjunto de números positivos introducidos por teclado. A priori,
 * el programa no sabe cuántos números se introducirán. El usuario indicará que
 * ha terminado de introducir los datos cuando meta un número negativo
 */
public class Bucles10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        double media;
        int suma = 0;
        int cantidad = 0;
        boolean positivo = true;

        System.out.println("Introduciremos numeros positivos para hacer la media (un numero negativo cierra el programa");
        do {
            System.out.println("Introduce numero: ");
            num = teclado.nextInt();
            if (num < 0) {
                System.out.println("Cerramos programa");
                positivo = false;
            } else {
                suma += num;
                cantidad++;
            }

        } while (positivo);

        media = (suma / cantidad);
        System.out.println("La media es: " + media);
    }
}
