package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Repaso Bules ejercicio 21 :
 *
 */
public class RepasoBucles21c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int num = teclado.nextInt();

        if ((num >= 1) && (num <= 10)) {
            System.out.println("El numero está entre 1 y 10");
            if (num % 2 == 0) {
                System.out.println("Y es par");
            } else {
                System.out.println("y no es par");
            }
        } else {
            System.out.println("No está entre 1 y 10");
        }

    }
}
