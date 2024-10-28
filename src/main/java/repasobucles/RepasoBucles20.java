package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Repaso Bules ejercicio 20 :
 *
 */
public class RepasoBucles20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bucle While: ");

        int num = 100;
        int suma = 0;

        while (suma <= 1500) {

            if ((num % 10 == 0)) {
                num++;
                continue;
            }
            System.out.print(num + ", ");
            suma += num;
            num++;
        }

        System.out.println("\n");
        System.out.println("Bucle For: ");

        num = 100;
        suma = 0;
        for (num = 100; num <= 7000; num++) {
            if ((num % 10 == 0)) {
                continue;
            }

            System.out.print(num + ", ");
suma+=num;
if (suma > 1500)break;
        }

    }
}
