package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Repaso Bules ejercicio 16 :
 *
 */
public class RepasoBucles16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bucle While: ");

        int num = 100;
        int num2 = 200;

        while (num <= num2) {
            if (num == num2) {
                System.out.println(num);
            } else {

                System.out.print(num + ", " + num2);

            }
            if (num < num2) {
                System.out.print(", ");
            }
            num+=2;
            num2-=2;
        }

        System.out.println("\n");
        System.out.println("Bucle For: ");

        num = 100;
        num2 = 200;

        for (num = 100; num <= 150; num+=2) {
             if (num == num2) {
                System.out.println(num);
            } else {

                System.out.print(num + ", " + num2);

            }
            if (num < num2) {
                System.out.print(", ");
            }
            num2-=2;
        }

    }
}
