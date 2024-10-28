package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Repaso Bules ejercicio 19 :
 *
 */
public class RepasoBucles19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bucle While: ");

        int num = 100;

        while (num <= 200) {

            if ((num % 10 == 0)) {
                num++;
                continue;
            }
            System.out.print(num + ", ");
            num++;
        }

        System.out.println("\n");
        System.out.println("Bucle For: ");

        num = 100;

        for (num = 100; num <= 200; num++) {
            if ((num % 10 == 0)) {
                continue;
            }

            System.out.print(num + ", ");

        }

    }
}
