package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Repaso Bules ejercicio 17 :
 *
 */
public class RepasoBucles17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bucle While: ");

        int num = 100;

        while (num <= 200) {

            if ((num >= 130) && (num <= 140)) {
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
            if ((num >= 130) && (num <= 140)) {
                continue;
            }

            System.out.print(num + ", ");

        }

    }
}
