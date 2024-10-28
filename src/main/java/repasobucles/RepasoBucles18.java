package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Repaso Bules ejercicio 18 :
 *
 */
public class RepasoBucles18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bucle While: ");

        int num = 100;

        while (num <= 200) {

            if ((num >= 110) && (num <= 180)) {
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
            if ((num >= 110) && (num <= 180)) {
                continue;
            }

            System.out.print(num + ", ");

        }

    }
}
