package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Repaso Bules ejercicio 14 :
 *
 */
public class RepasoBucles14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bucle While: ");

        int num = 100;
        int num2 = 120;

        while (num <= num2) {
            if (num == num2) {
                System.out.println(num);
            } else {

                System.out.print(num + ", " + num2);

            }
            if (num < num2) {
                System.out.print(", ");
            }
            num++;
            num2--;
        }

        System.out.println("\n");
        System.out.println("Bucle For: ");

        num = 100;
        num2 = 120;

        for (num = 100; num <= 110; num++) {
             if (num == num2) {
                System.out.println(num);
            } else {

                System.out.print(num + ", " + num2);

            }
            if (num < num2) {
                System.out.print(", ");
            }
            num2--;
        }

    }
}
